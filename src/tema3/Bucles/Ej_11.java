package tema3.Bucles;

import java.util.Scanner;

public class Ej_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int caracter;
        String numero;
        int numeroAfortunado;
        int numeroNoAfortunado;
        
        System.out.println("Introduce el número: ");
        numero = scanner.nextLine();

        while (!numero.equals (" ")){
            numeroAfortunado = 0;
            numeroNoAfortunado = 0;
            
            for (int i = 0; i< numero.length (); i++) {
                caracter = numero.charAt (i);            
                switch (caracter){ 
                    case 2, 5, 8: numeroAfortunado++ ;
                            break; 
                    default: numeroNoAfortunado++ ;
                            break;
                } 
            if (numeroAfortunado > numeroNoAfortunado) {
                System.out.println("Has sido afortunado.");
            } else if (numeroAfortunado < numeroNoAfortunado) {
                System.out.println("No has sido afortunado.");
                } 
            }              
        }
    
    }
}