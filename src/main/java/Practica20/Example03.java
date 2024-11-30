/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica20;

/**
 *
 * @author eduardo
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Example03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter("./src/main/java/Practica20/Files/report.txt", true));
            for (int i = 1; i <= 10; i++) {
                pw.print("Número: " + i + ", Cuadrado: " + Math.pow(i, 2));
                pw.println();
            }
            System.out.println("The numbers have been writed");
            pw.close();
        }
        catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
    
}
