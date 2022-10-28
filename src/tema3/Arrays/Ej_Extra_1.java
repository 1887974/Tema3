package tema3.Arrays;

import java.util.Scanner;

public class Ej_Extra_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        int [] numeros = new int [5];
        int num;
        
        System.out.println("Introduce la serie de números: ");

        for (int i=0; i<numeros.length; i++){

            num = Integer.parseInt (scanner.nextLine());
            numeros [i] = num;
        }
        
        boolean sonPares = true;

        //Analizar cada número y decidir si todos son pares
        for (int i=0; i<numeros.length; i++){
            if (numeros [i]%2 != 0) {
                sonPares=false;
            }   
        }
        
        if (sonPares) {
            System.out.println("Sí son pares.");
        } else System.out.println("No son pares.");
        
    }
}
    