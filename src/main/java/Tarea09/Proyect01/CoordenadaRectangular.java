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
    public double getPrimeraComponente() {
        return super.primeraComponente;
    }

    @Override
    public void setPrimerComponente(double primeraComponente) {
        super.primeraComponente = primeraComponente;
    }

    @Override
    public double getSegundaComponente() {
        return super.segundaComponente;
    }

    @Override
    public void setSegundaComponente(double segundaComponente) {
        super.segundaComponente = segundaComponente;
    }

    @Override
    public double calcularDistancia(Coordenada coor) {
        double x1 = super.primeraComponente;
        double y1 = super.segundaComponente;
        double x2 = coor.getPrimeraComponente(); //polymorphismo method
        double y2 = coor.getSegundaComponente();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
    public double calcularDistanciaManhattan(Coordenada coor) {
        return 0.0;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
