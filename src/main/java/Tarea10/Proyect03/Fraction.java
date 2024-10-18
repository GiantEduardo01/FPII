/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea10.Proyect03;

import Tarea09.Proyect02.*;
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
        if (denominador == 0) {
            System.out.println("Denominador inválido, se genera otro denominador");
            Random rand = new Random();
            this.denominador = rand.nextInt(5) + 1;
        } else {
            this.denominador = denominador;
        }
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
    
    //Methods for Call Chaining f1 no change its value
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
    
    public Fraction simplificarCc() {
        int mcd = MCD(this.numerador, this.denominador);
        int numerador = this.numerador;
        int denominador = this.denominador;
        if (mcd != 1) {
            numerador /=  mcd;
            denominador /= mcd;
        }
        return new Fraction(numerador, denominador);
    } 
    
    public void simplificar() {
        int mcd = MCD(this.numerador, this.denominador);
        if (mcd != 1) {
            this.numerador /=  mcd;
            this.denominador /= mcd;
        }
    }
    

    
    //Methods for Call Chaining f1 change its value
    public Fraction sumarCC(Fraction f) {
        System.out.println("Suma se guarda en f1");
        int product = f.getDenominador() * denominador;
        int sum = (numerador * f.getDenominador()) + (f.getNumerador() * denominador);
        this.numerador = sum;
        this.denominador = product;
        mostrarFracciones(this, f);
        System.out.println();
        return this;
    }
    
    public Fraction restarCC(Fraction f) {
        System.out.println("Resta se guarda en f1");
        int product = f.getDenominador() * denominador;
        int sum = (numerador * f.getDenominador()) - (f.getNumerador() * denominador);
        this.numerador = sum;
        this.denominador = product;
        mostrarFracciones(this, f);
        System.out.println();
        return this;
    }
    
    public Fraction multiplicarCC(Fraction f) {
        System.out.println("Multiplicacion se guarda en f1");
        int product1 = f.getDenominador() * denominador;
        int product2 = f.getNumerador() * numerador;
        this.numerador = product2;
        this.denominador = product1;
        mostrarFracciones(this, f);
        System.out.println();
        return this;
    }
    
    public Fraction dividirCC(Fraction f) {
        System.out.println("Division se guarda en f1");
        int product1 = numerador * f.getDenominador();
        int product2 = denominador * f.getNumerador();
        this.numerador = product1;
        this.denominador = product2;
        mostrarFracciones(this, f);
        System.out.println();
        return this;
    }
    
    public Fraction simplificarCC() {
        System.out.println("Simplificacion se guarda en f1");
        int mcd = MCD(this.numerador, this.denominador);
        if (mcd != 1) {
            this.numerador /=  mcd;
            this.denominador /= mcd;
        }
        System.out.println("Fracción número 01: " + this);
        System.out.println();
        return this;
    }
    
    private int MCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return MCD(b % a, a); //Recursive call
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
        return this.toStringDecimal() + "; " + this.toStringFraccion();
    }
    
    public String toStringFraccion() {
        return this.numerador + "/" + this.denominador;
    }
    
    public String toStringDecimal() {
        double num = (double)this.numerador / this.denominador;
        return num + "";
    }
}
