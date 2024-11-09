/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea15.Proyect02;

/**
 *
 * @author eduardo
 */
public class Ejercico02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figure[] figures = new Figure[3];
        for (int i = 0; i < figures.length; i++) {
            if (i == 0) figures[i] = new Triangle(6, 3*Math.sqrt(3));
            if (i == 1) figures[i] = new Circle(1);
            if (i == 2) figures[i] = new Rectangle(4, 3);
        }
        
        for (Figure f : figures) {
            System.out.println(f + " - Área: "+ f.getArea());
        }
    }
    
}
