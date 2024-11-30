/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea21;


import java.io.FileInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {
        DataInputStream fileIn;
        System.out.println("Binary file (test.dat) is reading!");
        final int TEXT_MARK = 0;
        try {
            fileIn = new DataInputStream(new FileInputStream("./src/main/java/Tarea21/Files/test.dat"));
            String description = "";
            char c;
            while ( (c = fileIn.readChar()) != TEXT_MARK) {
                description += c;
            }
            
            System.out.println("The description is: " + description);
            int num = fileIn.readInt();
            System.out.println("Number of integers: " + num);
            
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                arr.add(fileIn.readInt());
            } 
            
            System.out.println("The ArrayList with the integers is: " + arr);
            fileIn.close();
        }
        catch (Exception e) {
            System.out.println("There is a error: " + e.getMessage());
        }
    }
    
}
