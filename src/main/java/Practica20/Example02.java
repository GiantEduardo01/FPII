/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica20;

/**
 *
 * @author eduardo
 */
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Example02 {
    public static void main(String[] args) {
        try (Scanner scann = new Scanner(new FileReader("./src/main/java/Practica20/Files/input.txt"))) {
            System.out.println("Start Reading!");
            String line;
            //while ((line = scann.nextLine()) != null) { //We can don't use hasNextLine() method, that form is interesting for other syntaxes
            //    System.out.println(line);
            //}
            while (scann.hasNextLine()) {
                line = scann.nextLine();
                System.out.println(line);
            }
            scann.close();
        }
        catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

