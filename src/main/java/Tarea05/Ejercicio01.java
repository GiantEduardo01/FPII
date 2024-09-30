/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea05;

/**
 *
 * @author eduardo
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        final String[] ciudades = {"AQP", "JUL", "CUZ", "TCQ", "LIM"};
        int[][] table = generarTabla();

        mostrarTablaTiemposDeVuelo(ciudades, table);
        preguntarPorTiempoDeVuelo(ciudades, table);
    }

    static int[][] generarTabla() {
        final int[][] DATOS = {{0, 22, 30, 42, 57}, 
                               {23, 0, 15, 25, 58}, 
                               {31, 17, 0, 24, 30}, 
                               {45, 27, 25, 0, 95}, 
                               {59, 58, 30, 97, 0}};
        return DATOS;
    }

    static void mostrarTablaTiemposDeVuelo(String[] c, int[][] t) {
        System.out.print("\t");
        for (String s : c) { //IMpresion ciudades
            System.out.print(s + "\t");
        }
        System.out.println();

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (j == 0) {
                    System.out.print(c[i] + "\t");
                }
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void preguntarPorTiempoDeVuelo(String[] c, int[][] t){
        Scanner scann = new Scanner(System.in);
        String ciudadA, ciudadB;  

        do {
            System.out.println("Consulte el tiempo de Vuelo");

            System.out.println("Ingrese ciudad de partida: ");
            ciudadA = scann.nextLine();
            if (ciudadA.equals("q")) {
                break;
            }

            System.out.println("Ingrese ciudad de llegada: ");
            ciudadB = scann.nextLine();
            if (ciudadB.equals("q")) {
                break;
            }

            int inA = indice(ciudadA, c), inB = indice(ciudadB, c);
            if (inA != -1 && inB != -1) {
                System.out.println("El tiempo es: " + t[inA][inB] + "\n");
            } else {
                System.out.println("Una ciudad no es correcta" + "\n");
            }
        } while (true);
    }

    static int indice(String s, String[] c) {
        for (int i = 0; i < c.length; i++) {
            if (s.equals(c[i])) {
                return i;
            }
        }
        return -1;
    }
}
