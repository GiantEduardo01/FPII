/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea09.Proyect02;

import Tarea09.Proyect02.Fraction;

/**
 *
 * @author eduardo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String[] OPERACIONES = {"Suma", "Resta", "Multiplicación", "Division", "Simplificación"};
        
        //Prueba métodos de instancia
        System.out.println("\nPrueba con métodos de instancia");
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5, 7);
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
        
        //Prueba métodos de clase
        System.out.println("\nPrueba con métodos de clase");
        f1 = new Fraction(5, 10, 11, 16);
        f2 = new Fraction(5, 10, 11, 16);
        Fraction.mostrarFracciones(f1, f2);
        for (int i = 0; i < OPERACIONES.length - 1; i++) {
            System.out.println();
            switch (i) {
                case 0:
                    rpta = Fraction.sumar(f1, f2);
                    break;
                case 1:
                    rpta = Fraction.restar(f1, f2);
                    break;
                case 2:
                    rpta = Fraction.multiplicar(f1, f2);
                    break;
                case 3:
                    rpta = Fraction.dividir(f1, f2);
                    break;
            }
            Fraction.mostrarRespuesta(OPERACIONES[i], rpta);
            Fraction.simplificar(rpta);
            Fraction.mostrarRespuesta(OPERACIONES[4], rpta);
        }
        
        //Prueba métodos creados en la clase Main
        System.out.println("\nPrueba con métodos de la clase Main (principal)");
        f1 = new Fraction(23, 27, 3, 5);
        f2 = new Fraction(23, 27, 3, 5);
        Fraction.mostrarFracciones(f1, f2);
        for (int i = 0; i < OPERACIONES.length - 1; i++) {
            System.out.println();
            Fraction temp = new Fraction(f1.getNumerador(), f1.getDenominador());
            switch (i) {
                case 0:
                    sumar(temp, f2);
                    break;
                case 1:
                    restar(temp, f2);
                    break;
                case 2:
                    multiplicar(temp, f2);
                    break;
                case 3:
                    dividir(temp, f2);
                    break;
            }
            Fraction.mostrarRespuesta(OPERACIONES[i], temp);
            simplificar(temp);
            Fraction.mostrarRespuesta(OPERACIONES[4], temp);
        }
        
        
    }
    
    public static void sumar(Fraction f1, Fraction f2) { //Method add with return void, solution saved in the first fraction 
        int product = f1.getDenominador() * f2.getDenominador();
        int sum = (f1.getNumerador() * f2.getDenominador()) + (f2.getNumerador() * f1.getDenominador());
        f1.setNumerador(sum);
        f1.setDenominador(product);
    }
    
    public static void restar(Fraction f1, Fraction f2) { //Method add with return void, solution saved in the first fraction 
        int product = f1.getDenominador() * f2.getDenominador();
        int sum = (f1.getNumerador() * f2.getDenominador()) - (f2.getNumerador() * f1.getDenominador());
        f1.setNumerador(sum);
        f1.setDenominador(product);
    }
    
    public static void multiplicar(Fraction f1, Fraction f2) { //Method add with return void, solution saved in the first fraction 
        int product1 = f1.getNumerador() * f2.getNumerador();
        int product2 = f1.getDenominador() * f2.getDenominador();
        f1.setNumerador(product1);
        f1.setDenominador(product2);
    }
    
    public static void dividir(Fraction f1, Fraction f2) { //Method add with return void, solution saved in the first fraction 
        int product1 = f1.getNumerador() * f2.getDenominador();
        int product2 = f1.getDenominador() * f2.getNumerador();
        f1.setNumerador(product1);
        f1.setDenominador(product2);
    }
    
    public static void simplificar(Fraction f) {
        int numerador = f.getNumerador();
        int denominador = f.getDenominador();
        int mcd = MCD(numerador, denominador);
        if (mcd != 1) {
            f.setNumerador(numerador / mcd);
            f.setDenominador(denominador / mcd);
        }
    }
    
    private static int MCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return MCD(b % a, a);
    }
}
