package PracticaNov;

import java.util.Scanner;

public class Condicionales_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int year = Integer.parseInt (scanner.nextLine());
        
        if (year/100==0 && year/400==0) System.out.println("Es bisiesto");
        else System.out.println("No lo es");
    
    }
}