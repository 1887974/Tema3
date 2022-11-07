package PracticaNov;

import java.util.Scanner;

public class Secuencial_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        String nombre;
        String apellido1;
        String apellido2;
        
        char inicial1;
        char inicial2;
        char inicial3;
        
        System.out.println("Introduce el nombre: ");
        nombre = scanner.nextLine();
        inicial1 = nombre.charAt(0);
        
        System.out.println("Introduce el primer apellido: ");
        apellido1 = scanner.nextLine();
        inicial2 = apellido1.charAt(0);
        
        System.out.println("Introduce el segundo apellido: ");
        apellido2 = scanner.nextLine();
        inicial3 = apellido2.charAt(0);
        
        System.out.println("Lasa iniciales de tu nombre completo son: " + inicial1 + inicial2 + inicial3);
        
    }
}
    