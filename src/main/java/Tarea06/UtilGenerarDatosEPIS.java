/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea06;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduardo
 */
public class UtilGenerarDatosEPIS {
    private static final Random RAND = new Random();
    
    public static final int NUMERO_ANIOS = 5;
    public static final int ALUMNOS_POR_ANIO = 10;
    
    private static final String ABECEDARIO = "abcdefghijklmnopqrstuvwxyz";
    private static final int LETRAS_POR_NOMBRE = 8;
    private static final int MINIMA_EDAD = 17;
    private static final int MAXIMA_EDAD = 25;
    private static final int MINIMA_NOTA = 0;
    private static final int MAXIMA_NOTA = 19;
    
    public static void generarAlumnado(ArrayList<ArrayList<Alumno>> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < ALUMNOS_POR_ANIO; j++) {
                String name = generarNombre();
                int edad = generarEdad();
                double promedioPonderado = generarPromedioPonderado();
                
                a.get(i).add(new Alumno(name, edad, promedioPonderado));
            }
        }
    }
    
    
    /*Métodos para la creación de un nombre aleatorio*/
    private static String generarNombre() {
        String name = "";
        for (int i = 0; i < LETRAS_POR_NOMBRE; i++) {
            String letra = escogerLetra();
            if (capitalizarLetra()) {
                letra = letra.toUpperCase();
            }
            name += letra;
        }
        return name;
    }
    
    private static boolean capitalizarLetra() {
        int num = RAND.nextInt(2);
        return num == 0;
    }
    
    private static String escogerLetra() {
        int num = RAND.nextInt(ABECEDARIO.length());
        return ABECEDARIO.substring(num, num + 1);
    }
    
    /*Método para la creación de una edad aleatoria en base a una edad míima y una edad máxima*/
    private static int generarEdad() {
        int num = RAND.nextInt(MAXIMA_EDAD - MINIMA_EDAD + 1) + MINIMA_EDAD;
        return num;
    }
    
    /*Método para determinar un promedio ponderado aleatorio con decimales*/
    private static double generarPromedioPonderado() {
        
        double valorEntero = (double)RAND.nextInt(MAXIMA_NOTA - MINIMA_NOTA + 1) + MINIMA_NOTA;
        double decenaDecimal = (double)RAND.nextInt(10);
        decenaDecimal *= 0.1;
        
        double unidadDecimal = (double)RAND.nextInt(10);
        unidadDecimal *= 0.01;
        
        return valorEntero + decenaDecimal + unidadDecimal;
    }
}
