package tema3.Arrays;

import java.util.Scanner;

public class Ej_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        int [] notas = new int [5];
        int nota;
        int max = 0;
        int min = 0;
        double suma = 0;
        double media;
        
        //leer 5 notas
        for (int i=0; i< notas.length; i++) {
            
            do {
                System.out.println("Introduce una nota " +i+ ": ");
                nota = Integer.parseInt(scanner.nextLine());
            } while (nota<0 || nota>0);
            
            notas [i] = nota;
        }
        //Cálculos de máximo y mínimo
        max = notas [0]; //Supongo que el 1er valor es el máximo, se cambia si hay uno mayor
        min = notas [0]; //Supongo que el 1er valor es el mínimo, se cambia si hay uno menor
       
        for (int i =0; i<notas.length; i++){
           if (notas [i] > max) max = notas [i];
           if (notas [i] > min) min = notas [i];
           suma = suma + notas [i];
        }   
        
        //Cálculo de la media
        media = suma/notas.length;
        
        //Resultados
        System.out.println("La nota mínima es: " +min);
        System.out.println("La nota máxima es: " +max);
        System.out.println("La nota media es: " +media);
        }
    
    }
    