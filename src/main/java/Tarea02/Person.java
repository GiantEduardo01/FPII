/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea02;

/**
 *
 * @author eduardo
 */
public class Person {
    private String name;
    private int age;
    private boolean sex;

    public Person(String name, int age, boolean sex) { //Constructor
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    //Método para mostrar información del objeto
    @Override
    public String toString() {
        String sexStr = (this.sex) ? "Masculino" : "Femenino";
        return "[Nombre: " + this.getName() +
               ", Edad: " + this.getAge() +
               ", Sexo: " + sexStr + "]";
    }  
}
