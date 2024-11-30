/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea21;

import java.io.Serializable;

/**
 *
 * @author eduardo
 */
public class Alumn implements Serializable {
    private String name;
    private String CUI;
    private int age;

    public Alumn(String name, String CUI, int age) {
        this.name = name;
        this.CUI = CUI;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Alumn{" + "name=" + name + ", CUI=" + CUI + ", age=" + age + '}';
    }
}
