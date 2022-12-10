/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

/**
 *
 * @author sara
 */
public class Cadenas_11 {
    public static void main(String[] args) {
        String frase = "me gusta el jamon";
        String fraseNueva = "";
        char caracter;
        char caracterMayus;
        
        frase = frase.trim();//para quitar los espacios del principio y final
        
        //meter el primer char del string como mayúscula directamente
        caracter = frase.charAt(0);
        caracterMayus = Character.toUpperCase(caracter);
        fraseNueva = fraseNueva + caracterMayus;
        
        //al comprobar el índice anterior a i no puede empezar por 0 o da error
        for(int i = 1; i < frase.length(); i++){
            if(frase.charAt(i-1) == ' '){
                caracter = frase.charAt(i);//la letra después del espacio 
                caracterMayus = Character.toUpperCase(caracter);//pasa a mayúscula
                fraseNueva = fraseNueva + caracterMayus;//se une a los caracteres anteriores
            } else {
                caracter = frase.charAt(i);
                fraseNueva = fraseNueva + caracter;
            }
        }
        System.out.println(fraseNueva);
    }
}
