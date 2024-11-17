/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author eduardo
 */
public class Exercise01 extends JFrame {

    /**
     * @param args the command line arguments
     */
    private final int WIDTH = 600;
    private final int HEIGHT = 120;
    
    private JTextField enterNumber;
    private JTextField factorialField;
    private JButton button;
    private JLabel result;
    
    public Exercise01() {
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Factorial Calculator");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContent();
        addIconImage();
        this.setResizable(false);
        this.setVisible(true);
    }
    
    private void createContent() {
        JLabel numberLabel = new JLabel("Number: ");
        JTextField enterNumber = new JTextField(5);
        
        JLabel factorialLabel= new JLabel("Factorial del número: ");
        JTextField factorialField = new JTextField(15);
        factorialField.setEditable(false);
        
        JButton button = new JButton("Calcular");
        JLabel result = new JLabel("");
        
        //Add atributtes
        this.enterNumber = enterNumber;
        this.factorialField = factorialField;
        this.button = button;
        this.result = result;
        
        //Add components to frame
        this.add(numberLabel);
        this.add(this.enterNumber);
        this.add(factorialLabel);
        this.add(this.factorialField);
        this.add(this.button);
        this.add(this.result);
        this.button.addActionListener(new Listenner());
    }
    
    private class Listenner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String num = enterNumber.getText();
            String rpta = "";
            long factorial;
            
            //Answers to ae
            enterNumber.setText("");
            
            if (isNumber(num)) {
                long number = Long.parseLong(num);
                
                if (number <= 20 && number >= 0) {
                    rpta = "Factorial calculado satisfactoriamente!!";
                    factorial = factorial(number);
                    factorialField.setText(String.valueOf(factorial));
                } else {
                    if (number > 20) {
                        rpta = "No se puede calcular el factorial de un número mayor a 20!!";
                    }
                
                    if (number < 0) {
                        rpta = "No se puede calcular el factorial de un número negativo!!";
                    }
                    factorialField.setText("");
                }
            } else {
                rpta = "No se ingresó un valor numérico!!";
            }
            result.setText(rpta);
        }
        
        private long factorial(long num) {
            if (num == 0 || num == 1) {
                return 1;
            }
            return num * factorial(num - 1);
        }
        
        private boolean isNumber(String str) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (i == 0 && c == '-') continue;
                if (!Character.isDigit(c)) return false;
            }
            return true;
        }
        
    }
    
    private void addIconImage() {
        ImageIcon image = new ImageIcon("./src/main/java/Tarea18/resources/Recursive.jpeg");
        this.setIconImage(image.getImage());
    }
    
    public static void main(String[] args) {
        Exercise01 frame = new Exercise01();
    
    }    
}
