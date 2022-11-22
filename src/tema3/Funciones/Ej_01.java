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
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Par o impar:");
        System.out.println("------------");
        System.out.println("Introduce un número:");
        int num = Integer.parseInt(scanner.nextLine());
        
        if (esPar(num)){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }
    }
    
    public static boolean esPar (int num) {
        boolean resultado;
        if (num %2==0){
            resultado = true;
            //return true;
        } else {
            resultado = false;
            //return false;
        }
        return resultado;
    }
    
}
