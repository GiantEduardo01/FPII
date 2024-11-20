/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea16;

/**
 *
 * @author eduardo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] employees = new Employee[100];
        final String prefixName = "Empleado";
        final String generalDNI = "75880091";
        final double basicSalary = 1200;
        final int basicPayPerHour = 45;
        final int workedHoursOne = 16;
        final int workedHoursTwo =  9;
        
        for (int i = 0; i < employees.length; i++) {
            String name = prefixName + i;
            if (i % 3 == 0) {
                employees[i] = new HourlyEmployee(name, generalDNI, 0, workedHoursOne, basicPayPerHour);
            }
            if (i % 3 == 1) {
                employees[i] = new HourlyEmployee(name, generalDNI, 0, workedHoursTwo, basicPayPerHour);
                employees[i].addHours(160);
            }
            if (i % 3 == 2) {
                employees[i] = new MonthlyEmployee(name, generalDNI, 0, basicSalary);
            }
            employees[i].calculatePay();
            System.out.println(employees[i]);
        }
    }
    
}
