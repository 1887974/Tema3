package PracticaNov;
/**
 *
 * @author sara.mula
 */

import java.util.Scanner;

public class Alternativas_05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int mes;
        System.out.println("Introduce el mes:");
        mes = Integer.parseInt(scanner.nextLine());        
        
        switch (mes) {
            case 1 : System.out.println("Tiene 31 días");
            case 2 : System.out.println("28/29 días");
            case 4 : System.out.println("Tiene 30 días");          
        }
        
    }
}
