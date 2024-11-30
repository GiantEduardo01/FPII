/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica20;

/**
 * If you specifically want to capture the newline character, Scanner.nextLine() alone won’t do it. Instead, you might need to read the input in raw form, such as with BufferedReader or using System.in.read().
 * @author eduardo
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Example01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter some lines of text (EXIT to finish)");
        String text = "", line = "";
        final String FINISH = "EXIT";
        boolean exit = false;
        do {
            line = scann.nextLine();
            exit = line.equalsIgnoreCase(FINISH);
            if (!exit) text += line + "\n"; //Scanner method don't capture newline character "\n", we add the return car
            
        } while (!exit);
        
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter("./src/main/java/Practica20/Files/outputOne.txt", true));
            pw.print(text);
            System.out.println("The text has been writed in the file!!");
            pw.close();
        }
        
        catch (FileNotFoundException e) {
            System.out.println("There is an error: " + e.getMessage());
        }
        
    }
    
}
