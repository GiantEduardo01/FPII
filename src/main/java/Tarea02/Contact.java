/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea02;

/**
 *
 * @author eduardo
 */
public class Contact {
    private String phone;
    private String name;

    public Contact(String name, String phone) { //Constructor
        if (this.validPhoneNumber(phone)) {
            this.phone = phone;
            this.name = name;
        } else {
            this.phone = null;
            this.name = null;
            if (phone != null) { //Verifica intento de instancia
                System.out.println();
                System.out.println("Número inválido, no se puede crear el contacto");
            }
        }
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String phone) {
        if (this.validPhoneNumber(phone)) {
            this.phone = phone;
        } else {

        }
    }

    public String getPhone() {
        return this.phone;
    }

    //Método para verificar si el número que se ingresa es válido
    private boolean validPhoneNumber(String s) {
        if (s == null) return false;
        if (s.length() != 9) { //Se verifica que el número tenga 9 dígitos
            System.out.println("¡¡No se identifican 9 caracteres!!");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (!Character.isDigit(n)) { //Se verifica que todos sean números del 0 al 9
                System.out.println("¡¡Algunos caracteres no son valores numéricos!!");
                return false;
            }
            if (i == 0) {
                if (n != '9') { //Se verifica que comienze con 9
                    System.out.println("¡¡El número debe comenzar con 9!!");
                    return false;
                }
            }
        }
        return true;
    }

    //Método para mostrar información del objeto
    @Override
    public String toString() {
        return "[Nombre: " + this.getName() +
               ", Numero: " + this.getPhone() + "]";
    }
}
