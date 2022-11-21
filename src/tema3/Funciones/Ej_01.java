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
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        System.out.println("Dime el lado del cuadrado: ");
//        int area;
//        area = lado * lado;
//        
//        int radio;
//        System.out.println("Dime el radio del círculo: ");
//        radio = Integer.parseInt(scanner.nextLine());
        
    }
    
    public static double areaCirculo(int radio){
        double area = Math.PI*radio*radio;
        return area;
    }
    
}
