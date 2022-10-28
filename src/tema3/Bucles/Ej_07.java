package tema3.Bucles;

import java.util.Scanner;

public class Ej_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String entrada;
        char caracter;
        
        do { 
            System.out.print("Introduce un caracter:");
            entrada = scanner.nextLine();
//            entrada = entrada.toUpperCase();
            caracter=entrada.charAt(0);
//            caracter = scanner.nextLine().charAt(0);
            
            // ver si es una vocal
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' ||
                caracter == 'O' || caracter == 'U' || caracter == 'a' || 
                caracter == 'e' || caracter == 'i' || caracter == 'o' ||
                caracter == 'u' ){
                System.out.println("Es una vocal.");
            }
            //espacio en blanco para detenerlo
            else if (caracter == ' '){
                System.out.println("Fin del programa.");
            }
            //el resto son consonantes por defecto
            else    
                System.out.println("Es una consonante.");
            
        } while(caracter != ' ');
        
    }
}