package tema3.Arrays;

import java.util.Scanner;

public class Ej_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        int [] numeros = new int [10];
        int num;
        
        System.out.println("Introduce la serie de números: ");

        for (int i=0; i<numeros.length; i++){

            num = Integer.parseInt (scanner.nextLine());
            numeros [i] = num;
            if (num <0) break; 
        }
        
        System.out.println("La serie de números introducida es: ");
        //Analizar cada número e imprimir los positivos
        
        for (int i=0; i<numeros.length; i++){
            if (numeros [i]>= 0) {
                System.out.println(numeros[i]);
            }   else break;
        }
        
    }
}
    