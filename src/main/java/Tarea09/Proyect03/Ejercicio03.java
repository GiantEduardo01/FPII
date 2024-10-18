/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea09.Proyect03;

/**
 *
 * @author eduardo
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imaginario i1 = new Imaginario(11, 13);
        Imaginario i2 = new Imaginario(3, 10);
        
        Menu m = new Menu(i1, i2);
        m.menuInteractivo();
    }
    
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
    
}
