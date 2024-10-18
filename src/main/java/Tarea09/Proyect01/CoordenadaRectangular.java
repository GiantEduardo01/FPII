/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea09.Proyect01;

/**
 *
 * @author eduardo
 */
public class CoordenadaRectangular extends Coordenada {

    public CoordenadaRectangular(double primeraComponente, double segundaComponente) {
        super(primeraComponente, segundaComponente);
    }

    @Override
    public double calcularDistancia(Coordenada coor) { //Distancia Euclidiana
        double x1 = super.primeraComponente;
        double y1 = super.segundaComponente;
        double x2 = coor.primeraComponente; //polymorphism method
        double y2 = coor.segundaComponente;
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
    public double calcularDistanciaManhattan(Coordenada coor) {
        double x1 = super.primeraComponente;
        double y1 = super.segundaComponente;
        double x2 = coor.primeraComponente; //polymorphism method
        double y2 = coor.segundaComponente;
        
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    
    @Override
    public void mostrarCoordenadas(Coordenada c2) {
        System.out.println("Primera Coordenada: " + this);
        System.out.println("Segunda Coordenada: " + c2);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
