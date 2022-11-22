/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author sara.mula
 */
public class Ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia, mes, year;

        System.out.print ("Introduce una fecha: ");
        System.out.print ("Día: ");
        dia = Integer.parseInt (scanner.nextLine());
        System.out.print ("Mes: ");
        mes = Integer.parseInt (scanner.nextLine());
        System.out.print ("Año: ");
        year = Integer.parseInt (scanner.nextLine());
        
        
        
        
        
    }
    
    public static boolean FechaCorrecta(int dia, int mes, int year) {

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
        }        
        return true;
    }
    
}
