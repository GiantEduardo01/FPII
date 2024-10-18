/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea09.Proyect03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Menu {
    static final String[] OPERACIONES = {"Suma", "Resta", "Multiplicación", "Division", "Simplificación"};
    static Scanner scann = new Scanner(System.in);
    
    private ArrayList<Imaginario> imaginarios = new ArrayList<Imaginario>();
    
    public Menu(Imaginario i1, Imaginario i2) {
        this.imaginarios.add(i1);
        this.imaginarios.add(i2);
    }
    
    public void menuInteractivo() {
        String rpta = "";
        do {
            mostrarOpciones();
            rpta = ingresarOpcion();
            if (!rpta.equals("4")) {
                efectuarOpcion(rpta);
            }
        } while(!rpta.equals("4"));
    }
    
    private void mostrarOpciones() {
        System.out.println("1. Crear ArrayList de Imaginarios");
        System.out.println("2. Mostrar todos los Imaginarios creados");
        System.out.println("3. Realizar operaciones");
        System.out.println("4. Salir");
    }
    
    private String ingresarOpcion() {
        String opcion = "";
        boolean validOpcion = false;
        String numStr = "";
        do {
            System.out.print("Ingresar opcion: ");
            opcion = scann.nextLine();
            if (opcion.length() >= 1) {
                char number = opcion.charAt(0);
                numStr = opcion.substring(0, 1);
                if (Character.isDigit(number)) {
                    int num = Integer.valueOf(numStr);
                    //System.out.println(num);
                    if (num >= 1 && num <= 4) {
                        validOpcion = true;
                    }
                }
            }
        } while (!validOpcion);
        return numStr;
    }
    
    private void efectuarOpcion(String opcion) {
        int num = Integer.valueOf(opcion);
        switch (num) {
            case 1:
                añadirImaginarios();
                break;
            case 2:
                mostrarImaginarios();
                break;
            case 3:
                operacionesMetodos();
                break;
        }
    }
    
    private void añadirImaginarios() {
        Imaginario i1 = new Imaginario((int)4, (int)11);
        Imaginario i2 = new Imaginario((int)4, (int)11);
        
        this.imaginarios.add(i1);
        this.imaginarios.add(i2);
        System.out.println();
    }
    
    private void mostrarImaginarios() {
        for (int i = 0; i < this.imaginarios.size(); i += 2) {
            Imaginario i1 = this.imaginarios.get(i);
            Imaginario i2 = this.imaginarios.get(i + 1);
            Imaginario.mostrarNumeros(i1, i2);
        }
        System.out.println();
    }
    
    private void operacionesMetodos() {
        System.out.println("\nOperaciones realizadas con métodos de instancia: ");
        emplearTipoMetodo("Instancia");
        System.out.println("Operaciones realizadas con métodos de clase: ");
        emplearTipoMetodo("Clase");
        System.out.println("Operaciones realizadas con métodos de clase principal Main: ");
        emplearTipoMetodo("ClasePrincipal");
    }
    
    private void emplearTipoMetodo(String tipoMetodo) {
        final String[] OPERACIONES = {"Suma", "Resta", "Multiplicación", "Conjugado", "Modulo"};
        final int PRIMER_NUM = 0;
        final int SEGUNDO_NUM = 1;
        
        Imaginario i1 = this.imaginarios.get(PRIMER_NUM);
        Imaginario i2 = this.imaginarios.get(SEGUNDO_NUM);
        Imaginario.mostrarNumeros(i1, i2);
        
        Imaginario rpta1 = new Imaginario();
        Imaginario rpta2 = new Imaginario();
        double mod1 = 0.0, mod2 = 0.0;
        for (int i = 0; i < OPERACIONES.length; i++) {
            System.out.println();
            switch (i) {
                case 0:
                    if (tipoMetodo.equals("Instancia")) {
                        rpta1 = i1.suma(i2);
                    }
                    if (tipoMetodo.equals("Clase")) {
                        rpta1 = Imaginario.suma(i1, i2);
                    }
                    if (tipoMetodo.equals("ClasePrincipal")) {
                        rpta1 = Ejercicio03.suma(i1, i2);
                    }
                    break;
                case 1:
                    if (tipoMetodo.equals("Instancia")) {                   
                        rpta1 = i1.resta(i2);       
                    }
                    if (tipoMetodo.equals("Clase")) {
                        rpta1 = Imaginario.resta(i1, i2);
                    }
                    if (tipoMetodo.equals("ClasePrincipal")) {
                        rpta1 = Ejercicio03.resta(i1, i2);
                    }
                    break;
                case 2:
                    if (tipoMetodo.equals("Instancia")) {    
                        rpta1 = i1.multiplicacion(i2);                    
                    }
                    if (tipoMetodo.equals("Clase")) {
                        rpta1 = Imaginario.multiplicacion(i1, i2);
                    }
                    if (tipoMetodo.equals("ClasePrincipal")) {
                        rpta1 = Ejercicio03.multiplicacion(i1, i2);
                    }
                    break;
                case 3:
                    if (tipoMetodo.equals("Instancia")) {  
                        rpta1 = i1.conjugado();
                        rpta2 = i2.conjugado();
                    }
                    if (tipoMetodo.equals("Clase")) {
                        rpta1 = Imaginario.conjugado(i1);
                        rpta2 = Imaginario.conjugado(i2);
                    }
                    if (tipoMetodo.equals("ClasePrincipal")) {
                        rpta1 = Ejercicio03.conjugado(i1);
                        rpta2 = Ejercicio03.conjugado(i2);
                    }
                    break;
                case 4:
                    if (tipoMetodo.equals("Instancia")) {  
                        mod1 = i1.modulo();
                        mod2 = i2.modulo();
                    }
                    if (tipoMetodo.equals("Clase")) {
                        mod1 = Imaginario.modulo(i1);
                        mod2 = Imaginario.modulo(i2);
                    }
                    if (tipoMetodo.equals("ClasePrincipal")) {
                        mod1 = Ejercicio03.modulo(i1);
                        mod2 = Ejercicio03.modulo(i2);
                    }
                    break;
            }
            if (i < 3) {
                Imaginario.mostrarRespuesta(OPERACIONES[i], rpta1);      
            } else {
                if (i == 3) {
                    Imaginario.mostrarRespuesta(OPERACIONES[i], i1);
                    Imaginario.mostrarRespuesta(OPERACIONES[i], i2);
                } else { 
                    Imaginario.mostrarDouble(OPERACIONES[i], mod1);
                    Imaginario.mostrarDouble(OPERACIONES[i], mod2);
                }
            }
        }
        System.out.println();
    }
    
    private ArrayList<Imaginario> makeCopy(ArrayList<Imaginario> imaginarios) {
        ArrayList<Imaginario> arr = new ArrayList<>();
        for (int i = 0; i < imaginarios.size(); i++) {
            Imaginario img = imaginarios.get(i);
            arr.add(img.makeCopy());
        }
        return arr;
    }
}
