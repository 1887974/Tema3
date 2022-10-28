package tema3.Bucles;

import java.util.Scanner;

public class Ej_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
                
        int numero;
        int numerosPositivos = 0;
        int numerosNegativos = 0;
        int numerosCero = 0;
        
        System.out.print("Cantidad total de números a introducir: ");
        int totalNumeros = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < totalNumeros; i++) {
            
            System.out.print("Dime un numero:");
            numero=Integer.parseInt(scanner.nextLine());
        
            if (numero > 0){
                numerosPositivos++;
            }      
            else if (numero < 0){
                numerosNegativos++;
            }
            else {
                numerosCero++;
            } 
        }
        
        System.out.println("Total de números positivos: " +numerosPositivos);
        System.out.println("Total de números negativos: " +numerosNegativos);
        System.out.println("Total de ceros: " +numerosCero);
            
        } 
}
