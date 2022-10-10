
package tema3.Condicionales;

import java.util.Scanner;


public class Ej_0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println ("Número: ");        
        
        int num = Integer.parseInt(scanner.nextLine());        
        
        if (num % 2 == 0) {        
            System.out.println ("El número es par.");
        }
    
        else { System.out.println ("El número es impar. ");
                
                }
        }
        
    }