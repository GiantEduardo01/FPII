/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea06;

/**
 *
 * @author eduardo
 */
public class Contact {
    private String nombre;
    private int edad; 
    private String estadoCivil;

    public Contact(String nombre, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    
    public Contact (String nombre) {
        this.nombre = nombre;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    /*Métodos para trabajar la búsqueda binaria*/
    public boolean tienenMenorNombreQue(Contact c) {
        return this.getNombre().compareToIgnoreCase(c.getNombre()) <= 0;
    }

    public boolean tieneMayorNombreQue(Contact c) {
        return this.getNombre().compareToIgnoreCase(c.getNombre()) >= 0;
    }
    
    public boolean tieneMismoNombreQue(Contact c) {
        return this.getNombre().equals(c.getNombre());
    }

    @Override
    public String toString() {
        return "Contact{" + "nombre=" + nombre + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }
}
