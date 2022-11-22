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
public class Ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String cadena;
       int num;
       System.out.println("¿Es afortunado?:");
       System.out.println("----------------");
       
       do{
            System.out.println("Introduce un número (intro para salir):");
            cadena = scanner.nextLine();
            
            if(!cadena.equals("")){
                num = Integer.parseInt(cadena);
                if(esAfortunado(num)){
                    System.out.println(num + " es afortunado");
                }else {
                    System.out.println(num + " no es afortunado");
                }
            }
       } while(!cadena.equals(""));
        System.out.println("Saliendo...");
    }
    
    public static boolean esAfortunado(int num) {
        
        int afortunados = 0;
        int noAfortunados = 0;
        
        while(num > 0){
            int digito = (int)(num%10);
            if ((digito == 2)||(digito == 5) ||(digito == 8)){
                afortunados++;
            } else {
                noAfortunados++;
            }
            num /= 10;
        }
        
        if(afortunados > noAfortunados){
            return true;
        } else{
            return false;
        }
    }
    
}
