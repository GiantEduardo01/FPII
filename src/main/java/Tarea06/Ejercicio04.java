/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea06;

import java.util.*;

/**
 *
 * @author eduardo
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> codigoCurso = new HashMap<String, String>();
        ingresarCursos(codigoCurso);
        mostrarEntradas(codigoCurso);
        consultarCodigo(codigoCurso);

    }
    
    private static void ingresarCursos(HashMap<String, String> codCur) {
        Scanner scann = new Scanner(System.in);
        String rpta = "";
        do {
            System.out.print("Ingresar nombre del curso: ");
            rpta = scann.nextLine();
            
            if (!rpta.isEmpty()) {
                String key = generarCodigo(codCur, rpta);
                codCur.put(key, rpta);
            }
        } while(!rpta.isEmpty());
    }
    
    private static void mostrarEntradas(HashMap<String, String> codCur) {
        for (Map.Entry<String, String> entry : codCur.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Curso: " + entry.getValue());
        }
    }
    
    private static String generarCodigo(HashMap<String, String> codCur, String course) {
        String key = course.substring(0, 2).toUpperCase();
        
        Random rand = new Random();
        final String letters = "ABCDEF";
        

        while (codCur.containsKey(key)) {
            int num = rand.nextInt(letters.length());
            key = key.substring(0, 1) + letters.substring(num, num + 1);
        }
        
        return key;

    }
    
    public static void consultarCodigo(HashMap<String, String> codCur) {
        Scanner scann = new Scanner(System.in);
        String rpta = "";
        
        do {
            System.out.println("\nIngresar código de curso: ");    
            rpta = scann.nextLine();
            
            if (!rpta.isEmpty() && codCur.containsKey(rpta)) {
                System.out.println("Curso consultado: " + codCur.get(rpta));
            }
            
        } while(!rpta.isEmpty());

    
    }
    
}
