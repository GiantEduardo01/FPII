/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea15.Proyect02;

import Tarea15.Proyect01.*;

/**
 *
 * @author eduardo
 */
public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        super.setArea(calculateArea());
    }
    
    private double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", area=" + super.getArea() + '}';
    }

}
