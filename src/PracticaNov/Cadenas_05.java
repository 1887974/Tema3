package PracticaNov;

import java.util.Scanner;

public class Cadenas_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        String frase;
        String todoMayusculas;
        
        System.out.println("Introduce la frase: ");
        frase = scanner.nextLine();
        
        todoMayusculas = frase.toUpperCase();
        System.out.println(todoMayusculas);
        
    }
}