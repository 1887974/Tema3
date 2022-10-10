
package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_4 {

    public static void main(String[] args) {
        System.out.println ("Ej4.- Pasa de grados Fahrenheit a grados Celsius.");

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Inserte grados Fahrenheit: ");
        float Fahrenheit = Float.parseFloat(scanner.nextLine());
        
        float conversion = (Fahrenheit - 32)* 5/9;
        
        System.out.println ("El cambio de grados Fahrenheit a Cel: " + conversion);      
    }
    
    public static float conversion (float Fahrenheit, float Celsius) {
        float resultado = (Fahrenheit - 32)* 5/9;
        
        return resultado;    
    }  
}

