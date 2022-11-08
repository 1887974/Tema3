package PracticaNov;

import java.util.Scanner;

public class Cadenas_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        String frase;
        int contador = 1;
        
        System.out.println("Introduce la frase: ");
        frase = scanner.nextLine();
        
        for (int i=0;i <frase.length();i++){
            
            if (frase.charAt(i) == ' '){
            contador++;
            }
        }
        
        System.out.println("La frase contiene " + contador + " palabras.");        
        
    }
}
