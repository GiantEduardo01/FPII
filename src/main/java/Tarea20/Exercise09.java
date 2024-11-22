/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercise09 {
    public static void main(String[] args) {
        
        try {
            Scanner reader = new Scanner(new FileReader("./src/main/java/Tarea20/files/randomLittleNumbers.txt"));           
            System.out.println("The content of the file");
            while (reader.hasNextLine()) System.out.println(reader.nextLine());
        } 
        catch (FileNotFoundException e) {
            System.out.println("There is one error: " + e.getMessage());
        }    
    }
    
}
