/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea13;

/**
 *
 * @author eduardo
 */
public class Employee extends Person {
    private String ID;

    public Employee(String name, String ID) {
        super(name);
        this.ID = ID;
    }

    public Employee() {
    }

    public String getID() {
        return ID;
    }
    
    public void display() {
        super.display();
    }

    @Override
    public String toString() {
        String name = super.toString();
        return name + " ID: " + this.ID;
    }
    
    
    
}
