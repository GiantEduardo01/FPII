/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea09.Proyect02;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public class Fraction {
    private int numerador;
    private int denominador;

    public Fraction(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Fraction(int rangInfA, int rangSupA, int rangInfB, int rangSupB) {
        Random rand = new Random();
        this.numerador = rand.nextInt(rangSupA - rangInfA + 1) + rangInfA;
        this.denominador = rand.nextInt(rangSupB - rangInfB + 1) + rangInfB;
    }
    
    public Fraction() {
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraction sumar(Fraction f) {
        int product = f.getDenominador() * denominador;
        int sum = (numerador * f.getDenominador()) + (f.getNumerador() * denominador);
        return new Fraction(sum, product);
    }
    
    public Fraction restar(Fraction f) {
        int product = f.getDenominador() * denominador;
        int sum = (numerador * f.getDenominador()) - (f.getNumerador() * denominador);
        return new Fraction(sum, product);
    }
    
    public Fraction multiplicar(Fraction f) {
        int product1 = f.getDenominador() * denominador;
        int product2 = f.getNumerador() * numerador;
        return new Fraction(product2, product1);
    }
    
    public Fraction dividir(Fraction f) {
        int product1 = numerador * f.getDenominador();
        int product2 = denominador * f.getNumerador();
        return new Fraction(product1, product2);
    }
    
    public void simplificar() {
        int mcd = MCD(this.numerador, this.denominador);
        if (mcd != 1) {
            this.numerador /=  mcd;
            this.denominador /= mcd;
        }
    }
    
    private int MCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return MCD(b % a, a); //Recursive call
    }
    
    public static Fraction sumar(Fraction f1, Fraction f2) { 
        int product = f1.getDenominador() * f2.getDenominador();
        int sum = (f1.getNumerador() * f2.getDenominador()) + (f2.getNumerador() * f1.getDenominador());
        return new Fraction(sum, product);
    }
    
    public static Fraction restar(Fraction f1, Fraction f2) {
        int product = f1.getDenominador() * f2.getDenominador();
        int sum = (f1.getNumerador() * f2.getDenominador()) - (f2.getNumerador() * f1.getDenominador());
        return new Fraction(sum, product);
    }
    
    public static Fraction multiplicar(Fraction f1, Fraction f2) { 
        int product1 = f1.getNumerador() * f2.getNumerador();
        int product2 = f1.getDenominador() * f2.getDenominador();
        return new Fraction(product1, product2);
    }

    public static Fraction dividir(Fraction f1, Fraction f2) { 
        int product1 = f1.getNumerador() * f2.getDenominador();
        int product2 = f1.getDenominador() * f2.getNumerador();
        return new Fraction(product1, product2);
    }
    
    public static void simplificar(Fraction f) {
        int numerador = f.getNumerador();
        int denominador = f.getDenominador();
        int mcd = MCDclase(numerador, denominador);
        if (mcd != 1) {
            f.setNumerador(numerador / mcd);
            f.setDenominador(denominador / mcd);
        }
    }
    
    private static int MCDclase(int a, int b) {
        if (a == 0) {
            return b;
        }
        return MCDclase(b % a, a);
    }
    
    //Métodos estáticos para mostrar información de fracciones y operaciones
    public static void mostrarFracciones(Fraction f1, Fraction f2) {
        System.out.println("Fracción número 01: " + f1);
        System.out.println("Fracción número 02: " + f2);
    }
    
    public static void mostrarRespuesta(String operacion, Fraction f) {
        System.out.println(operacion + ": " + f);
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
