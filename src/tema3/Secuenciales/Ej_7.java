package tema3.Secuenciales;

import java.util.Scanner;



public class Ej_7 {

    public static void main(String[] args) {
        System.out.println ("Ej7.- Calcula el cambio de valores entre dos variables.");
        
        int a;
        int b;
        int aux;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Valor dela variable a: ");
        a = Integer.parseInt(scanner.nextLine());
        
        System.out.println ("Valor de la variable b: ");
        b = Integer.parseInt (scanner.nextLine());
        
        aux = a;
        a = b; 
        b = aux;
             
        System.out.println ("Nuevo valor de a: " + a);
        
        System.out.println ("Nuevo valor de b: " + b);      
    }
   
}
