package tema3.Bucles;

import java.util.Scanner;

public class Ej_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        int num;
        System.out.println ("Dime un número: ");  
        num = Integer.parseInt (scanner.nextLine());
        
        int suma = 0;
        for (int i = 1; i <=num; i++) {
            suma = suma + i;
            
        System.out.println ("La suma de los "+num+" primeros números es "+suma);            
        }
        
        int factorial = 1;
        for (int i = 1; i<= num; i++) {
            factorial = factorial * i;
        }
        System.out.println ("El factorial de "+num+" es " + factorial);
    }
}