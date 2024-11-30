/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea21;

import java.io.*;
import java.util.*;

public class Exercise03 {

    public static void main(String[] args) {
        ObjectOutputStream fileOut;
        ObjectInputStream fileIn;
        System.out.println("Binary file (myObject.dat) is creating!");
        try {
            fileOut = new ObjectOutputStream(new FileOutputStream("./src/main/java/Tarea21/Files/myObject.dat"));
            Alumn a1 = new Alumn("Eduardo", "20212722", 20);
            Alumn a2 = new Alumn("Michael", "20221311", 19);
            Alumn a3 = new Alumn("Ricardo", "20239108", 18);
            fileOut.writeObject(a1);
            fileOut.writeObject(a2);
            fileOut.writeObject(a3);
            fileOut.close();
        }
        catch (Exception e) {
            System.out.println("There is a error: " + e.getMessage());
        }
        
        System.out.println("\nNow Binary file (myObject.dat) is reading and (otherObject.dat) is creating");
        try {
            fileIn = new ObjectInputStream(new FileInputStream("./src/main/java/Tarea21/Files/myObject.dat"));
            Alumn[] arr = new Alumn[3];
            for (int i = 0; i < arr.length; i++)
                arr[i] = (Alumn) fileIn.readObject();
            bubbleSort(arr);
            System.out.println("The objects have been saved in an array and this is sorting");
            System.out.println("The array is printed");
            for (Alumn a : arr) 
                System.out.println(a);
            
            fileIn.close();
            
            fileOut = new ObjectOutputStream(new FileOutputStream("./src/main/java/Tarea21/Files/otherObject.dat"));
            for (int i = 0; i < arr.length; i++)
                fileOut.writeObject(arr[i]);
            System.out.println("\nThe objects have been saved in (otherObject.dat)");
            fileOut.close();
        }
        catch (Exception e) {
            System.out.println("There is a error: " + e.getMessage());
        }
        
    }
    
    public static void bubbleSort(Alumn[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getAge() >= arr[j + 1].getAge()) {
                    Alumn temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
}
