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
public class Cadenas_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        
        System.out.println(quitarEspacios(frase));  
    }   
    
    public static String quitarEspacios (String cadena){
        String cadenaSinEspacios = "";
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                cadenaSinEspacios = cadenaSinEspacios + cadena.charAt(i);
            }
        }
        return cadenaSinEspacios;
    }
    
}
