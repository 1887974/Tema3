package PracticaNov;

import java.util.Scanner;

public class Alternativas_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int dia, mes, year;
        
        System.out.println("Introduce una fecha: 1-Día: ");
        dia = Integer.parseInt(scanner.nextLine());
        
        System.out.println("2-Mes: ");
        mes = Integer.parseInt(scanner.nextLine());
        
        System.out.println("3-Año: ");
        year = Integer.parseInt(scanner.nextLine());
        
        if (dia < 31) System.out.println("Día correcto");
        if (mes <0 || mes >12) System.out.println("Mes correcto");
        if (year > 0) System.out.println("Año correcto");
        
    }
}