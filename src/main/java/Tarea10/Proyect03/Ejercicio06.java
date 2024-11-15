/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea10.Proyect03;

/**
 *
 * @author eduardo
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        final String[] OPERACIONES = {"Suma", "Resta", "Multiplicación", "Division", "Simplificación"};
        
        //Prueba métodos de instancia
        System.out.println("\nPrueba con métodos de Call Chaining sin guardar resultado");
        Fraction f1 = new Fraction(1, 100 , 1, 100);
        Fraction f2 = new Fraction(1, 100, 1, 100);
        Fraction rpta = new Fraction();
        
        Fraction.mostrarFracciones(f1, f2);
        System.out.print("\nOperaciones en el siguiente orden: ");
        for (int i = 0; i < OPERACIONES.length - 1; i++) {
            System.out.print(OPERACIONES[i] + " " + OPERACIONES[4] + " ");
        }
        System.out.println();
        rpta = f1.sumar(f2).simplificarCc()
                 .restar(f2).simplificarCc()
                 .multiplicar(f2).simplificarCc()
                 .dividir(f2).simplificarCc();
        
        Fraction otherRpta = f1.sumar(f2);
        Fraction.mostrarRespuesta(OPERACIONES[0], otherRpta);
        otherRpta = otherRpta.simplificarCc();
        Fraction.mostrarRespuesta(OPERACIONES[4], otherRpta);
        
        otherRpta = otherRpta.restar(f2);
        Fraction.mostrarRespuesta(OPERACIONES[1], otherRpta);
        otherRpta = otherRpta.simplificarCc();
        Fraction.mostrarRespuesta(OPERACIONES[4], otherRpta);
        
        otherRpta = otherRpta.multiplicar(f2);
        Fraction.mostrarRespuesta(OPERACIONES[2], otherRpta);
        otherRpta = otherRpta.simplificarCc();
        Fraction.mostrarRespuesta(OPERACIONES[4], otherRpta);
        
        otherRpta = otherRpta.dividir(f2);
        Fraction.mostrarRespuesta(OPERACIONES[3], otherRpta);
        otherRpta = otherRpta.simplificarCc();
        Fraction.mostrarRespuesta(OPERACIONES[4], otherRpta);
        
        
        System.out.println("\nRespuesta final sin encadenamiento: " + otherRpta);
        System.out.println("\nRespuesta final con encadenamiento: " + rpta);
    }
    
}
