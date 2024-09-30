/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea01;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de notas");
        int n = scann.nextInt();

        int[] arr = new int[n];
        ingresarNums(arr);

        mostrarNums(arr);
    }

    public static void ingresarNums(int[] arr) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingresar los numeros");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scann.nextInt();
        }

    }

    public static void mostrarNums(int[] arr) {
        System.out.println("Notas:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
