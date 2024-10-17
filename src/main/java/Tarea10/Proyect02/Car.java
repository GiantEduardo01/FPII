/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea10.Proyect02;

/**
 *
 * @author eduardo
 */
public class Car {
    private String make;
    private int year;
    private String color;

    public Car(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }
    
    public Car() {
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }
    
    public Car makeCopy() {
        return new Car(this.make, this.year, this.color);
    }
    
    public boolean equals(Car c) {
        return this.make.equals(c.getMake()) && this.year   == c.getYear() && this.color.equals(c.getColor());
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", year=" + year + ", color=" + color + '}';
    }
    
    
    
}
