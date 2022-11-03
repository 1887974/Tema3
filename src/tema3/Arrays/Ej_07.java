package tema3.Arrays;

import java.util.Scanner;

public class Ej_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String frase, fecha;
        
        System.out.println("Introduce una frase: ");
        frase = scanner.nextLine();

        String[] palabras = frase.split (" ");
          
        System.out.println("La frase tiene "+palabras.length+ " palabras");
        
        for (int i = 0; i<palabras.length; i++){
            System.out.println(palabras [i]);
        }
        
        
        System.out.println("Introduce una fecha: [día/mes/año]");
        fecha = scanner.nextLine();
        String[] partesFecha = fecha.split ("/");
        
        System.out.println("La fecha recibida es: ");
        System.out.println("Día: " + partesFecha [0]);
        System.out.println("Mes: " + partesFecha [1]);
        System.out.println("Año: " + partesFecha [2]);
     
    }
}

