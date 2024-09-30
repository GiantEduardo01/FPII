/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea03;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] arr;
        int n = scann.nextInt();
        arr = new int[n];
        ingresar(arr);
        modificar(arr);
        imprimir(arr);
    }
    static void ingresar(int[] a) {
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scann.nextInt();
        }
    }
    static void modificar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2;
        }
    }
    static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
