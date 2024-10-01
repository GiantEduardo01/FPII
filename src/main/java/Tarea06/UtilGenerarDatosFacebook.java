/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class UtilGenerarDatosFacebook {
    private static final Random RAND = new Random();
    private static final Scanner SCANN = new Scanner(System.in);
    
    //Atributos constantes para la generación de datos aleatorios
    private static final String ABECEDARIO = "abcdefghijklmnopqrstuvwxyz";
    private static final String[] ESTADOS_CIVILES = {"Casado(a)", "Soltero(a)", "Comprometido(a)", "En una relación UwU"};
    private static final int MAXIMO_LETRAS_POR_NOMBRE = 7;
    private static final int MINIMO_LETRAS_POR_NOMBRE = 4;
    private static final int MINIMA_EDAD = 18;
    private static final int MAXIMA_EDAD = 29;
    
    public static void llenarContactos(ArrayList<Contact> c) {
        String rpta = "";
        do { 
            System.out.println();
            c.add(generarContacto());
            System.out.println("Contacto generado: " + c.get(c.size() - 1)); //Imprime el último contacto generado
            
            System.out.print("Ingrese cualquier cosa para generar otro contacto (ENTER para salir): ");
            rpta = SCANN.nextLine();
        } while(!rpta.isEmpty());
    }
    
    private static Contact generarContacto() {
        String name = generarNombre();
        int edad = generarEdad();
        String estado = generarEstadoCivil();
        return new Contact(name, edad, estado);
    }
    
    /*Métodos para la creación de un nombre aleatorio*/
    private static String generarNombre() {
        String name = "";
        int num = RAND.nextInt(MAXIMO_LETRAS_POR_NOMBRE - MINIMO_LETRAS_POR_NOMBRE + 1) + MINIMO_LETRAS_POR_NOMBRE;
        
        for (int i = 0; i < num; i++) {
            String letra = escogerLetra();
            if (capitalizarLetra()) {
                letra = letra.toUpperCase();
            }
            name += letra;
        }
        return name;
    }
    
    private static boolean capitalizarLetra() {
        int num = RAND.nextInt(2);
        return num == 0;
    }
    
    private static String escogerLetra() {
        int num = RAND.nextInt(ABECEDARIO.length());
        return ABECEDARIO.substring(num, num + 1);
    }
    
    /*Método para la creación de una edad aleatoria en base a una edad mínima y una edad máxima*/
    private static int generarEdad() {
        int num = RAND.nextInt(MAXIMA_EDAD - MINIMA_EDAD + 1) + MINIMA_EDAD;
        return num;
    }
    
    /*Generar Estado Civil*/
    private static String generarEstadoCivil() {
        int num = RAND.nextInt(ESTADOS_CIVILES.length);
        return ESTADOS_CIVILES[num];
    }
    
}
