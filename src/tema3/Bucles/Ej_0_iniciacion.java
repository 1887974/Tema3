package tema3.Bucles;

import java.util.Scanner;

public class Ej_0_iniciacion {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);       

//        System.out.println ("*** for ***");
//        for (int i = 0; i < 11; i ++){
//            System.out.println ("i vale: " + i);
//        }
//            
//        System.out.println ("\n\n*** while ***");
//        int i = 1;
//        while (1 <= 10) {
//            System.out.println (i);
//            i++;
//        }
//        
//        System.out.println ("do while ");
//        i = 1;
//        do {
//            System.out.println ();
//            i++;
//        } while (i < 11);
        
//        System.out.println ("Introducir números hasta negativ");
//        
//        int num;
//        
//        System.out.println ("Usando un while");
//        System.out.println ("Numero positivo para continuar: ");
//        num = Integer.parseInt (scanner.nextLine());
//        
//        while (num >= 0) {
//            System.out.println ("Numero positivo para continuar: ");
//            num = Integer.parseInt (scanner.nextLine());
//        }
        
//        System.out.println ("Usando un do while: ");
//        int num;
//        do { 
//            System.out.println ("Introducir hasta impar: ");
//            num = Integer.parseInt (scanner.nextLine());
//        } while (num % 2 == 0); 
        
//        System.out.println ("Introducir número hasta impar: ");
//        int num;
//        
//        do {
//            System.out.println ("Número para continuar: ");
//            num = Integer.parseInt (scanner.nextLine());
//            if (num%2! = 0) {
//                break;
//        } while (true);
//        }
        
//        int num; 
//        for (int i=0; i<10; i++) {
//            System.out.println ("Número para continuar: ");
//            num = Integer.parseInt (scanner.nextLine());
//            if (num%2!=0) {
//                break;
//            }
//
//        }

//        int ascii_A = 65;
////        char letra_A = (char) ascii_A;
//        System.out.println("Letra: " + (char)ascii_A);
//        
//        for (int i=65; i<=90; i++) {
//            System.out.print ("Letra: " + (char) i);
//            System.out.println ("---" + (char) (i + 32));
//        }

        int num = 0;
        int suma = 0;
        int contador = 0;

        while (num >= 0) {
            System.out.println ("Introduce numero: ");
            num = Integer.parseInt (scanner.nextLine());
            
            if (num >= 0){
            suma = suma + num; //suma+=num;    acumulador
            contador ++; //incremento contador
            }

            System.out.println ("La suma acumulada es: " +suma);
            System.out.println ("Total de números introducidos: " +contador);
            
        }

    }
}
