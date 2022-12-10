/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Cadenas_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();
        palabra1 = palabra1.toLowerCase();
        System.out.println("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        palabra2 = palabra2.toLowerCase();
        
        if(palabrasIguales(palabra1,palabra2)){
            System.out.println("Ambas palabras son iguales.");
        } else {
            System.out.println("Las palabras no coinciden.");
        }
    }   
    
    public static boolean palabrasIguales (String palabra1, String palabra2){
        boolean sonIguales;
        if(palabra1.equals(palabra2)){
            sonIguales = true;
        } else {
            sonIguales = false;
        }
        return sonIguales;
    }
    
}
