/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Cadenas;

/**
 *
 * @author sara.mula
 */
public class Ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "el covid 19 es lo mejor";
        int vocales = 0;
        int consonantes = 0;
        
        for(int i = 0; i<frase.length();i++){
            switch(frase.charAt(i)){
                case 'a','e','i','o','u': vocales ++;
                case ' ','1','2','3','4','5','6','7','8','9': break;
                default: consonantes++;
            }
        }
        
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}
