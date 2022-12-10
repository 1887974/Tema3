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

        System.out.println ("Introduce una fecha: ");
        System.out.println ("Día: ");
        dia = Integer.parseInt (scanner.nextLine());
        System.out.println ("Mes: ");
        mes = Integer.parseInt (scanner.nextLine());
        System.out.println ("Año: ");
        year = Integer.parseInt (scanner.nextLine());
        
        if(fechaCorrecta(dia, mes, year)){
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
    
    public static boolean fechaCorrecta(int dia, int mes, int year) {
        boolean diaCorrecto = true;
        boolean mesCorrecto;
        boolean yearCorrecto;
        
        //comprobar año
        if (year >= 1900 && year <= 2500) {
            yearCorrecto = true; 
        } else {
            yearCorrecto = false;
        }
        //comprobar mes
        if (mes >= 1 && mes <= 12) {
            mesCorrecto = true;
        } else {
            mesCorrecto = false;
        }
        //comprobar día según el mes
        switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12: 
            if (dia >= 1 && dia <= 31) diaCorrecto = true;
            else diaCorrecto = false;        
                        break;
        case 4, 6, 9, 11: 
            if (dia >= 1 && dia <= 31)diaCorrecto = true;
            else diaCorrecto = false;        
                        break;        
        case 2: 
            if (Year.of(year).isLeap()){
                if (dia >= 1 && dia <= 29) diaCorrecto = true;
                else diaCorrecto = false;
            }
            else {
                if (dia >= 1 && dia <= 28) diaCorrecto = true;
                else diaCorrecto = false;        
                        break;
        }        
    }   
        if(diaCorrecto==true && mesCorrecto==true && yearCorrecto==true){
            return true;
        } else {
            return false;
        }
    }   
}
