/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea10.Proyect01;

/**
 *
 * @author eduardo
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        
        p1.setName("Pedro");
        p2.setName("Benji");
        System.out.println(p1.getName() + ", " + p2.getName());
        
        p1.swapPerson(p2);
        System.out.println(p1.getName() + ", " + p2.getName());
    }
}
