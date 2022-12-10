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
public class Cadenas_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int coincidencia = 0;
        
        System.out.println("Introduce una cadena de texto:");
        String frase = scanner.nextLine();
        
        System.out.println("Introduce el carácter a buscar:");
        String aux = scanner.nextLine();
        char letra = aux.charAt(0); //convertir un string a char usando un string auxiliar
        
        int coincidencia = aparece (frase, letra);
        System.out.printf("%s%d\n","Total de coincidencias: ",coincidencia);
        
        int palabras = numPalabras (frase);
        System.out.printf("%s%d\n","Total de palabras: ", palabras);
        
    } 
    
    public static int aparece (String cadena, char caracter){
        int coincidencia = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == caracter){
                coincidencia ++;
            }
        }
        return coincidencia;
    }
    
    public static int numPalabras (String cadena){
        int palabras = 1;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == ' '){
                palabras ++;
            }  
        }
        return palabras;
    }
}
