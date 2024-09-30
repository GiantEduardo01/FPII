/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea03;

import java.util.Random;
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
        final int COINS = 3;
        int[] frecuencias = new int[COINS + 1]; //Numero de casos = Numero de monedas + 1

        System.out.print("Cuántos lanzamientos desea efectuar?: ");
        int lanzamientos = scann.nextInt();

        for (int i = 0; i < lanzamientos; i++) {
            int[] resultados = lanzarMonedas(COINS);
            contarResultados(resultados, frecuencias);
        }

        String h = hacerHistograma(frecuencias, lanzamientos);
        System.out.println(h);
    }

    static int[] lanzarMonedas(int n) {
        Random rand = new Random();
        int[] coins = new int[n]; //Arreglo de n monedas
        //Se lanzan las monedas (0 cara - 1 sello)

        /* 
        for (int num : coins) { //for each no modifica los elementos del arreglo
            num = rand.nextInt(2);
        }*/

        for (int i = 0; i < coins.length; i++) {
            coins[i] = rand.nextInt(2);
        }
        return coins;
    }

    static void contarResultados(int[] resul, int[] frec) {
        int caras = 0;
        for (int r : resul) { //Se cuentan las caras
            if (r == 1) {
                caras++;
            }
        }
        frec[caras]++;
    }

    static String hacerHistograma(int[] frec, int lanz) {
        String str = "\nHistograma distribucion para " + (frec.length - 1) + " monedas y " + lanz + " lanzamientos\n\n";
        for (int caras = 0; caras < frec.length; caras++) {
            str += distribucionParaCara(caras, frec[caras], lanz);
        }
        return str;
    }

    static String distribucionParaCara(int c, int numC, int total) {
        final int SERIE_TOTAL = 100;
        String str = "";

        double razon = (double)numC / total;
        int asteriscos = (int)(razon * SERIE_TOTAL);
        for (int i = 0; i < asteriscos; i++) {
            str += "*";
        }

        return c + " caras " + numC + " resultados: "+ str + "\n";
    }
    
}
