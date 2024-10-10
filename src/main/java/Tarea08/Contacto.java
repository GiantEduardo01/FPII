/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea08;

/**
 *
 * @author eduardo
 */
public class Contacto {
    private String nombre;
    private int edad;
    private String estadoCivil;

    public Contacto(String nombre, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public Contacto() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
