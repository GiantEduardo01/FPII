/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica14;


/**
 *
 * @author eduardo
 */
public class Gerente extends Trabajador{
    private double bono;
    private int nivelDePrivilegio;
    
    private static final double MINIMO_TIEMPO_ANIOS = 2.0;
    private static final double BONO_POR_PUNTO_DE_PRIVILEGIO = 1250;
    private static final double SUELDO = 3750;

    public Gerente(int nivelDePrivilegio, String nombre, String apellido, String DNI, int edad) {
        super(nombre, apellido, DNI, edad);
        Trabajador.setSueldoBase(Gerente.SUELDO);
        
        this.bono = bono;
        this.nivelDePrivilegio = nivelDePrivilegio;
        this.calcularSalario();
    }
    
    private void calcularSalario() {
        this.bono = (Gerente.BONO_POR_PUNTO_DE_PRIVILEGIO * nivelDePrivilegio);
        double salario = Gerente.SUELDO + this.bono;
        super.setSalario(salario);
    }

    @Override
    public String toString() {
        String trabajador = super.toString();
        trabajador += "Sueldo Base: " + Gerente.SUELDO + " - Bono: " + this.bono+"\n";
        trabajador += "Salario: " +  super.getSalario() + "\n";
        return trabajador;
    }    
    
}
