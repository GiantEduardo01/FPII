/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea02;

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
        Contact[] contacts = new Contact[100];
        ingresarContacts(contacts);
        contactsList(contacts);
        consultarContactNumber(contacts);
    }

    public static void ingresarContacts(Contact[] c) {
        Scanner scann = new Scanner(System.in); 
        boolean end = false;
        for (int i = 0; i < c.length && !end; i++) {
            c[i] = new Contact(null, null); //Instancia nula
            while (true) {
                System.out.println();
                String name, phone;

                System.out.print("Ingresar Nombre: ");
                name = scann.nextLine();
                if (name.equals("q") || name.equals("Q")) {
                    end = true;
                    break;
                }

                System.out.print("Ingresar Numero: ");
                phone = scann.nextLine();
                if (phone.equals("q") || phone.equals("Q")) {
                    end = true;
                    break;
                }

                c[i] = new Contact(name, phone);
                if (c[i].getPhone() != null) { //Número válido, sale del bucle interno
                    break;
                }
            }
            
        }
    }

    public static void contactsList(Contact[] contacts) {
        System.out.println();
        System.out.println("Lista de contactos");
        for (Contact p : contacts) {
            if (p.getPhone() != null) {
                System.out.println(p);
            } else {
                break;
            }
        }
    }

    public static void consultarContactNumber(Contact[] contacts) {
        Scanner scann = new Scanner(System.in); 
        System.out.println();
        System.out.print("Ingrese Nombre del Contaco: ");
        String name = scann.nextLine();
        for (Contact c : contacts) {
            if (c.getPhone() != null) {
                if (c.getName().toLowerCase().equals(name.toLowerCase())) {
                    System.out.println(name + ": " + c.getPhone());
                }
            } else {
                break;
            }
        }
    }
}
