package tema3.Secuenciales;

import java.util.Scanner;



public class Ej_8 {

    public static void main(String[] args) {
        System.out.println ("Ej8.- Invierte las unidades y decenas de un número.");
        
        int num;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Introduce el número: ");
        num = Integer.parseInt(scanner.nextLine());    

        int unidades = num % 10;
        int decenas = num / 10;
        System.out.println ("El número invertido es: " + unidades + decenas);      
    }
   
}
