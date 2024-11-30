/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea21;

/**
 *
 * @author eduardo
 */

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        DataOutputStream fileOut;
        final int TEXT_MARK = 0;
        try {
            System.out.print("Enter name binary file (test.dat): ");
            
            final String PATH = "./src/main/java/Tarea21/Files/";
            fileOut = new DataOutputStream(new FileOutputStream(PATH + scann.nextLine(), false)); //Append mode
            
            System.out.print("Enter the description of the file in one line: ");
            fileOut.writeChars(scann.nextLine());
            fileOut.writeChar(TEXT_MARK);
            
            System.out.print("Number of integers to store: ");
            int numRecords = scann.nextInt();
            fileOut.writeInt(numRecords);
            
            for (int i = 0; i < numRecords; i++) {
                fileOut.writeInt(i);
            }
            fileOut.close();
        }
        
        catch (Exception e) {
            System.out.println("There is a error: " + e.getMessage());
        }
    }
    
}
