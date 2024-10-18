/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea10.Proyect03;

/**
 *
 * @author eduardo
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String[] OPERACIONES = {"Suma", "Resta", "Multiplicación", "Division", "Simplificación"};
        
        //Prueba métodos de instancia
        System.out.println("\nPrueba con métodos de instancia");
        Fraction f1 = new Fraction(3, 0);
        Fraction f2 = new Fraction(5, 0);
        Fraction rpta = new Fraction();
        
        Fraction.mostrarFracciones(f1, f2);
        for (int i = 0; i < OPERACIONES.length - 1; i++) {
            System.out.println();
            switch (i) {
                case 0:
                    rpta = f1.sumar(f2);
                    break;
                case 1:
                    rpta = f1.restar(f2);
                    break;
                case 2:
                    rpta = f1.multiplicar(f2);

                    break;
                case 3:
                    rpta = f1.dividir(f2);
                    break;
            }
            Fraction.mostrarRespuesta(OPERACIONES[i], rpta);
            rpta.simplificar();
            Fraction.mostrarRespuesta(OPERACIONES[4], rpta);
        }
    }
    
}
