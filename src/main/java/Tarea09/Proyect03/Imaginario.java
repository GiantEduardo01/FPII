/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea09.Proyect03;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public class Imaginario {
    private double parteReal;
    private double parteImaginaria;
    private static final String IMAGINARIO = "i";

    public Imaginario(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    public Imaginario(int a, int b) {
        Random rand = new Random();
        this.parteReal = rand.nextInt(b - a + 1) + a;
        this.parteImaginaria = rand.nextInt(b - a + 1) + a;
    }
    
    public Imaginario() {
        this.parteReal = Math.random();
        this.parteImaginaria = Math.random();
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    public String toStringVector() {
        return "(" + this.parteReal + ", " + this.parteImaginaria + ")";
    }
    
    public String toStringOperacion() {
        String rpta = "";
        if (this.parteImaginaria == 0.0) {
            rpta += this.parteReal;
        } 
        
        if (this.parteImaginaria < 0) {
            double soloNumero = this.parteImaginaria * (-1);
            rpta += this.parteReal + " - " + soloNumero + "i";
        }
        
        if (this.parteImaginaria > 0) {
            double soloNumero = this.parteImaginaria;
            rpta += this.parteReal + " + " + soloNumero + "i";
        }
        return rpta;
    }
    
    //========================Métodos de Instancia========================
    public Imaginario suma(Imaginario num) {
        double parteR = num.getParteReal();
        double parteI = num.getParteImaginaria();
        return new Imaginario(this.parteReal + parteR, this.parteImaginaria + parteI);
    }
    
    public Imaginario resta(Imaginario num) {
        double parteR = num.getParteReal();
        double parteI = num.getParteImaginaria();
        return new Imaginario(this.parteReal - parteR, this.parteImaginaria - parteI);
    }
    
    public Imaginario multiplicacion(Imaginario num) {
        double a1 = this.parteReal;
        double b1 = this.parteImaginaria;
        double a2 = num.getParteReal();
        double b2 = num.getParteImaginaria();
        
        double parteR = (a1 * a2) - (b1 * b2);
        double parteI = (a1 * b2) + (b1 * a2);
        return new Imaginario(parteR, parteI);
    }
    
    public double modulo() {
        return Math.sqrt(Math.pow(this.parteImaginaria, 2) + Math.pow(this.parteReal, 2));
    }
    
    public Imaginario conjugado() {
        return new Imaginario(this.parteReal, this.parteImaginaria * -1);
    }
    //========================Métodos de Instancia========================

    //========================Métodos de Clase========================
    public static Imaginario suma(Imaginario i1, Imaginario i2) {
        double a1= i1.getParteReal();
        double b1 = i1.getParteImaginaria();
        
        double a2 = i2.getParteReal();
        double b2 = i2.getParteImaginaria();
        
        return new Imaginario(a1 + a2, b1 + b2);
    }
    
    public static Imaginario resta(Imaginario i1, Imaginario i2) {
        double a1= i1.getParteReal();
        double b1 = i1.getParteImaginaria();
        
        double a2 = i2.getParteReal();
        double b2 = i2.getParteImaginaria();
        
        return new Imaginario(a1 - a2, b1 - b2);
    }
    
    public static Imaginario multiplicacion(Imaginario i1, Imaginario i2) {
        double a1= i1.getParteReal();
        double b1 = i1.getParteImaginaria();
        
        double a2 = i2.getParteReal();
        double b2 = i2.getParteImaginaria();
        
        double parteR = (a1 * a2) - (b1 * b2);
        double parteI = (a1 * b2) + (b1 * a2);
        
        return new Imaginario(parteR, parteI);
    }
    
    public static double modulo(Imaginario i) {
        return Math.sqrt(Math.pow(i.getParteImaginaria(), 2) + Math.pow(i.getParteReal(), 2));
    }
    
    public static Imaginario conjugado(Imaginario i) {
        return new Imaginario(i.getParteReal(), i.getParteImaginaria() * -1);
    }
    //========================Métodos de Clase========================
    
    
    public Imaginario makeCopy() {
        return new Imaginario(this.parteReal, this.parteImaginaria);
    }
    
    public static void mostrarNumeros(Imaginario i1, Imaginario i2) {
        System.out.println("Núemro imaginario 01: " + i1.toStringVector() + " ; " + i1.toStringOperacion());
        System.out.println("Núemro imaginario 02: " + i2.toStringVector() + " ; " + i2.toStringOperacion());
    }
    
    public static void mostrarRespuesta(String operacion, Imaginario rpta) {
        System.out.println(operacion + ": " + rpta.toStringOperacion() + " ; " + rpta.toStringVector());
    }
    
    public static void mostrarDouble(String operacion, double rpta) {
        System.out.println(operacion + ": " + rpta);
    } 
}
