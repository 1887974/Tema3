/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

/**
 *
 * @author sara
 */
public class Cadenas_03 {
    public static void main(String[] args) {
        String frase = "hombres y mujeres tenemos los mismos derechos";
        String palabra = "mujeres";
        if(aparecePalabra(frase, palabra)){
            System.out.printf("%s%s\n","Sí aparece la palabra ", palabra);
        } else {
            System.out.printf("%s%s\n", "No aparece la palabra ", palabra);
        }
        
        if(contienePalabra(frase, palabra)){
            System.out.printf("%s%s\n","Sí contiene la palabra ", palabra);
        } else {
            System.out.printf("%s%s\n", "No contiene la palabra ", palabra);
        }
    }
    
    public static boolean aparecePalabra(String cadena,String palabra){
        boolean aparece;
        
        if(cadena.indexOf(palabra) != -1){
            aparece = true;
        } else {
            aparece = false;
        }
        return aparece;
    }
    
    public static boolean contienePalabra(String cadena,String palabra){
        boolean aparece;
        
        if(cadena.contains(palabra)){
            aparece = true;
        } else {
            aparece = false;
        }
        return aparece;
    }
    
}
