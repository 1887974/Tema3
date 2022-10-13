
package tema3.Condicionales;

import java.util.Scanner;
import java.time.Year;

public class Ej_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        int dia, mes, year;

        System.out.print ("Dime una fecha separada por espacios: ");
        dia = Integer.parseInt (scanner.nextLine());
        mes = Integer.parseInt (scanner.nextLine());
        year = Integer.parseInt (scanner.nextLine());
        
        if (year >= 1900 && year <= 2500) {
            System.out.println ("El año es correcto.");
        } else {
            System.out.println ("Error en el año.");
        }

        if (mes <= 1 && mes <= 12) {
            
        }
        
        switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12: 
            if (dia >= 1 && dia <= 31)
                 System.out.println ("El día es correcto.");
                
            else System.out.println ("Error en el día.");        
                        break;
            
        case 4, 6, 9, 11: 
            if (dia >= 1 && dia <= 31)
                 System.out.println ("El día es correcto.");
            
            else System.out.println ("Error en el día.");
                        break;
        
        case 2: 
            if (Year.of(year).isLeap()){
                if (dia >= 1 && dia <= 29)
                    System.out.println ("El día es correcto.");
                else 
                    System.out.println ("Error en el día.");
            }
            else {
                if (dia >= 1 && dia <= 28)
                System.out.println ("El día es correcto.");
                else 
                    System.out.println ("Error en el día.");
            }
                   
            //default:
            //    System.out.println ("Error en el mes.");
        
        }
        
    }
}
   
