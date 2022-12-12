/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFunciones;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Ej_03_comparar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad1 = "hola fondo norte";
        String cad2 = "hola fondo sur";
        String cad3 = "apple mola";
        String cad4 = "apple mola";
        
        if (son_iguales(cad1,cad2)) {
            System.out.println(cad1 + " y " + cad2 + " son iguales");
        } else {
            System.out.println(cad1 + " y " + cad2 + " son distintas");
        }
        if (son_iguales(cad3,cad4)) {
            System.out.println(cad3 + " y " + cad4 + " son iguales");
        } else {
            System.out.println(cad3 + " y " + cad4 + " son distintas");
        }
    }   
    
    public static boolean son_iguales (String cadena1, String cadena2){
        boolean iguales = true;
        for (int i = 0; i < cadena2.length(); i++) {
            if (cadena1.charAt(i) != cadena2.charAt(i)){
                iguales = false;
                break;
            }
        }
        return iguales;
    }
}
