package PracticaNov;

import java.util.Scanner;

public class Secuencial_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        float C;
        float F;
        
        System.out.println("Introduce la temperatura en grados Fahrenheit : ");
        
        F = Float.parseFloat(scanner.nextLine());
        
        C = (F-32)*5/9;
        
        System.out.println("La temperatura corresponde a " + C + " grados centígrados.");
        
    }
}
    