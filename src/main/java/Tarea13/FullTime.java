/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea13;

/**
 *
 * @author eduardo
 */
public class FullTime extends Employee {
    private double salary;

    public FullTime(String name, String ID, double salary) {
        super(name, ID);
        this.salary = salary;
    }

    public FullTime() {
    }
    
    public void display() {
        super.display();
    }

    @Override
    public String toString() {
        String previosData = super.toString();
        return previosData + " Salary: " + this.salary;
    }
    
    
    
    
}
