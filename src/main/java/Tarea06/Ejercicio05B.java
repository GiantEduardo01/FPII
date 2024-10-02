/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea06;

/**
 *
 * @author eduardo
 */
import java.util.*;
public class Ejercicio05B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> numJug = new HashMap<Integer, String>();
        
        numJug.put(10, "Leonel Messi");
        numJug.put(7, "Cristiano Ronaldo");
        numJug.put(1, "Pedro Gallese");
        
        Iterator<Map.Entry<Integer, String>> it = numJug.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Número de camiseta: " + entry.getKey() + " - Nombre del futbolista: " + entry.getValue());
        }
    }
    
}
