/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Cadenas;

/**
 *
 * @author sara.mula
 */
public class Ej_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "me gusta el jamon";
        String resultado = "";
        
        char caracter = cadena.charAt(0);
        char caracterMayus = Character.toUpperCase(caracter);
        resultado = resultado + caracterMayus;
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i-1) == ' '){
                caracter = cadena.charAt(i);
                caracterMayus = Character.toUpperCase(caracter);
                resultado = resultado + caracterMayus;
            }
            
        }
        
        
        
        
    }
    
}
