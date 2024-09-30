/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        final int DAYS = 30;

        int[] horas = new int[DAYS];
        rellenarHoras(horas);

        System.out.print("Ingresar dias a actualizar: ");
        int d = scann.nextInt();

        mostrarActualizacion(horas, d);
    }

    static void rellenarHoras(int[] h) {
        Random ran = new Random();
        for (int i = 0; i < h.length; i++) {
            h[i] = ran.nextInt(8) + 1;
        }
    }

    static void mostrarActualizacion(int[] h, int d) {
        Scanner scann = new Scanner(System.in);
        final int DAYS = 30;

        int day = 0;
        for (int i = 0; i < d; i++) {
            System.out.print("\nDía " + (i+1) + ": ");
            System.out.println(Arrays.toString(h));

            if (i <= d - 1) { //Pedir horas del dia final hasta el penultimo dia
                System.out.print("Ingresar horas del día final: ");
                day = scann.nextInt();
            }

            int[] newH = new int[DAYS]; 
            System.arraycopy(h, 1, newH, 0, DAYS - 1);
            h = newH;
            h[DAYS - 1] = day;
        }
        System.out.println(Arrays.toString(h));
    }
}
