/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica14;
/**
 *
 * @author eduardo
 */
public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g = new Gerente(1, "Eduardo", "Melendez", "75880091", 20);
        Consesionario c = new Consesionario("Carros Good", g);
        
        Vendedor v1 = new Vendedor(14, 20, "Ricardo", "Gomez", "77001122", 19);
        Vendedor v2 = new Vendedor(19, 69, "Maria", "Lopez", "78119921", 20);
        c.addVendedor(v1);
        c.addVendedor(v2);
        
        System.out.println(c);
        
    }
    
}
