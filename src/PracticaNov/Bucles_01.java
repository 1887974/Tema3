package PracticaNov;
/**
 *
 * @author sara.mula
 */

import java.util.Scanner;

public class Bucles_01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int num;
        
        System.out.println("Introduce el número: ");
        num = Integer.parseInt (scanner.nextLine());
        
        for (int i=0; i<= 10;i++) {
            System.out.println(num + "*" + i + "=" + (num*i));
        }
        
//        for (int i=320; i>=180; i--){
//            System.out.println(i-20);
//        }
  
    }
}
