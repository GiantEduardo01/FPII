/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea09.Proyect02;

import Tarea09.Proyect01.CoordenadaRectangular;

/**
 *
 * @author eduardo
 */
public class Ejercicio00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoordenadaRectangular A = new CoordenadaRectangular(0, 0);
        CoordenadaRectangular B = new CoordenadaRectangular(3, 4);
        System.out.println("Primera Coordenada: " + A);
        System.out.println("Primera Coordenada: " + B);
        double distancia = A.calcularDistancia(B);
        System.out.println("Distancia: " + distancia);
    }
    
}
