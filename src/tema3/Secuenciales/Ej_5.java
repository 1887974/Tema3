
package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_5 {

    public static void main(String[] args) {
        System.out.println ("Ej5.- Calcula el sueldo total de un vendedor junto al 10% por comisión de las ventas realizadas.");

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Inserte sueldo base: ");
        float sueldoBase = Float.parseFloat(scanner.nextLine());

        System.out.println ("Inserte la primera venta: ");
        float venta1 = Float.parseFloat(scanner.nextLine());
        
        System.out.println ("Inserte la segunda venta: ");
        float venta2 = Float.parseFloat(scanner.nextLine());

        System.out.println ("Inserte la tercera venta: ");
        float venta3 = Float.parseFloat(scanner.nextLine());
              
        float totalVentas = venta1 + venta2 + venta3;
        

        
        System.out.println ("Sueldo total: " + sueldoTotal (sueldoBase, totalVentas));      
    }
    
    public static float sueldoTotal (float sueldoBase, float totalVentas) {
        float resultado = sueldoBase + totalVentas * 0.10f ;
        
        return resultado;    
    }  
}

