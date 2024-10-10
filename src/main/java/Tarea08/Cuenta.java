/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea08;

/**
 *
 * @author eduardo
 */
public class Cuenta {
    private String nombreDuenio;
    private int cantidadSoles;
    private String nombreCuenta;

    public Cuenta(String nombre, int cantidadSoles, String nombreCuenta) {
        this.nombreDuenio = nombre;
        this.cantidadSoles = cantidadSoles;
        this.nombreCuenta = nombreCuenta;
    }
    
    public Cuenta(String nombre, String nombreCuenta) {
        this.nombreDuenio = nombre;
        this.nombreCuenta = nombreCuenta;
    }

    public void depositar(int cantidadSoles) {
        this.cantidadSoles += cantidadSoles;
        System.out.println("");
        System.out.println(this.nombreCuenta + " => Se depositan " + cantidadSoles + " soles");
    }
    
    public void retirar(int cantidadSoles) {
        System.out.println("");
        if (cantidadSoles <= this.cantidadSoles) {
            this.cantidadSoles -= cantidadSoles;
            System.out.println(this.nombreCuenta + " => Se retiran " + cantidadSoles + " soles");
        } else {
            System.out.println(this.nombreCuenta + " => Cantidad de saldo insuficiente!!");
        }
    }
    
    public void mostrar() {
        System.out.println("");
        System.out.println(this);
    }
    
    @Override
    public String toString() {  
        return "\n" + this.nombreCuenta + " => Saldo: " + this.cantidadSoles + " - Duenio: " + this.nombreDuenio;
    }
    
    
}
