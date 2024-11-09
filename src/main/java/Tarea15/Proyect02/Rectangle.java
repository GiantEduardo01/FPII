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
public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        super.setArea(calculateArea());
    }
    
    private double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", area=" + super.getArea() + '}';
    }
}
