/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea13;

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
        System.out.println("Object of the kind Person: ");
        Person p = new Person("Eduardo");
        p.display();
        
        System.out.println("Object of the kind Employee: ");
        Employee e = new Employee(p.getName(), "75880091");
        e.display();
        
        System.out.println("Object of the kind FullTime: ");
        FullTime f = new FullTime(e.getName(), e.getID(), (double)2000);
        f.display();
    }
    
}
