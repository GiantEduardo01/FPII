/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea09.Proyect01;

/**
 *
 * @author eduardo
 */
public class CoordenadaPolar extends Coordenada {

    public CoordenadaPolar(double primeraComponente, double segundaComponente) {
        super(primeraComponente, segundaComponente);
    }

    @Override
    public double calcularDistancia(Coordenada coor) {
        double lado1 = super.primeraComponente;
        double angulo1 = super.segundaComponente;
        
        double lado2 = coor.primeraComponente;
        double angulo2 = coor.segundaComponente;
        
        double theta = Math.abs(angulo1 - angulo2);
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2) - (2*lado1*lado2*Math.cos(theta)));
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void mostrarCoordenadas(Coordenada c2) {
        System.out.println("Primera Coordenada: " + this);
        System.out.println("Segunda Coordenada: " + c2);
    }
}
