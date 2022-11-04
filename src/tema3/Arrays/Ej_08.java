package tema3.Arrays;

import java.util.Scanner;

public class Ej_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String[] alumnos = {"Francisco", "Marcos","Laura","Marta","Pedro"};
        double[] primerTrimestre = {7,10,4,5,6};
        double[] segundoTrimestre = {4,10,10,5,5};
        double[] tercerTrimestre = {1,10,8,2,3};
        
        double mediaAlumno;
        double sumaPrimerTrimestre = 0;
        double sumaSegundoTrimestre = 0;
        double sumaTercerTrimestre = 0;
        int posicion;
        
        System.out.println("Listado de alumnos: ");
        System.out.println("------------------- ");
        
        for (int i=0;i<alumnos.length;i++){
            System.out.println(i+1 + ".- " +alumnos[i]);
        }

        System.out.println("Dime la posición del alumno a buscar: ");
        posicion = Integer.parseInt (scanner.nextLine());
        
        
        
        mediaAlumno = (primerTrimestre [posicion-1] + segundoTrimestre [posicion-1] + tercerTrimestre [posicion-1] )/3;
        System.out.println("La nota media final de " +alumnos[posicion-1]+ " es " + mediaAlumno);
        
        System.out.println("-----medias del grupo----");
        
        for (int i=0; i<alumnos.length;i++){
            
            sumaPrimerTrimestre = (sumaPrimerTrimestre + primerTrimestre [i])/alumnos.length;
            sumaSegundoTrimestre = (sumaSegundoTrimestre + segundoTrimestre [i])/alumnos.length;
            sumaTercerTrimestre = (sumaTercerTrimestre + tercerTrimestre [i])/alumnos.length;
            
        }
        
        System.out.println("Primer trimestre: " + sumaPrimerTrimestre);
        System.out.println("Segundo trimestre: " + sumaSegundoTrimestre);
        System.out.println("Tercer trimestre: " + sumaTercerTrimestre);
        
        
    }
}

