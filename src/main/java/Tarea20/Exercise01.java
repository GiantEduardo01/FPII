/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea20;


import java.io.*;
/**
 *
 * @author eduardo
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String GREETING = "Hello Friends. How are you?";
        PrintWriter pw;
        try {
            pw = new PrintWriter("./src/main/java/Tarea20/files/message.txt");
            pw.println(GREETING);
            System.out.println("Greeting <<" + GREETING + ">> has been writed");
            
            pw.close();
            
        } 
        catch (FileNotFoundException e) {
            System.out.println("There is a error: " + e.getMessage());
        }
    }
    
}
