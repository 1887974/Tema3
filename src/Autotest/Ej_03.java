package Autotest;

import java.util.Scanner;

public class Ej_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println ("Introduce los 5 números: ");
        
        int num;
        int suma = 0;  
        int contadorNegativo = 0;
        
        for (int i=1; i<=5; i++){
            num = Integer.parseInt (scanner.nextLine());
            suma = suma + num;
                if (num<0){
                    contadorNegativo++;
                }
        } 
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("Números negativos introducidos: " +contadorNegativo);
    }
}
