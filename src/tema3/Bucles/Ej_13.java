package tema3.Bucles;

import java.util.Scanner;

public class Ej_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int N;
//        boolean divisible = N%i==0;
        
        System.out.println("CALCULO DE DIVISORES");
        System.out.println("--------------------");
        
        do {
        System.out.println("Introduzca un número: (Pulse 0 para salir)");
        N = Integer.parseInt (scanner.nextLine());
            //bucle para comprobar si i es divisor de N, comprueba desde 1 hasta N
            for (int i = 1; i<=N; i++){
                if (N%i==0){
                System.out.println("El número " +i+ " es divisor de " +N);
                }
            }
            //el bucle se repite mientras que N sea diferente de 0
        } while (N != 0);
        //solo se va a imprimir por pantalla cuando acabe el bucle, es decir cuando se pulse 0
        System.out.println("Cerrando programa...");
    }
}
