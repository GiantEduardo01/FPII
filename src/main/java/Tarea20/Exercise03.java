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
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        String str = "";
        for (int i = 0; i < 10; i++) {
            int result = rand.nextInt(6) + 1;
            str += result + "\n"; 
        }
        
        FileWriter fw;
        try {
            fw = new FileWriter("./src/main/java/Tarea20/files/randomLittleNumbers.txt", false); //Overwriting mode
            fw.write(str);
            System.out.println("Random numbers have been writed in the file");
            fw.close();
        } 
        catch (Exception e) { //File writter don't catch FileNotFoundException, so we use super class Exception
            System.out.println("There is one error: " + e.getMessage()); //We can use getStackTrace() method too
        }
    }
    
}
