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
    
    public abstract double getPrimeraComponente();
    public abstract void setPrimerComponente(double primeraComponente);
    
    public abstract double getSegundaComponente();
    public abstract void setSegundaComponente(double segundaComponente);
    
    public abstract double calcularDistancia(Coordenada coor); //For use polymorphism 
    
    @Override
    public String toString() {
        return "(" + this.primeraComponente + ", " + this.segundaComponente + ")";
    }
}
