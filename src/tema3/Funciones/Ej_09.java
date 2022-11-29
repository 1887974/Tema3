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
public class Ej_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.println("***************");
            String frase = scanner.nextLine();
            System.out.println("***************");
            System.out.println("1.Introduce una nueva cadena");
            System.out.println("2.Capitalizar la cadena");
            System.out.println("3.Sustituir los espacios en blanco");
            System.out.println("4.Salir");
            System.out.println("Introduce una opción:");
            num = Integer.parseInt(scanner.nextLine());
            
        switch(num){
            case 1: System.out.println("Introduce una nueva cadena de texto: ");
                    frase = scanner.nextLine();
                    break;
            case 2: System.out.println(sustituirBlancos(frase));
                    break;
            case 3: System.out.println(capitalizarCadena(frase));
                    break;
            case 4: System.out.println("Saliendo...");
                    break;
        }
            
            
        } while (num > 4 || num < 1);
    }
    
    public static String devolverCadena(String cadena){
        String texto = "";
        return texto;
    }
    
    public static String sustituirBlancos(String cadena){
        String textoSinEspacios = cadena.replace(' ','_');
        return textoSinEspacios;
    }
    
    public static String capitalizarCadena(String cadena){
//     String[] separadaPorEspacios = cadena.split(" ");
//		for (int i = 0; i < separadaPorEspacios.length; i++) {
//			String palabra = separadaPorEspacios[i];
//			char primeraLetra = palabra.charAt(0);
//			primeraLetra = Character.toUpperCase(primeraLetra);
//		} 
        for(int i=0; i<cadena.length(); i++){
            
            
        }

                String cadenaMayus = "";
		
		return cadenaMayus;
    }
    
}
