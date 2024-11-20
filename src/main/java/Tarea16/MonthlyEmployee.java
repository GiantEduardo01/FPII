/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea16;

/**
 *
 * @author eduardo
 */
public class MonthlyEmployee extends Employee {
    private double salary;

    public MonthlyEmployee(String name, String DNI, double pay, double salary) {
        super(name, DNI, pay);
        this.salary = salary;
    }
    
    public void calculatePay() {
        super.pay = this.salary;
    }
    
    public void addHours(int hours) {
        //Dummy method for satisfy the compiler
    }
    
    public String toString() {
        String str = super.toString();
        return "EMPLEADO SUELDO FIJO: " + str;
    }

    
    
}
