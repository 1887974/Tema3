package tema3.Arrays;

import java.util.Scanner;

public class Ej_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String[] nombres = new String [5];
        
        String nombre;
        
        String[] edades = new String [5];
        
        int edad;
        
        int maxEdad = 0;
        int posicionMaxEdad = 0;
        
        int minEdad = 0;
        int posicionMinEdad = 0;
        
        for (int i=0;i<nombres.length;i++){
            
            if (i == '*') break;
                       
            System.out.println("Nombre del alumno (pulse * para cerrar): ");
            nombre = scanner.nextLine ();
            
            nombres = nombres + nombre i
            
            System.out.println("Edad del alumno: ");
            edad = Integer.parseInt (scanner.nextLine ());
        
        }
        
        
        System.out.println("El nombre del mayor es: " + maxEdad);
        System.out.println("El nombre del menor es: " + minEdad);
        
        
        
        
    }
}

