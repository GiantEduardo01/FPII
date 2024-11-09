/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea15.Proyect01;

/**
 *
 * @author eduardo
 */
public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = calculateArea();
    }
    
    private double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", area=" + area + '}';
    }

}
