package Autotest;

import java.util.Scanner;
import java.time.Year;

public class Ej_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int mes;
        int year;
        
        System.out.println("Intrdue el número del mes: ");
        mes = Integer.parseInt (scanner.nextLine());
            switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12: System.out.println ("Tiene 31 días.");
                    break;
                    
            case 2: System.out.println("¿Qué año es?");
            year = Integer.parseInt (scanner.nextLine());
                if (Year.isLeap (year)) { System.out.println("Tiene 29 días");
                    } else System.out.println ("Tiene 28 días.");
                    break;
                    
            case 4, 6, 9, 11: System.out.println ("Tiene 30 días");
                    break;
            default:
                System.out.println ("Error: mes incorrecto.");
        }
    }
}
