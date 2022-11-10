package PracticaNov;
/**
 *
 * @author sara.mula
 */

import java.util.Scanner;

public class Arrays_04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int[] numeros = new int [10];
        int num;
        
        System.out.println("Introduce 10 números: (negativo para salir)");
        for (int i = 0; i<numeros.length; i++){
            num = Integer.parseInt(scanner.nextLine());
            numeros[i] = num;
            
                if (num<0) break;
            
        }
        
        System.out.println("Valores introducidos(positivos)");
        for (int i = 0; i<numeros.length;i++){
            if (numeros[i]>0){
                System.out.println(numeros[i]); 
            }else {
                break;
            }
        }
        
    }
}