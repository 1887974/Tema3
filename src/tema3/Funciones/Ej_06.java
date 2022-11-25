/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;
import java.util.Scanner;
/**
 *
 * @author sara.mula
 */
public class Ej_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "hola";
        System.out.println("Introduce el color a imprimir:");
        String color = scanner.nextLine();
        
        System.out.println(devolverCadenaColor(texto,color));
        
        
        
        
    }
    
    public static String devolverCadenaColor (String texto, String color){
        String cadena = "Error. Color no disponible.";
        
        switch(color){            
            case "rojo": cadena = String.format("\033[31m" +texto+ "\033[30m");
                break;
            case "amarillo": cadena = String.format("\033[33m%s\033[30m",texto);
                break;
            case "azul": cadena = String.format("\033[34m%s\033[30m",texto);
                break;
            case "negro": cadena = String.format("\033[30m%s\033[30m",texto);
                break;
        }
        
        return cadena;
    }
    
    public static void imprimirCadenaColor(){
        
    }
    
    
}
