
package tema3.Condicionales;

import java.util.Scanner;

public class Ej_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        char inicialN1;
        char inicialN2;
        char inicialA1;
        char inicialA2;
       // boolean nombreCompuesto = false;
        String nombre;
        String apellido1;
        String apellido2;
        
        System.out.println ("Nombre: ");
        nombre = (scanner.nextLine());

        System.out.println ("Primer apellido: ");
        apellido1 = (scanner.nextLine());
        
        System.out.println ("Primer apellido: ");
        apellido2 = (scanner.nextLine());
        
        if (nombre.indexOf (' '))! = -1) {
        inicialN1 = nombre.charAt (0);
        int posicionBlanco = nombre.indexOf (' ');
        inicialN2 = nombre.charAt (posicionBlanco + 1);
        inicialA1 = apellido1.charAt (0);        
        inicialA2 = apellido2.charAt (0);  
        
        System.out.println ("Las iniciales del nombre son: " + inicialN1 + inicialN2 + inicialA1 + inicialA2);
        
        }    else {
        inicialN1 = nombre.charAt (0);
        inicialA1 = apellido1.charAt (0);        
        inicialA2 = apellido2.charAt (0);
                
        System.out.println ("Las iniciales del nombre son: " + inicialN1 + inicialA1 + inicialA2);
        }
        

        }
    }
