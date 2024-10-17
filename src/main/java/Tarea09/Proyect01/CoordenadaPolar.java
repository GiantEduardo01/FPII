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
        return 0.0;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
