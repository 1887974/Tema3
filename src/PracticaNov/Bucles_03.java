package PracticaNov;
/**
 *
 * @author sara.mula
 */

import java.util.Scanner;

public class Bucles_03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int num;
        int suma = 0;
        
        System.out.println("Introduce números:");
        num = Integer.parseInt(scanner.nextLine()); 
        suma = suma + num;

        while (num!=0){
        num = Integer.parseInt(scanner.nextLine());
        suma = suma + num;
            System.out.println(suma);
        }
        
        
        do{
            System.out.print("Dime el numero:");
            num = Integer.parseInt(scanner.nextLine()); 
            
            num++; // Incrementamos el contador
            suma = suma + num; //Acumulamos suma parcial
              
        } while (num != 0 ); 
        
        
        
        while(num != 0 ){
            System.out.print("Dime el numero:");
            num = Integer.parseInt(scanner.nextLine()); 
            suma = suma + num; //Acumulamos suma parcial
        }
  
    }
}
