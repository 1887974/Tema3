/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

/**
 *
 * @author sara
 */
public class Cadenas_02 {
    public static void main(String[] args) {
        String frase = "el covid19 es lo peor";
        frase = frase.toLowerCase();
        int vocales = numVocales (frase);
        int consonantes = numConsonantes (frase);
        
        System.out.printf("%s%d\t%s%d\n","Consonantes: ", consonantes, "Vocales: ", vocales); 
    }
    
    public static int numVocales (String cadena){
        int vocales = 0;
        for(int i = 0; i < cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'a','e','i','o','u': vocales++;
                    break;
                default: break;
            }
        }
        return vocales;
    }
    
    public static int numConsonantes (String cadena){
        int consonantes = 0;
        for(int i = 0; i < cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'a','e','i','o','u': break;
                case ' ','0','1','2','3','4','5','6','7','8','9': break;
                default: consonantes++;
                    break;
            }
        }
        return consonantes;
    
    }
    
}
