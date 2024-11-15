/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica14;

/**
 *
 * @author eduardo
 */
public class Auto {
    private String color;
    private String clase;
    private String marca;
    private String ID;

    public Auto(String color, String clase, String marca, String ID) {
        this.color = color;
        this.clase = clase;
        this.marca = marca;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", clase=" + clase + ", marca=" + marca + ", ID=" + ID + '}';
    }
    
    
}
