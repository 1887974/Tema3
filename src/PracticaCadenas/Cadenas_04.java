/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

/**
 *
 * @author sara
 */
public class Cadenas_04 {
    public static void main(String[] args) {
        String frase = "hombres y mujeres tenemos los mismos derechos";
        String fraseSinEspacios = remplazarEspacios(frase);
        
        System.out.println(fraseSinEspacios);
    }
    
    public static String remplazarEspacios (String cadena){
        String cadenaNueva = cadena.replace(' ','_');
        return cadenaNueva;
    }
    
}
