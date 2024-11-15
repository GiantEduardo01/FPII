/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea18;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author eduardo
 */
public class Exercise01 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public Exercise01() {
        this.setSize(400, 600);
        this.setTitle("Factorial Calculator");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createContent();
        this.setVisible(true);
    }
    
    private void createContent() {
        JLabel number = new JLabel("Number: ");
        JTextField enterNumber = new JTextField(5);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    }    
}
