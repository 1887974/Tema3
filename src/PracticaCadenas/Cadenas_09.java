/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

/**
 *
 * @author sara
 */
public class Cadenas_09 {
    public static void main(String[] args) {
        String frase = "el rock mola siempre";
        
        System.out.println(modificarFrase(frase));
        
    }
    
    public static String modificarFrase (String cadena){
        String fraseNueva = "";
        cadena = cadena.toUpperCase();
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == 'O'){
                fraseNueva = fraseNueva + '0';
            } else if (cadena.charAt(i) == 'I'){
                fraseNueva = fraseNueva + '1';
            } else {
                fraseNueva = fraseNueva + cadena.charAt(i);
            }
            
        }
        return fraseNueva;
    }
    
    
}
