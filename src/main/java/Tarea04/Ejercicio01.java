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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {23, 17, 5, 90, 12, 44, 38, 84, 77};
        System.out.println(Arrays.toString(arr));
        System.out.println("Se busca el 90: " + buscar(arr, 90));
        System.out.println("Se busca el 92: " + buscar(arr, 92));
    }

    static int buscar(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
