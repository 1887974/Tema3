package tema3.Bucles;

import java.util.Scanner;


public class Ej_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
                
        int num;
        boolean negativos = false;
        
        do {
            System.out.println("Introduce un número: ");
            num = Integer.parseInt (scanner.nextLine());
            if (num < 0){
                negativos = true;    
            }
            
        }while (num != 0);
    
        if (negativos){
            System.out.println("Has introducidos números negativos.");
        } else System.out.println("No has introducido números negativos.");
    
    }
}