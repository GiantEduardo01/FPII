/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica14;

/**
 *
 * @author eduardo
 */
public class Trabajador {
    private String nombre;
    private String apellido;
    private String DNI;
    private int edad;
    private double tiempoEnAnios;
    private double salario;
    
    private static String categoriaString = "TRABAJADOR"; 
    private static double sueldoBase = 0;

    public Trabajador(String nombre, String apellido, String DNI, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }

    public double getTiempoEnAnios() {
        return tiempoEnAnios;
    }

    public void setTiempoEnAnios(double tiempoEnAnios) {
        this.tiempoEnAnios = tiempoEnAnios;
    }

    public static void setSueldoBase(double sueldoBase) {
        Trabajador.sueldoBase = sueldoBase;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String str = "Categoria del trabajador: " + this.categoriaString + "\n";
        str += " - Nombre: " + this.nombre + " " + this.apellido + " - DNI: " + this.DNI + "\n";
        str += "Edad: " + this.edad + " - Tiempo en la Empresa: " + this.tiempoEnAnios;
        return str;
    }
}
