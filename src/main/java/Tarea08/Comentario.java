/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea08;

/**
 *
 * @author eduardo
 */
public class Comentario {
    private String contenido;
    private String estado;
    private Contacto duenio;

    public Comentario(String contenido, String estado, Contacto duenio) {
        this.contenido = contenido;
        this.estado = estado;
        this.duenio = duenio;
    }
    
    public Comentario(Contacto duenio) {
        this.duenio = duenio;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void mostrar() {
        System.out.println(this.duenio.getNombre() + " ha comentado: ");
        System.out.println(this.contenido);
    }

    @Override
    public String toString() {
        return "Comentario{" + "contenido=" + contenido + ", estado=" + estado + ", duenio=" + duenio + '}';
    }
    
    
    
}
