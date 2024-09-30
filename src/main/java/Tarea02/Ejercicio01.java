/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea02;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Ingresar la cantidad de personas: ");
        int n = scann.nextInt();
        Person[] people = new Person[n];
        ingresarPeople(people);
        mostrarPeople(people);
    }

    public static void ingresarPeople(Person[] people) {
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            scann.nextLine();
            String name;
            boolean sex;
            int age;

            System.out.println("Datos de la Persona " + (i + 1));
            System.out.print("Ingresar nombre: ");
            name = scann.nextLine();
            System.out.print("Ingresar edad: ");
            age = scann.nextInt();

            System.out.print("Ingresar sexo (false = dama) o (true = varón): ");
            sex = scann.nextBoolean();

            people[i] = new Person(name, age, sex);
            System.out.println();
        }

    }

    public static void mostrarPeople(Person[] people) {
        for (Person p : people) System.out.println(p);
    }
    
}
