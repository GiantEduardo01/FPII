/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea06;

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
        String continuar = "";
        do {
            EPIS e = new EPIS();
            e.mostrarAlumnadoPorAnio();
            e.mostrarAlumnado();
            e.mostrarPromedioPonderadoPorAnio();
            e.mostrarPromedioPonderado();
            e.mostrarMayorPromedioPorAnio();
            e.mostrarMenorPromedioPorAnio();
            e.mostrarMayorPromedio();
            e.mostrarMenorPromedio();
            e.mostrarRankingPorAnio();
            e.mostrarRanking();
            System.out.print("Ingrese (q) si quiere salir: ");
            continuar = scann.nextLine();
        } while (!continuar.equals("q"));
    }
    
}
