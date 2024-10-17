/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea09.Proyect01;

import Tarea09.Proyect01.CoordenadaRectangular;

/**
 *
 * @author eduardo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoordenadaRectangular A = new CoordenadaRectangular(0, 0);
        CoordenadaRectangular B = new CoordenadaRectangular(3, 4);
        A.mostrarCoordenadas(B);

        double distancia = A.calcularDistancia(B);
        System.out.println("Distancia Euclidiana: " + distancia);
        
        distancia = A.calcularDistanciaManhattan(B);
        System.out.println("Distancia Manhattan: " + distancia);
        
        System.out.println("\nSe generan otros puntos para coordenadas polares");
        CoordenadaPolar C = new CoordenadaPolar(Math.sqrt(2), Math.PI / 4);
        CoordenadaPolar D = new CoordenadaPolar(Math.sqrt(2) * 4, Math.PI / 4);
        C.mostrarCoordenadas(D);
        
        distancia = C.calcularDistancia(D);
        System.out.println("Distancia mediante ley de cosenos: " + distancia);
        
    }
    
}
