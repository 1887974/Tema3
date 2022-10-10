package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_10 {
    public static void main(String[] args) {
        System.out.println ("Ej9.- Calcula el dinero según el número de monedas de casa tipo: ");
        
        int euro2;
        int euro1;
        int cent50;
        int cent20;
        int cent10;
        
        int eurosTotal;
        int centTotal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Monedas de 2 euros: ");
        euro2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println ("Monedas de 1 euro: ");
        euro1 = Integer.parseInt(scanner.nextLine());

        System.out.println ("Monedas de 50 céntimos: ");
        cent50 = Integer.parseInt(scanner.nextLine());
        
        System.out.println ("Monedas de 20 céntimos: ");
        cent20 = Integer.parseInt(scanner.nextLine());
        
        System.out.println ("Monedas de 10 céntimos: ");
        cent10 = Integer.parseInt(scanner.nextLine());
        
        eurosTotal = euro2 * 2 + euro1;
        centTotal = cent50 * 50 + cent20 * 20 + cent10 * 10;
        
        centTotal = centTotal % 100;
        eurosTotal = eurosTotal+ Trunc(centTotal / 100);
        
                
        System.out.println ("Total euros: " + eurosTotal + "Total céntimos: " + centTotal);
        
    }    
}
