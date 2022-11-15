/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Cadenas;
import java.util.Scanner;

/**
 *
 * @author sara.mula
 */
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cadena;
        String letraBuscar;
        char letra;
        int contadorLetras = 0;
        int contadorPalabras = 0;
        
        System.out.println("Introduce una frase: ");
        cadena = scanner.nextLine();
        letraBuscar = scanner.nextLine();
        letra = letraBuscar.charAt(0);
        
        //contar cuántas veces sale una letra
        for(int i = 0; i<cadena.length();i++){
            if(cadena.charAt(i)== letra){
                contadorLetras++;
            }
        }
        System.out.println("El carácter " + letra + " aparece " + contadorLetras + " veces.");
        
        //contar cuabtos espacios y punos para calcular el num de palabras
        for(int i = 0; i<cadena.length();i++){
            if(cadena.charAt(i)== ' ' || cadena.charAt(i)== '.'){ 
                contadorPalabras++;
            }
        }
        System.out.println("La cadena tiene " + contadorPalabras + " palabras.");

    }
    
}
