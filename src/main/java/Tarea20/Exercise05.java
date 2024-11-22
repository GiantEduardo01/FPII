/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea20;

/**
 *
 * @author eduardo
 */

import java.util.*;
import java.io.*;

public class Exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = scann.nextLine();
        final String PATH = "./src/main/java/Tarea20/files/";
        
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter(PATH + filename, false)); //False default value for overwriting mode 
            System.out.print("Enter something: ");
            String something = scann.nextLine();
            pw.println(something); //Overwriting
            pw.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
