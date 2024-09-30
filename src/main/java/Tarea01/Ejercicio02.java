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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in); 
        String[] phones = new String[100];
        ingresarPhones(phones);
        mostrar(phones);
    }

    public static void ingresarPhones(String[] phones) {
        Scanner scann = new Scanner(System.in); 
        boolean end = false;
        for (int i = 0; i < phones.length; i++) {
            while (true) {
                String s = scann.nextLine();
                s.toLowerCase();
                if (s.equals("q")) {
                    end = true;
                    break;
                }
                if (s.length() == 9) {
                    phones[i] = s;
                    break; 
                } 
                System.out.println("Ingrese de nuevo");
            }
            if (end) break;
        }
    }

    public static void mostrar(String[] phones) {
        for (String s : phones) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
    
}
