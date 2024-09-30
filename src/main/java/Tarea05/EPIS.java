/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea05;

/**
 *
 * @author eduardo
 */
public class EPIS {
    private Alumno[][] alumnado = new Alumno[UtilGenerarDatos.NUMERO_ANIOS][UtilGenerarDatos.ALUMNOS_POR_ANIO];
    
    public EPIS() {
        UtilGenerarDatos.generarAlumnado(this.alumnado);
        ingresarDatos();
    }
    
    public void ingresarDatos() {
        System.out.println("Los datos de los alumnos de EPIS son ingresados");
    }
    
    public void mostrarAlumnadoPorAnio() {
        System.out.println(this);
    }
    
    public void mostrarTodoElAlumnado() {
        System.out.println(toStringTotal());
    }
    
    public void mostrarPromedioPonderadoPorAnio() {
        for (int i = 0; i < this.alumnado.length; i++) {
            double prom = calcularPromedioPonderadoPorAnio(i);
            System.err.println("El promedio ponderado del año " + (i + 1) + " es: " + prom);
        }
    }
    
    public void mostrarPromedioPonderado() {
        double proPon = calcularPromedioPonderado();
        System.out.println("El promedio ponderado de todo EPIS es: " + proPon);
    }
    
    public void mostrarMayorPromedioPorAnio() {
        for (int i = 0; i < this.alumnado.length; i++) {
            double prom = calcularMayorPromedioPorAnio(i);
            System.err.println("El mayor promedio del año " + (i + 1) + " es: " + prom);
        }
    }
    
    public void mostrarMenorPromedioPorAnio() {
        for (int i = 0; i < this.alumnado.length; i++) {
            double prom = calcularMenorPromedioPorAnio(i);
            System.err.println("El menor promoedio del año " + (i + 1) + " es: " + prom);
        }
    }
    
    public void mostrarMayorPromedio() {
        double prom = calcularMayorPromedio();
        System.out.println("El mayor promedio de todo EPIS es: " + prom);
    }
    
    public void mostrarMenorPromedio() {
        double prom = calcularMenorPromedio();
        System.out.println("El menor promedio de todo EPIS es: " + prom);
    }
    
    public void mostrarRankingPorAnio() {
        for (int i = 0; i < this.alumnado.length; i++) {
            rankearAnio(i);
        }
        
        System.out.println("\nRanking de cada año");
        mostrarAlumnadoPorAnio();
    }
    
    public void mostrarRanking() {
        rankear();
        System.out.println("\nRanking de todo EPIS");
        mostrarTodoElAlumnado();
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.alumnado.length; i++) {
            str += "Año " + (i + 1) + "\n";
            for (int j = 0; j < this.alumnado[i].length; j++) {
                str += this.alumnado[i][j] + "\n";
            }
            str += "\n";
        }
        return str;
    }
    
    /*Métodos adicionales*/
    private String toStringTotal() {
        String str = "";
        for (int i = 0; i < this.alumnado.length; i++) {
            for (int j = 0; j < this.alumnado[i].length; j++) {
                str += this.alumnado[i][j] + "\n";
            }
        }
        return str;
    }

    private double  calcularPromedioPonderadoPorAnio(int anio) {
        double sum = 0.0;
        for (int j = 0; j < this.alumnado[anio].length; j++) {
            sum += this.alumnado[anio][j].getPromedioPonderado();
        }

        return sum / (this.alumnado[anio].length);
    }
    
    private double  calcularPromedioPonderado() {
        double sum = 0.0;
        for (int i = 0; i < this.alumnado.length; i++) {
            for (int j = 0; j < this.alumnado[i].length; j++) {
                sum += this.alumnado[i][j].getPromedioPonderado();
            }
        }
        return sum / (this.alumnado.length * this.alumnado[0].length);
    }
    
    private double calcularMayorPromedioPorAnio(int anio) {
        double mayor = Double.MIN_VALUE;
        for (int j = 0; j < this.alumnado[anio].length; j++) {
            if (this.alumnado[anio][j].getPromedioPonderado() >= mayor) {
                mayor = this.alumnado[anio][j].getPromedioPonderado();
            }
        }
        return mayor;
    }
    
    private double calcularMenorPromedioPorAnio(int anio) {
        double menor = Double.MAX_VALUE;
        for (int j = 0; j < this.alumnado[anio].length; j++) {
            if (this.alumnado[anio][j].getPromedioPonderado() <= menor) {
                menor = this.alumnado[anio][j].getPromedioPonderado();
            }
        }
        return menor;
    }
    
    private double calcularMayorPromedio() {
        double mayor = Double.MIN_VALUE;
        for (int i = 0; i < this.alumnado.length; i++) {
            for (int j = 0; j < this.alumnado[i].length; j++) {
                if (this.alumnado[i][j].getPromedioPonderado() >= mayor) {
                    mayor = this.alumnado[i][j].getPromedioPonderado();
                
                }
            }
        }
        return mayor;
    }
    
    private double calcularMenorPromedio() {
        double menor = Double.MAX_VALUE;
        for (Alumno[] alumnado1 : this.alumnado) {
            for (Alumno alumnado11 : alumnado1) {
                if (alumnado11.getPromedioPonderado() <= menor) {
                    menor = alumnado11.getPromedioPonderado();
                }
            }
        }
        return menor;
    }
    
    private void rankearAnio(int anio) {
        for (int i = 1; i < this.alumnado[anio].length; i++) {
            Alumno key = this.alumnado[anio][i];
            int j = i - 1;
            while(j >= 0 && key.tieneMayorPromedioQue(this.alumnado[anio][j])) {
                this.alumnado[anio][j + 1] = this.alumnado[anio][j];
                j--;
            }
            this.alumnado[anio][j + 1] = key;
        }
    }
    
    private void rankear() {
        int anios = this.alumnado.length;
        int alumnos = this.alumnado[0].length;
        Alumno[] linealAlumnos = new Alumno[anios * alumnos];
       
        int k = 0;
        for (int i = 0; i < this.alumnado.length; i++) { //Se transfieren todos los alumnos a un arreglo lineal (unidimensional)
            for (int j = 0; j < this.alumnado[i].length; j++) {
                linealAlumnos[k] = this.alumnado[i][j];
                k++;
            }
        }
        
        //Selection sort
        for (int i = 1; i < linealAlumnos.length; i++) {
            int index = i - 1;
            for (int j = i; j < linealAlumnos.length; j++) {
                if (linealAlumnos[j].tieneMayorPromedioQue(linealAlumnos[index])) {
                    index = j;
                }
            }
            Alumno temp = linealAlumnos[i - 1];
            linealAlumnos[i - 1] = linealAlumnos[index];
            linealAlumnos[index] = temp;
        }
        
        k = 0;
        for (int i = 0; i < this.alumnado.length; i++) { //Se transfiere de nuevo al arreglo bidimensional
            for (int j = 0; j < this.alumnado[i].length; j++) {
                this.alumnado[i][j] = linealAlumnos[k];
                k++;
            }
        }
    }
}
