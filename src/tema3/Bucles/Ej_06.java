package tema3.Bucles;

import java.util.Scanner;


public class Ej_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
                
        System.out.println("CAJA FUERTE. 3 intentos: " );

        int numeroIntroducido;
        int intentos = 3;
        int password = 8888;

        boolean acertado = false;
        
        //usando un break
        do {
            System.out.println("Introduce la clave: (nº de intentos restantes: " +intentos+ "): " );
            numeroIntroducido = Integer.parseInt (scanner.nextLine());
            
            if (numeroIntroducido == password) {
                System.out.println("CLAVE CORRECTA.");
                break;
            }
            intentos--;
        } while (intentos > 0);
   
        
        System.out.println("========= SEGUNDA FORMA ======"); 
        intentos=3;
        //usando un booleano
        do {
            System.out.println("Introduce la clave: (nº de intentos restantes: " +intentos+ "): " );
            numeroIntroducido = Integer.parseInt (scanner.nextLine());
            
            if (numeroIntroducido == password) {
                System.out.println("CLAVE CORRECTA.");
                acertado =true;
                
            }
            intentos--;
        } while (intentos > 0 && acertado == false);
        
        if (acertado)
            System.out.println ("CLAVE ENCONTRADA");
        else System.out.println ("CLAVE INCORRECTA. 0 intentos restantes.");
    }  
}
