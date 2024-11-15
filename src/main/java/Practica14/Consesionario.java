/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica14;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Consesionario {
    private ArrayList<Auto> autos = new ArrayList<>();
    private String nameCompany;
    private ArrayList<Vendedor> employees = new ArrayList<>(); 
    private Gerente boss;

    public Consesionario(String nameCompany, Gerente boss) {
        this.nameCompany = nameCompany;
        this.boss = boss;
    }
    
    public void addVendedor(Vendedor e) {
        this.employees.add(e);
        
    }

    @Override
    public String toString() { 
        String autosStr = "Los autos en el consesionario son: \n";
        for (Auto a : this.autos) {
            autosStr += a.toString() + "\n";
        }
        
        String employeesStr = "Los vendedores en el consesionario son: \n";
        for (Vendedor v: this.employees) {
            employeesStr += v.toString() + "\n";
        }

        return "Nombre del consesionario: " + this.nameCompany + " - Gerente: " + this.boss + "\n";
    }
}
