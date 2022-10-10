
package tema3.Condicionales;

import java.util.Scanner;

public class Switch_Ej_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        int dia = Integer.parseInt(scanner.nextLine());
        
        switch (dia) {
            case 1, 2, 4, 5:  System.out.println ("Hay programación.");
                    break;
                    
            case 3:
            case 6:
            case 7:    
                System.out.println ("No hay clase de programación.");
                    break;
            default:
                System.out.println ("Error: día incorrecto.");
        }

        }
    }
