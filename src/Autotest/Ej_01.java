package Autotest;

import java.util.Scanner;

public class Ej_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        double radio;
        double area;
        
        System.out.println("Calcula el área del círculo: ");
        System.out.println("--------------------");
        
        System.out.println("Introduce el radio del círculo: ");
        
        radio = Double.parseDouble (scanner.nextLine());
        area = Math.PI * Math.pow (radio, 2);
        
        System.out.println("El área es: " +area);
    }
}
