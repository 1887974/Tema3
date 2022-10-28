package tema3.Bucles;

import java.util.Scanner;

public class Ej_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        System.out.println ("Dime un número: ");  
        int num = Integer.parseInt (scanner.nextLine());

        System.out.println ("Tabla de multiplicar del número: " + num);  

        for (int i = 0; i <= 10; i++) {	               
                System.out.println (num+"*"+i+"="+(num*i));            
            }
        
        int j = 1;
        while (j <= 10) {
            System.out.println (num+"*"+j+"="+(num * j));
            j++;
        }
        
        j = 0;
        do {
            System.out.println(num+"*"+j+"="+(num*j));
                j++;
        } while(j <= 10);
        
        }
    
    }
    