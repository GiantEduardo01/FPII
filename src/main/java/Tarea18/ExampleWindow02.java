/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea18;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author eduardo
 */
public class ExampleWindow02 extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    public ExampleWindow02() {
        this.setSize(400, 600);
        this.setTitle("My first window");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //We need more information
        this.createContent();
        this.setVisible(true);
    }
    
    private void createContent() {
        JLabel label = new JLabel("This is the first label");
        this.add(label);
    }
    
    public static void main(String[] args) {
        ExampleWindow02 window = new ExampleWindow02();
        
    }
    
}
