package PracticaNov;
/**
 *
 * @author sara
 */

import java.util.Scanner;

public class Bucles_06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        int password = 1234;
        int intentos = 3;
        int num;
        
        do {
            System.out.println("Introduce la clave: (intentos restantes: " + intentos + ")");
            num = Integer.parseInt(scanner.nextLine());
            
                if (num == password) {
                    System.out.println("Clave correcta!");
                    break;
                }
            System.out.println("Clave incorrecta");
            intentos--;
        } while (intentos > 0); 
        
    }
}
