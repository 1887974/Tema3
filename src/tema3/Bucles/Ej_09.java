package tema3.Bucles;

import java.util.Scanner;


public class Ej_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        System.out.println ("Introduce un número mayor que cero: ");  
        int N = Integer.parseInt (scanner.nextLine());
        
                //i es el primer factor, va desde el 1 hasta el valor de N
        for (int i = 1; i <= N; i++) {	          
            
            System.out.println ("Tabla del: " + i);  
                //j es el segundo factor, va desde el 1 al 10 y aumenta a cada paso
            for (int j = 1; j<= 10; j++) {
            System.out.println (i+"*"+j+"="+(i*j));            
            }
        }

    }
}