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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {23, 17, 5, 90, 12, 44, 38, 84, 77};
        System.out.println(Arrays.toString(arr));
        System.out.println("Se busca el 90: " + busquedaB(arr, 90));
        System.out.println("Se busca el 92: " + busquedaB(arr, 92));
    }

    static int busquedaB(int[] arr, int num) {
        int baja = 0, alta = arr.length - 1;
        while (baja <= alta) {
            int media = (alta + baja) / 2;
            if (arr[media] == num) {
                return media;
            }
            if (arr[media] < num) {
                baja = media + 1;
            }
            if (arr[media] > num) {
                alta = media - 1;
            }
        }
        return -1;
    }
}
