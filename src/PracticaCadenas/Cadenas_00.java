/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;
import java.util.Scanner;
/**
 *
 * @author sara
 */
public class Cadenas_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("%s\n","Introduce una cadena de texto:");
        String cadena = scanner.nextLine();
        
        for(int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            System.out.printf("%s\t", caracter);
        }
        
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.substring(i,i+1));
        }
        
    }
}
