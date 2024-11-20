/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea16;

/**
 *
 * @author eduardo
 */
public abstract class Employee {
    protected String name;
    protected String DNI;
    protected double pay; //Pay end mounth 
    
    public Employee(String name, String DNI, double pay) {
        this.name = name;
        this.DNI = DNI;
        this.pay = pay;
    }
    
    public abstract void calculatePay();
    public abstract void addHours(int hours);
    
    public String toString() {
        return "Nombre: " + this.name + " DNI: " + this.DNI + " Paga: " + this.pay;
    }
}
