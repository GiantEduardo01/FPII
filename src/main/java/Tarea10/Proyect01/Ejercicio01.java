/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea10.Proyect01;

import Tarea10.Proyect02.Car;

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
        Car jonhCar = new Car();
        Car stacyCar;
        
        jonhCar.setMake("Honda").setYear(2004).setColor("Red");
    
        stacyCar = jonhCar.makeCopy();
        stacyCar.setColor("Peach");
        
        System.out.println("JohnCar: " + jonhCar);
        System.out.println("StacyCar: " + stacyCar);
    }
    
}
