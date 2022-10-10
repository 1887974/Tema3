package tema3.Secuenciales;

import java.util.Scanner;


public class Ej_3 {

    public static void main(String[] args) {
        System.out.println ("Ej3.- Calcula el 15 % de descuento sobre el total de la compra.");

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Precio total de la compra: ");
        float compra = Float.parseFloat(scanner.nextLine());
        
        float precioFinal = aplicarDescuento(compra, 15);
        
        System.out.println ("El precio final es: " + precioFinal);      
    }
    
    public static float aplicarDescuento (float precio, int descuento) {
        float resultado = (precio * (100 - descuento)/ 100);
        
        return resultado;    
    }  
}

