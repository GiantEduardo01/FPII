/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea07;

/**
 *
 * @author eduardo
 */
public class Soldado {
    private String nombre;
    private String columna;
    private int fila;
    private int nivelVida;

    public Soldado(String nombre, String columna, int fila, int nivelVida) {
        this.nombre = nombre;
        this.columna = columna;
        this.fila = fila;
        this.nivelVida = nivelVida;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", columna=" + columna + ", fila=" + fila + ", nivelVida=" + nivelVida + '}';
    }
    
    
    
}
