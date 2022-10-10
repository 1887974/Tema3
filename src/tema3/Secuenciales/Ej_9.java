package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_9 {
    public static void main(String[] args) {
        System.out.println ("Ej9.- Muestra las iniciales tras pedir el nombre completo: ");
        
        String nombre;
        String apellido1;
        String apellido2;

        char inicial1;
        char inicial2;
        char inicial3;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Nombre: ");
        nombre = (scanner.nextLine());
        
        inicial1 = nombre.charAt (0);
        
        System.out.println ("Primer apellido: ");
        apellido1 = (scanner.nextLine());
        inicial2 = apellido1.charAt (0);

        System.out.println ("Segundo apellido: ");
        apellido2 = (scanner.nextLine());
        inicial3 = apellido2.charAt (0);

        System.out.println ("Las iniciales son: " + inicial1 + inicial2 + inicial3);
        
    }    
}
