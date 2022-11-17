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
public class Ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String frase = scanner.nextLine();
        String frase = "hombres y mujeres tenemos los mismos derechos";
        
        if(frase.indexOf("mujeres") != -1){
            System.out.println("Sí aparece la palabra mujeres");
        } else {
            System.out.println("No aparece la palabra");
        }
        
        if(frase.contains("mujeres")){
            System.out.println("Sí aparece la palabra mujeres");
        } else {
            System.out.println("No aparece la palabra");
        }
        
    }    
}
