/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea06;

import java.util.*;


/**
 *
 * @author eduardo
 */
public class Ejercicio05C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> numJug = new HashMap<String, String>();
        
        numJug.put("IS001", "Intoducción a la Computación");
        numJug.put("IS002", "Fundamentos de la Programación I");
        numJug.put("IS003", "Estructuras Discretas I");
        
        mostrarTodos(numJug);
        eliminarCurso(numJug);
        mostrarTodos(numJug);
        mostrarSegunCod(numJug);
        
        System.out.println("\nSe elimina todo");
        numJug.clear();
        mostrarTodos(numJug);
    }
    
    static void mostrarTodos(HashMap<String, String> numJug) {
        Iterator<Map.Entry<String, String>> it = numJug.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
    static void eliminarCurso(HashMap<String, String> numJug) {
        Scanner scann = new Scanner(System.in);
        Iterator<Map.Entry<String, String>> it = numJug.entrySet().iterator();
        
        while (it.hasNext()) {
            System.out.print("Ingresar código para eliminar: ");
            String code = scann.nextLine();
            if (numJug.containsKey(code)) {
                numJug.remove(code);
                break;
            }
        }
    }
    
    static void mostrarSegunCod(HashMap<String, String> numJug) {
        Scanner scann = new Scanner(System.in);
        
        Iterator<Map.Entry<String, String>> it = numJug.entrySet().iterator();
        while (it.hasNext()) {
            System.out.print("Ingresar código para buscar: ");
            String code = scann.nextLine();
            if (numJug.containsKey(code)) {
                System.out.println("Se encontró - " + code + " : " + numJug.get(code));
                break;
            }
        }
    }
}
