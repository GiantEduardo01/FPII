/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea08;

/**
 *
 * @author eduardo
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Eduardo", "Cuenta 01");
        Cuenta c2 = new Cuenta("Diego", "Cuenta 02");
        
        c1.depositar(500);
        c1.mostrar();
        c1.depositar(1000);
        c1.mostrar();
        
        c2.mostrar();
        c2.retirar(500);
        c2.mostrar();
        c2.depositar(1000);
        c2.mostrar();
        c2.retirar(500);
        c2.mostrar();
    }
    
}
