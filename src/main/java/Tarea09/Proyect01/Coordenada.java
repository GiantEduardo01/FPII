/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea09.Proyect01;

/**
 *
 * @author eduardo
 */
public abstract class Coordenada {
    protected double primeraComponente;
    protected double segundaComponente;
    
    protected Coordenada(double primeraComponente, double segundaComponente) {
        this.primeraComponente = primeraComponente;
        this.segundaComponente = segundaComponente;
    }
    
    public abstract double calcularDistancia(Coordenada coor); //For use polymorphism 
    public abstract void mostrarCoordenadas(Coordenada c2);
    
    @Override
    public String toString() {
        return "(" + this.primeraComponente + ", " + this.segundaComponente + ")";
    }
}
