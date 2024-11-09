/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea15.Proyect02;

/**
 *
 * @author eduardo
 */
public class Figure {
    private double area;

    public Figure() {
    }
    
    public double getArea() {
        return area;
    }   

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figure{" + "area=" + area + '}';
    }
}
