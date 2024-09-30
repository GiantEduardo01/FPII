/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea05;

/**
 *
 * @author eduardo
 */
public class Alumno {
    private String nombre;
    private int edad;
    private double promedioPonderado;

    public Alumno(String nombre, int edad, double promedioPonderado) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioPonderado = promedioPonderado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }
    
    public boolean tieneMayorPromedioQue(Alumno a) {
        return this.getPromedioPonderado() >= a.getPromedioPonderado();
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", promedioPonderado=" + promedioPonderado + '}';
    }
    
}
