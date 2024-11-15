/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea18;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author eduardo
 */
public class ExampleWindow01 extends JFrame {
    
    public ExampleWindow01() {
        this.setSize(400, 600);
        this.setTitle("This is my firts window");
        this.createContent();
        this.setVisible(true);
    }
    
    private void createContent() {
        JLabel label = new JLabel("First label of this window");
        this.add(label);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    }
}
