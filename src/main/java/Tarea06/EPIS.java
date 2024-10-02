/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea06;

import java.util.ArrayList;



/**
 *
 * @author eduardo
 */
public class EPIS {
    private final ArrayList<ArrayList<Alumno>> alumnado = new ArrayList<>();
    private final ArrayList<Alumno> alumnadoLineal = new ArrayList<>();
    
    /*Constructor que crea 5 ArrayList para cada año en alumnado*/
    public EPIS() {
        for (int i = 0; i < aniosEPIS(); i++) {
            this.alumnado.add(new ArrayList<Alumno>());
        }
        UtilGenerarDatosEPIS.generarAlumnado(this.alumnado);
        ingresarDatos();
    }
    
    
    //-----------------------------Métodos para manejo versátil de las estructura alumnado-----------------------------
    private int aniosEPIS() { //Retorna número de alumnos por anio
        return UtilGenerarDatosEPIS.NUMERO_ANIOS;
    }
    
    private int alumnosPorAnioEPIS(int anio) { //Retorna el número de alumnos en un anio específico
        return this.alumnado.get(anio).size();
    }
    
    private int alumnosEPIS() { //Retorna el número de alumnos global
        int count = 0;
        for (int i = 0; i < aniosEPIS(); i++) {
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                count++;
            }
        }
        return count;
    }
    
    private void colocarAlumno(int anio, int pos, Alumno alum) {
        this.alumnado.get(anio).set(pos, alum);
    }
    
    private Alumno obtenerAlumnoAnioPosicion(int anio, int pos) { //Retorna el alumno de un anio en una posición
        return this.alumnado.get(anio).get(pos);
    }
    //-----------------------------Métodos para manejo eficiente de las estructura alumnado-----------------------------
    

    //-----------------------------Métodos para manejo versátil de las estructura alumnado lineal-----------------------------
    private void addAlumnadoLineal(Alumno alum) {
        this.alumnadoLineal.add(alum);
    }
    
    private void setAlumnadoLineal(int index, Alumno alum) {
        this.alumnadoLineal.set(index, alum);
    }
    
    private int sizeAlumnadoLineal() {
        return this.alumnadoLineal.size();
    }
    
    private Alumno obtenerDeAlumnadoLineal(int index) {
        return this.alumnadoLineal.get(index);
    }
    //-----------------------------Métodos para manejo versátil de las estructura alumnado lineal-----------------------------
    
    //-----------------------------Métodos para simular ingreso de datos y mostrar datos-----------------------------
    public void ingresarDatos() {
        System.out.println("Los datos de los alumnos de EPIS son ingresados");
    }
    
    public void mostrarAlumnadoPorAnio() {
        System.out.println(this);
    }
    
    public void mostrarAlumnado() {
        System.out.println(this.toStringTotal());
    }
    
    public void mostrarAlumnadoLineal() {
        System.out.println(this.toStringAlumnadoLineal());
    }
    //-----------------------------Métodos para simular ingreso de datos y mostrar datos-----------------------------
    
    
    //-----------------------------Métodos para mostrar promedio total, mayor, menor por anio y global-----------------------------
    public void mostrarPromedioPonderadoPorAnio() {
        for (int i = 0; i < aniosEPIS(); i++) {
            double prom = calcularPromedioPonderadoPorAnio(i);
            System.err.println("El promedio ponderado del año " + (i + 1) + " es: " + prom);
        }
    }
    
    public void mostrarPromedioPonderado() { //Promedio Ponderado global
        double proPon = calcularPromedioPonderado();
        System.out.println("El promedio ponderado de todo EPIS es: " + proPon);
    }
    
    public void mostrarMayorPromedioPorAnio() { 
        for (int i = 0; i < aniosEPIS(); i++) {
            double prom = calcularMayorPromedioPorAnio(i);
            System.err.println("El mayor promedio del año " + (i + 1) + " es: " + prom);
        }
    }
    
    public void mostrarMayorPromedio() { //Mayor promedio global
        double prom = calcularMayorPromedio();
        System.out.println("El mayor promedio de todo EPIS es: " + prom);
    }
    
    public void mostrarMenorPromedioPorAnio() {
        for (int i = 0; i < aniosEPIS(); i++) {
            double prom = calcularMenorPromedioPorAnio(i);
            System.err.println("El menor promoedio del año " + (i + 1) + " es: " + prom);
        }
    }
    
    public void mostrarMenorPromedio() { //Menor promedio global
        double prom = calcularMenorPromedio();
        System.out.println("El menor promedio de todo EPIS es: " + prom);
    }
    //-----------------------------Métodos para mostrar promedios, mayor, menor por anio y global-----------------------------
    
    
    //-----------------------------Métodos para mostrar Ranking por anio y global-----------------------------
    public void mostrarRankingPorAnio() {
        for (int i = 0; i < aniosEPIS(); i++) {
            rankearAnio(i);
        }
        
        System.out.println("\nRanking de cada año");
        mostrarAlumnadoPorAnio();
    }
    
    public void mostrarRanking() { //Muestra el ranking global
        rankear();
        System.out.println("\nRanking de todo EPIS");
        mostrarAlumnadoLineal();
    }
    //-----------------------------Métodos para mostrar Ranking por anio y global-----------------------------
    
    
    //-----------------------------Métodos toString() para concatenar información por anio y global-----------------------------
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < aniosEPIS(); i++) {
            str += "Año " + (i + 1) + "\n";
            
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                str += obtenerAlumnoAnioPosicion(i, j) + "\n";
            }
            str += "\n";
        }
        return str;
    }
    
    /*Métodos adicionales*/
    private String toStringTotal() {
        String str = "";
        for (int i = 0; i < aniosEPIS(); i++) {   
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                str += obtenerAlumnoAnioPosicion(i, j) + "\n";
            }
        }
        return str;
    }
    
    private String toStringAlumnadoLineal() {
        String str = "";
        for (int i = 0; i < sizeAlumnadoLineal(); i++) {
            str += obtenerDeAlumnadoLineal(i) + "\n";
        }
        return str;
    }
    //-----------------------------Métodos toString() para concatenar información por anio y global-----------------------------
   
    
    //-----------------------------Métodos para calcular promedio total, mayor, menor por anio y global-----------------------------
    private double  calcularPromedioPonderadoPorAnio(int anio) {
        double sum = 0.0;
        for (int j = 0; j < alumnosPorAnioEPIS(anio); j++) {
            sum += obtenerAlumnoAnioPosicion(anio, j).getPromedioPonderado();
        }

        return sum / (alumnosPorAnioEPIS(anio));
    }
    
    private double  calcularPromedioPonderado() { //Calcula el promedio ponderado global
        double sum = 0.0;
        for (int i = 0; i < aniosEPIS(); i++) {
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                sum += obtenerAlumnoAnioPosicion(i, j).getPromedioPonderado();
            }
        }
        return sum / alumnosEPIS();
    }
    
    private double calcularMayorPromedioPorAnio(int anio) {
        double mayor = Double.MIN_VALUE;
        for (int j = 0; j < alumnosPorAnioEPIS(anio); j++) {
            Alumno alum = obtenerAlumnoAnioPosicion(anio, j);
            if (alum.getPromedioPonderado() >= mayor) {
                mayor = alum.getPromedioPonderado();
            }
        }
        return mayor;
    }
    
    private double calcularMayorPromedio() { //Calcula el mayor promedio ponderado global
        double mayor = Double.MIN_VALUE;
        for (int i = 0; i < aniosEPIS(); i++) {
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                Alumno alum = obtenerAlumnoAnioPosicion(i, j);
                
                if (alum.getPromedioPonderado() >= mayor) {
                    mayor = alum.getPromedioPonderado();
                }
            }
        }
        return mayor;
    }
    
    private double calcularMenorPromedioPorAnio(int anio) {
        double menor = Double.MAX_VALUE;
        for (int j = 0; j < alumnosPorAnioEPIS(anio); j++) {
            Alumno alum = obtenerAlumnoAnioPosicion(anio, j);
            if (alum.getPromedioPonderado() <= menor) {
                menor = alum.getPromedioPonderado();
            }
        }
        return menor;
    }
    
    private double calcularMenorPromedio() { //Calcula el menor promedio ponderado global
        double menor = Double.MAX_VALUE;
        for (int i = 0; i < aniosEPIS(); i++) {
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                Alumno alum = obtenerAlumnoAnioPosicion(i, j);
                
                if (alum.getPromedioPonderado() <= menor) {
                    menor = alum.getPromedioPonderado();
                }
            }
        }
        return menor;
    }
    //-----------------------------Métodos para calcular promedio total, mayor, menor por anio y global-----------------------------
    
    
    //-----------------------------Métodos para Rankear por anio y global-----------------------------
    private void rankearAnio(int anio) {
        for (int i = 1; i < alumnosPorAnioEPIS(anio); i++) {
            Alumno key = obtenerAlumnoAnioPosicion(anio, i);
            int j = i - 1;
            while(j >= 0 && key.tieneMayorPromedioQue(obtenerAlumnoAnioPosicion(anio, j)) ) {
                Alumno alum = obtenerAlumnoAnioPosicion(anio, j);
                colocarAlumno(anio, j + 1, alum);
                j--;
            }
            colocarAlumno(anio, j + 1, key);
        }
    }
    
    private void rankear() {
        for (int i = 0; i < aniosEPIS(); i++) { //Se transfieren todos los alumnos al atributo ArrayList lineal (unidimensional)
            for (int j = 0; j < alumnosPorAnioEPIS(i); j++) {
                Alumno alum = obtenerAlumnoAnioPosicion(i, j);
                addAlumnadoLineal(alum);
            }
        }
        
        //Selection sort
        for (int i = 1; i < sizeAlumnadoLineal(); i++) {
            int index = i - 1;
            for (int j = i; j < sizeAlumnadoLineal(); j++) {
                Alumno alum = obtenerDeAlumnadoLineal(j);
                Alumno mayorAlum = obtenerDeAlumnadoLineal(index);
                if (alum.tieneMayorPromedioQue(mayorAlum)) {
                    index = j;
                }
            }
            
            Alumno temp = obtenerDeAlumnadoLineal(i - 1);
            Alumno alumPrime = obtenerDeAlumnadoLineal(index);
            
            setAlumnadoLineal(i - 1, alumPrime);
            setAlumnadoLineal(index, temp);
        }
    }   
    //-----------------------------Métodos para Rankear por anio y global-----------------------------
}
