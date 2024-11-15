/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea18;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.net.http.WebSocket.Listener;

/**
 *
 * @author eduardo
 */
public class ExampleWindow03 extends JFrame {

    /**
     * @param args the command line arguments
     */
    private final int WINDOW_WIDTH = 250;
    private final int WINDOW_HIGHT = 130;
    private final int COLUMNS_FIRST_TEXT_FIELD = 15;
    
    private JTextField nameField;
    private JLabel greeting;
    
    public ExampleWindow03() {
        this.setSize(WINDOW_WIDTH, WINDOW_HIGHT);
        this.setTitle("What's your name bro?");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.createContent();
        this.setVisible(true);
    }
    
    private void createContent() {
        changeIconImage();
        JLabel nameLabel = new JLabel("Name: ");
        this.nameField = new JTextField(COLUMNS_FIRST_TEXT_FIELD);
        this.greeting = new JLabel();
        
        this.add(nameLabel);
        this.add(this.nameField);
        this.add(this.greeting);
        this.nameField.addActionListener(new Listener());
    }
    
    private void changeIconImage() {
        ImageIcon image = new ImageIcon("./src/main/java/Tarea18/resources/brazzers.png");
        this.setIconImage(image.getImage());
    }
    
    //Inner class for event handling 
    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String message = "Welcome to Brazzers " + nameField.getText() + "!";
            nameField.setText("");
            greeting.setText(message);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ExampleWindow03 window = new ExampleWindow03();
    }
    
}
