package PracticaNov;

import java.util.Scanner;

public class Condicionales_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int num;
        System.out.println("Introduce el número a clasificar: ");
        num = Integer.parseInt(scanner.nextLine());
        
        if (num < 0) System.out.println("Es negativo");
        else if (num >0) System.out.println("Es positivo");
        else if (num == 0) System.out.println("Es cero");
    
    }
}