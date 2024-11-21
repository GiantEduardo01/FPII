package Tarea20;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author eduardo
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class Exercise04 {
    public static void main(String[] args) {
        int[] results = new int[10];
        toRollTheDice(results);
        writeArrayInTheFile(results);
    }
    
    static void toRollTheDice(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }
    }
    
    static void writeArrayInTheFile(int[] arr) {
        String str = makeStringWithResults(arr);
        FileWriter fw;
        try {
            fw = new FileWriter("./src/main/java/Tarea20/files/randomLittleNumbers.txt", false); //Overwriting mode
            fw.write(str);
            System.out.println("The little numbers has been writed in the file using methods");
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    static String makeStringWithResults(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) str += arr[i] + "\n";
        return str;
    }
}
