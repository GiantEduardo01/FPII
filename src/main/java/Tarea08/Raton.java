/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea08;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public class Raton {
    private double tasaCrecimiento;
    private String nombre;
    private int edadDias;
    private double pesoGramos;
    
    private static final int PESO_INICIAL = 2;
    private Random rand = new Random();
    
    private static final int PESO_MINIMO = 12;
    private static final int PESO_MAXIMO = 30;
    private final int PESO_MAXIMO_ALEATORIO= rand.nextInt(Raton.PESO_MAXIMO - Raton.PESO_MINIMO + 1) + Raton.PESO_MINIMO;

    public Raton(double tasaCrecimiento, String nombre, int edadDias) {
        this.tasaCrecimiento = tasaCrecimiento;
        this.nombre = nombre;
        this.edadDias = edadDias;
        this.pesoGramos = Raton.PESO_INICIAL;
    }
    
    public double pesoDiaEnesimo(int dias) {
        return Raton.PESO_INICIAL  + (dias * 0.1 * this.tasaCrecimiento * this.edadDias);
    }
    
    public void desarrollarRaton(int dias) {
        System.out.println("Desarrollo del raton durante " + dias + " dias");
        
        for (int i = 0; i < dias + 1; i++) {
            this.edadDias = i;
            
            double nuevoPesoGramos = pesoDiaEnesimo(i);
            this.pesoGramos = (nuevoPesoGramos <= this.PESO_MAXIMO_ALEATORIO) ? nuevoPesoGramos : this.pesoGramos;
            
            System.out.println(this);
        }
        System.out.println();
    }
    
    @Override
    public String toString() {
        return  this.nombre + "{" + "tasaCrecimiento = " + tasaCrecimiento + ", edadDias = " + edadDias + ", pesoGramos = " + pesoGramos + '}';
    }
    
    
}
