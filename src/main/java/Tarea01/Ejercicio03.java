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
public class Ejercicio03 {

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

                if (validPhoneNumber(s)) {
                    phones[i] = s;
                    break; 
                } 
                System.out.println("Ingrese de nuevo");
            }
            if (end) break;
        }
    }

    public static boolean validPhoneNumber(String s) {
        if (s.length() != 9) { //Se verifica que el número tenga 9 dígitos
            System.out.println("¡¡No se identifican 9 caracteres!!");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (!Character.isDigit(n)) { //Se verifica que todos sean números del 0 al 9
                System.out.println("¡¡Algunos caracteres no son valores numéricos!!");
                return false;
            }
            if (i == 0) {
                if (n != '9') { //Se verifica que comienze con 9
                    System.out.println("¡¡El número debe comenzar con 9!!");
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrar(String[] phones) {
        for (String s : phones) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
