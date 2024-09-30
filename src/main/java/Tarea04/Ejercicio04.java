/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea04;

import java.util.Arrays;

/**
 *
 * @author eduardo
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {23, 17, 5, 90, 12, 44, 38, 84, 77};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int menor = i;
            for (int j = 1 + i; j < a.length; j++) {
                if (a[menor] >= a[j]) {
                    menor = j;
                }
            }
            int temp = a[i];
            a[i] = a[menor];
            a[menor] = temp;
        }
    }

}
