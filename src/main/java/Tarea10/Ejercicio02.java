/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea10;

/**
 *
 * @author eduardo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car jonhCar = new Car();
        Car stacyCar;
        
        jonhCar.setMake("Honda");
        jonhCar.setYear(2004);
        jonhCar.setColor("Red");
        stacyCar = jonhCar.makeCopy();
        stacyCar.setColor("Peach");
        
        System.out.println("JohnCar: " + jonhCar);
        System.out.println("StacyCar: " + stacyCar);
        
        System.out.println("\nSe comparan ambos autos ¿Son Iguales?");
        if (stacyCar.equals(jonhCar)) {
            System.out.println("Son iguales!!");
        } else {
            System.out.println("Son diferentes!!");
        }
    }
    
}
