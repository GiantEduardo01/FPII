/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea07;

/**
 *
 * @author eduardo
 */

import java.util.*;
public class Ejercicio01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se genera arreglo de 2 soldados");
        
        Soldado[] ejercito = new Soldado[2];
        UtilGenerarDatos.llenarArreglo(ejercito);
        
        for (Soldado s : ejercito) {
            System.out.println(s);
        }
    }
    
}
