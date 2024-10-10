/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea08;

/**
 *
 * @author eduardo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto c1;
        Comentario com1;
        
        c1 = new Contacto();
        c1.setNombre("Diego");
        c1.setEdad(18);
        
        com1 = new Comentario(c1);
        com1.setContenido("Eating pizza every day");
        com1.setEstado("Publico");
        
        com1.mostrar();
        
        
    }
    
}
