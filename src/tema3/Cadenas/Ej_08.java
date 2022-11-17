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
public class Ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        String frase1 = scanner.nextLine();
        String frase1 = "Me llamo Pepe";
        String fraseSinEspacios = "";
        
        for (int i = 0; i < frase1.length();i++){
            if(frase1.charAt(i) != ' '){
                fraseSinEspacios = fraseSinEspacios + frase1.charAt(i);
            }
        }
        
        System.out.println(fraseSinEspacios);
        
    }
    
}
