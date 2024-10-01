/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea06;

import java.util.ArrayList;
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
        int n = scann.nextInt(); //Nombres a ingresar
        scann.nextLine();

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(scann.nextLine());
        }

        Random rand = new Random();
        int eliminations = names.size() - 1;
        for (int i = 0; i < eliminations; i++) {
            System.out.println("");
            int lose = rand.nextInt(names.size()); //Indice perdedor

            System.out.println("Eliminado: " + names.remove(lose));
            System.out.println("Prevalecen: " + names);
        }

        System.out.println("\nEl ganador es: " + names);
    }
    
}
