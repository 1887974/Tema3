package PracticaNov;
/**
 *
 * @author sara.mula
 */

import java.util.Scanner;

public class Arrays_02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int[] numeros = new int [5];
        int num;
        
        //bucle para rellenar los 5 valores del array
        for (int i = 0; i<numeros.length; i++){
            System.out.println("número " + (i+1) + ": ");
            num = Integer.parseInt(scanner.nextLine());
            numeros[i] = num;
        }
        
        System.out.println("ARRAY DE NÚMEROS");
        System.out.println("----------------");
        
        //imprimir las filas
        for (int i = 0; i < numeros.length; i++){
            System.out.println("numero[" + numeros[i] + "]" + "->" + numeros[i]);
        }
        //imprimir todos los datos en una misma fila
        System.out.print("Array--> [");
        for (int i = 0; i<numeros.length-1; i++){
            System.out.print(numeros [i] + "|");
        }
        System.out.print( numeros[numeros.length-1] + "]");
    }
}