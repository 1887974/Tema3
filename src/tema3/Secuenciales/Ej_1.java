
package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_1 {

    public static void main(String[] args) {
        System.out.println ("Ej1.- Calcula la media de 3 números.");

        Scanner scanner = new Scanner(System.in);

        System.out.println ("1er número:");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.println ("2º número:");
        float num2 = Float.parseFloat(scanner.nextLine());

        System.out.println ("3er número:");
        float num3 = Float.parseFloat(scanner.nextLine());
        
        float media = (num1 + num2 + num3)/3;
        
        System.out.println ("La media es: " + media);      
    }
    
    
    
}

