
package tema3.Condicionales;

import java.util.Scanner;


public class Ej_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println ("Introduce un número: ");        

        int num = Integer.parseInt(scanner.nextLine());

        if (num > 0) {        
            System.out.println ("El número es positivo. ");
        }
        if (num < 0) {
            System.out.println("El número es negativo. ");
        }
        if (num == 0) {
            System.out.println ("El número es cero. ");
        }
    
                
    }
        
}