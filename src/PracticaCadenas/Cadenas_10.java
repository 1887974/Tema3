/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

/**
 *
 * @author sara
 */
public class Cadenas_10 {
    public static void main(String[] args) {
        String frase = "Tres tigres son uno,dos,tres.";
        String palabra = "tres";
        frase = frase.toLowerCase();
        frase = frase.replace('.',' ');
        frase = frase.replace(',',' ');
        
        //Completar un array de strings con las palabras, string separado por espacios
        String[] palabras = frase.split(" ");
        //Comprobar cada palabra del array si coincide con la que se busca
        int palabraRep = 0;
        for(int i = 0; i < palabras.length; i++){
            if(palabras[i].equals(palabra)){
                palabraRep++;    
            } 
        }
        System.out.printf("%s%s%s%d\n", "Total de veces en las que aparece la palabra ",palabra,": ", palabraRep);
    }
    
}
