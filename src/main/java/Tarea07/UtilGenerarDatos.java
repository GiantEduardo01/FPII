/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea07;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public class UtilGenerarDatos {
    private static final String PREFIJO_NOMBRE = "Soldado";
    private static final int TOTAL_FILAS = 10;
    private static final int MAXIMO_PUNTAJE = 5;
    private static final String COLUMNAS = "ABCDEFJHIJ";
    
    
    //Método que rellena todos los datos de un arreglo de soldados considerando repeticiones
    //El número de soldados generados es aleatorio, siendo un máximo de 10
    public static void llenarArreglo(Soldado[] e) { 
        
        int i = 0;
        do {
            String nameNave = obtenerNombre(i);
            int fila = obtenerFila();
            String columna = obtenerColumna();
            int puntos = obtenerPuntos();
            
            Soldado s = new Soldado(nameNave, columna, fila, puntos);
            e[i] = s;
            i++;
        } while (i < e.length);
    }
    
    private static String obtenerNombre(int enesima) {
        String str = PREFIJO_NOMBRE;
        String num = (enesima < 10) ? "0" + enesima : "" + enesima;
        return str + num;
    }
    
    private static int obtenerFila() {
        return Utilidades.RAND.nextInt(TOTAL_FILAS) + 1; 
    }
    
    private static String obtenerColumna() {
        int index = Utilidades.RAND.nextInt(TOTAL_FILAS);
        return COLUMNAS.substring(index, index + 1);
    }
    
    private static int obtenerPuntos() {
        return Utilidades.RAND.nextInt(MAXIMO_PUNTAJE) + 1;
    }   
}
