/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;
import java.util.Scanner;
/**
 *
 * @author sara.mula
 */
public class Ej_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dime el lado del cuadrado: ");
        int lado = Integer.parseInt(scanner.nextLine());
        int area_cuadrado = areaCuadrado(lado);
        System.out.printf("%s%d\n","El area del cuadrado es: ", area_cuadrado);
        
        System.out.println("Dime el radio del círculo: ");
        int radio = Integer.parseInt(scanner.nextLine());
        double area_circulo = areaCirculo(radio);
        System.out.printf("%s%f\n","El area del círculo es: ", area_circulo);
    }
    
    public static int areaCuadrado (int lado){
        int area = lado * lado;
        return area;
    }
    
    public static double areaCirculo(int radio){
        double area = Math.PI*radio*radio;
        return area;
    }
    
}
