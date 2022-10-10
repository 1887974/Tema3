
package tema3.Condicionales;

import java.util.Scanner;

public class Ej_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       

        System.out.println ("Introduzca el año: ");        
        int year = Integer.parseInt (scanner.nextLine());
        
        //year.of(1900).isLeap();
        
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println("Es un año bisiesto.");
        }
        else {
            System.out.println("No es un año bisiesto.");
        }

        }
    }
