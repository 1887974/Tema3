package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_2 {
    public static void main(String[] args) {
        
        float base;
        float altura;
        float perimetro;
        float area;
        
        System.out.println ("Ej2.- Calcula el perímetro y el area de un rectángulo dada su base y altura.");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Base: ");
        base = Float.parseFloat(scanner.nextLine());

        System.out.println ("Altura: ");
        altura = Float.parseFloat(scanner.nextLine());

         perimetro = (altura * 2 + base * 2);
        System.out.println ("Resultado del perímetro: " + perimetro);
        
        area = (altura * base);
        System.out.println ("Resultado del área: " + area);
        
    }    
}
