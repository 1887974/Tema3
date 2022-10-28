package tema3.Bucles;

import java.util.Scanner;

public class Ej_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        int numeroIntroducido;
        
        System.out.println ("Introduce una secuencia de números. Pulsa 0 para finalizar. ");  
//        numeroIntroducido = Integer.parseInt (scanner.nextLine());
        
        int cuentaNumeros = 0;
        int suma = 0;    
        
//        do{
//        System.out.print("Dime el numero:");
//        numeroIntroducido = Integer.parseInt(scanner.nextLine()); 
//        
//        if (numeroIntroducido != 0){
//        cuentaNumeros++;
//        suma = suma + numeroIntroducido;
//        }
//        } while (numeroIntroducido != 0 ); 
//
//        System.out.println("Has introducido " + (cuentaNumeros) + " números.");
//        System.out.println("La suma total de ellos es " + suma);
//        
//
        System.out.print("Dime el numero:");
        numeroIntroducido = Integer.parseInt(scanner.nextLine()); 
        suma = suma + numeroIntroducido;
        cuentaNumeros++;
        
        while(numeroIntroducido != 0 ){
            System.out.print("Dime el número: ");
            numeroIntroducido = Integer.parseInt(scanner.nextLine()); 
            cuentaNumeros++;
            suma = suma + numeroIntroducido;
        }
        System.out.println("\nHas introducido " + (cuentaNumeros-1) + " números.");
        System.out.println("La suma total de ellos es " + suma);   
        
    }
}