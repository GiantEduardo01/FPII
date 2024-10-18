/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea10.Proyect03;

/**
 *
 * @author eduardo
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String[] OPERACIONES = {"Suma", "Resta", "Multiplicación", "Division", "Simplificación"};
        
        //Prueba métodos de instancia
        System.out.println("\nPrueba con métodos de Call Chaining");
        Fraction f1 = new Fraction(3, 4, 9, 17);
        Fraction f2 = new Fraction(5, 7, 6, 13);
        Fraction rpta = new Fraction();
        
        Fraction.mostrarFracciones(f1, f2);
        System.out.print("\nOperaciones en el siguiente orden: ");
        for (int i = 0; i < OPERACIONES.length - 1; i++) {
            System.out.print(OPERACIONES[i] + " " + OPERACIONES[4] + " ");
        }
        System.out.println();
        rpta = f1.sumarCC(f2).simplificarCC()
                 .restarCC(f2).simplificarCC()
                 .multiplicarCC(f2).simplificarCC()
                 .dividirCC(f2).simplificarCC();
        System.out.println("\nRespuesta final: " + rpta.toStringFraccion() + "; " + rpta.toStringDecimal());
    }
    
}
