/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea20;
import java.io.*;
import java.util.*;

/**
 *
 * @author eduardo
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        String allNumbers = "";
        for (int i = 0; i < numbers.length; i++) allNumbers += (i + 1) + "\n";
        
        PrintWriter pw;
        try {
            pw = new PrintWriter("./src/main/java/Tarea20/files/littleNumbers.txt");
            pw.print(allNumbers); //Overwriting mode
            System.out.print("The ten first numbers have been writed");
            pw.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("There is one error: " + e.getMessage());
        }
    }
    
}
