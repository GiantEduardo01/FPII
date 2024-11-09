/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea15.Proyect01;

/**
 *
 * @author eduardo
 */
public class Triangle {
    private double base;
    private double height;
    private double area;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = calculateArea();
    }
    
    private double calculateArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", area=" + area + '}';
    }
}
