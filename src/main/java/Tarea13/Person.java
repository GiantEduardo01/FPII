/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea13;

/**
 *
 * @author eduardo
 */
public class Person {
    private String name;
    
    public Person (String name) {
        this.name = name;
    }
    
    public Person() {
    }

    public String getName() {
        return name;
    }
    
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }
    
    
}
