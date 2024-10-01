/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Facebook {
    private ArrayList<Contact> c = new ArrayList<>();
    private final Scanner SCANN = new Scanner(System.in); 
    
    public void llenarContactos() {
        UtilGenerarDatosFacebook.llenarContactos(c);
    }
    
    public void mostrarContactos() {
        System.out.println("\nLista de Contactos");
        System.out.println(this);
    }
    
    public void mostrarContactosPorNombre() { 
        ordenarPorNombre();
        System.out.println("\nLista de Contactos por nombre");
        System.out.println(this);
    }
    
    public void buscarContactoPorNombre() {
        mostrarContactosPorNombre();
        System.out.print("\nIngresar nombre a buscar: ");
        String name = SCANN.nextLine();
        
        int index = busquedaBinaria(name);
        if (index != -1) {
            System.out.println("Se encontró contacto: " + this.c.get(index));
        } else {
            System.out.println("No se encontró contacto alguno con ese nombre");
        }
        
    }
    
    /*Algoritmos de búsqueda y ordenamiento*/
    private void ordenarPorNombre() { //Se implementa el bubble sort
        for (int i = 0; i < this.c.size() - 1; i++) {
            for (int j = 0; j < this.c.size() - 1 - i; j++) {        
                Contact c1 = this.c.get(j);
                Contact c2 = this.c.get(j + 1);
                if (c1.tieneMayorNombreQue(c2)) {
                    this.c.set(j, c2);
                    this.c.set(j + 1, c1);
                }
            }
        }
    }
    
    private int busquedaBinaria(String name) {
        Contact temp = new Contact(name); //Contacto temporal usando método sobrecargados overloaded 
        
        int baja = 0, alta = c.size() - 1;
        while (baja <= alta) {
            int media = (baja + alta) / 2;
            Contact c1 = c.get(media);
            
            if (c1.tieneMismoNombreQue(temp)) {
                return media;
            } else {
                if (c1.tienenMenorNombreQue(temp)) {
                    baja = media + 1;
                } 
                if (c1.tieneMayorNombreQue(temp)) {
                    alta = media - 1;
                }
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (Contact con : c) {
            str += con.toString() + "\n";
        }
        return str;
    }
}
