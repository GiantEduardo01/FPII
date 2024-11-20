/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea16;

/**
 *
 * @author eduardo
 */
public class HourlyEmployee extends Employee {
    
    private int hours;
    private double payPerHour;
    
    public HourlyEmployee(String name, String DNI, double pay, int hours, int payPerHour) {
        super(name, DNI, pay); // Pay must initialize in zero
        this.hours = hours;
        this.payPerHour = payPerHour;
    }
    
    public void calculatePay() {
        double pay = this.hours * this.payPerHour;
        super.pay = pay;
    }
    
    public void addHours(int hours) {
        this.hours += hours;
    }
    
    public String toString() {
        String str = super.toString();
        return "EMPLEADO POR HORA: " + str;
    }
}
