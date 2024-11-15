/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica14;

/**
 *
 * @author eduardo
 */
public class Vendedor extends Trabajador{
    private int ventasMes;
    private int ventasTotales;
    private double comision;
    
    private static final double COMISION_BASICA = 250;
    private static final double COMISION_MEDIA = 500;
    private static final double COMISION_ALTA = 1000;
    
    private static final double SUELDO = 1250;

    public Vendedor(int ventasMes, int ventasTotales, String nombre, String apellido, String DNI, int edad) {
        super(nombre, apellido, DNI, edad);
        Trabajador.setSueldoBase(SUELDO);
        
        this.ventasMes = ventasMes;
        this.ventasTotales = ventasTotales;
        this.calcularSalario();
    }

    private void calcularSalario() {
        double comision = 0.0;
        if (this.ventasTotales < 15) {
            comision = COMISION_BASICA;
        } else if (this.ventasTotales < 30) {
            comision = COMISION_MEDIA;
        } else if (this.ventasTotales < 60) {
            comision = COMISION_ALTA;
        }
        
        this.comision = comision;
        
        double salario = Vendedor.SUELDO + (this.ventasMes * comision);
        super.setSalario(salario);
    }
    
    @Override
    public String toString() {
        String trabajador = super.toString();
        trabajador += "Sueldo Base: " + Vendedor.SUELDO + " - Ventas Mes: " + this.ventasMes + "  - Ventas totales: " + this.ventasTotales + "\n";
        trabajador += "Salario: " +  super.getSalario() + "\n";
        return trabajador;
    }
}
