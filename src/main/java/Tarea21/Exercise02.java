/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea21;

import java.util.*;
import java.io.*;
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("\nThe file (file.dat) is creating");
        System.out.print("Enter X:");
        int x = scann.nextInt();
        System.out.print("Enter Y:");
        int y = scann.nextInt();
        
        DataOutputStream fileOut;
        try {
            fileOut = new DataOutputStream(new FileOutputStream("./src/main/java/Tarea21/Files/file.dat", false)); //Append mode
            System.out.print("Enter the number of integers: ");
            int num = scann.nextInt();
            
            fileOut.writeInt(num);
            System.out.println("The number of integers has been writed!");
            
            for (int i = 0; i < num; i++) {
                fileOut.writeInt(randomInteger(x, y));
            }
            System.out.println("The numbers have been writed!");
            
            fileOut.close();
            
        }
        catch (Exception e) {
            System.out.println("There is a error: " + e.getMessage());
        }
        
        System.out.println("\nThe file (other.dat) is creating in base to (file.dat)");
        DataInputStream fileIn;
        try {
            System.out.println("(file.dat) is reading");
            fileIn = new DataInputStream(new FileInputStream("./src/main/java/Tarea21/Files/file.dat"));
            int num = fileIn.readInt();
            System.out.println("Number of integers: " + num);
            
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = fileIn.readInt();
            }
            bubbleSort(arr);
            
            System.out.println("Array with " + num + " integers has been created and ordered: " + Arrays.toString(arr));
            fileIn.close();
            
            fileOut = new DataOutputStream( new FileOutputStream("./src/main/java/Tarea21/Files/other.dat"));
            fileOut.writeInt(arr.length);
            for (Integer i : arr) {
                fileOut.writeInt(i);
            }
            fileOut.close();
            System.out.println("\nThat array has been saved in (other.dat)");
        }
        
        catch (Exception e) {
            System.out.println("There is a error: " + e.getMessage());
        }
    }
    
    public static int randomInteger(int x, int y) {
        Random rand = new Random();
        return rand.nextInt(y - x + 1) + x;
    }
    
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
}
