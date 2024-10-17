/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea10.Proyect02;

/**
 *
 * @author eduardo
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void swapPerson(Person p) {
        String tempName = this.name;
        this.setName(p.getName());
        p.setName(tempName);
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
    
    
}
