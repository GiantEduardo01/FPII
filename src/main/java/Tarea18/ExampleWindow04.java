/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea18;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author eduardo
 */
public class ExampleWindow04 extends JFrame {

    /**
     * @param args the command line arguments
     */
    private final int WIDTH = 550;
    private final int HEIGHT = 120;
    private JTextField enterName;
    private JLabel answer;
    
   
    public ExampleWindow04() {
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Respondiendo a tus faltas de respeto hermano");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setResizable(false); //With this option are in total seven basic options
        createContent();
        addIconImage();
        this.setVisible(true);
    }
    
    public void createContent() {
        //Three components have been created
        JLabel askName = new JLabel("¿Cuál es tu nombre?");
        JTextField enterName = new JTextField(15); //This component answers to an action event
        JLabel answer = new JLabel(); //The same 
        
        //Add attributes
        this.enterName = enterName;
        this.answer = answer;
        
        //Add three components to the Frame
        this.add(askName);
        this.add(this.enterName);
        this.add(this.answer);
        this.enterName.addActionListener(new Listener());
    }
    
    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String rpta = "Ofenderse es opcional " + enterName.getText()+ " y yo progresaré carajo";
            enterName.setText("");
            answer.setText(rpta);
        }
    }
    
    private void addIconImage() {
        ImageIcon image = new ImageIcon("./src/main/java/Tarea18/resources/ThommasShelby.jpg");
        this.setIconImage(image.getImage());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ExampleWindow04 frame = new ExampleWindow04();
    }
    
}
