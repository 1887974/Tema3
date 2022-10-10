
package tema3.condicionales;

import java.util.Scanner;

public class Ej_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        double notaFinal;
        
        System.out.println ("Primera nota: ");        
        double examen1 = Double.parseDouble(scanner.nextLine());
        
        if (validar (examen1)) {
        } else {
            System.out.println ("Número mal."); 
            return;
        }
        
        System.out.println ("Segunda nota: ");
        double examen2 = Double.parseDouble (scanner.nextLine());
        
        if (validar (examen2)) {
        } else {
            System.out.println ("Número mal."); 
            return;
        }   
        
        System.out.println ("Tercera nota: ");
        double examen3 = Double.parseDouble(scanner.nextLine());

        if (validar(examen3)) {
        } else {    
            System.out.println ("Número mal.");   
            return;
        }
        
        notaFinal = calcularNotaFinal (examen1, examen2, examen3);
        
        System.out.println ("La nota final de la evaluacion es: " + notaFinal );
        
        System.out.println ("Tu calificación es: ");
        
            if (notaFinal < 5){
            System.out.println("Suspenso.");
            
        } else if (notaFinal >= 5 && notaFinal < 6){
            System.out.println("Suficiente.");
            
        } else if (notaFinal >= 6 && notaFinal < 8){
            System.out.println("Bien.");
            
        } else if (notaFinal >= 8 && notaFinal < 9){
            System.out.println("Notable.");
            
        } else if (notaFinal >= 9 && notaFinal < 10){
            System.out.println("Sobresaliente.");
            
        } else if (notaFinal == 10){
            System.out.println("Matrícula de honor.");
        }
        
    }
    
    public static boolean validar (double nota) {

        if (nota < 0 || nota > 10) {
            return false;
        } else {
            return true;
        }
    }
    
    public static double calcularNotaFinal ( double examen1, double examen2, double examen3) {
            return (examen1 * 0.3 + examen2 * 0.3 + examen3 * 0.4);
     }
}


