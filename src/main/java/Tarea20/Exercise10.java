/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea20;

import java.util.*;
import java.io.*;

/**
 *
 * @author eduardo
 */
public class Exercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] results = new int[10];
        readResultsOfTheFile(results);
        System.out.println(Arrays.toString(results));
    }
    
    public static void readResultsOfTheFile(int[] arr) {
        try {
            Scanner reader = new Scanner(new FileReader("./src/main/java/Tarea20/files/randomLittleNumbers.txt"));      
            int i = 0;
            while(reader.hasNextLine()) {
                arr[i] = Integer.parseInt(reader.nextLine());
                i++;
            }
            System.out.println("The ten line have been read");
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("There is one error: " + e.getMessage());
        }

    }
    

    
    
}
