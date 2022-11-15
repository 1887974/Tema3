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
public class Ej_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        //con .charAt(i)
        for(int i = 0; i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }
        
        //con .substring(i,i++)
        for(int i = 0; i<cadena.length();i++){
            System.out.println(cadena.substring(i,i+1));
        }
        
    }
    
}
