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
public class Ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] lista = new int [5];
        lista = generar_lista(lista);
        int num = 0;
        
        do{
            System.out.println("Manejador de arrays");
            System.out.println("-------------------");
            System.out.print("Array -> "); imprimir_array(lista);
            System.out.println("-------------------");
            System.out.println("1. Generar nuevo array");
            System.out.println("2. Obtener el máximo y el mínimo");
            System.out.println("3. Obtener la suma");
            System.out.println("4. Salir");
            System.out.println("-------------------");
            
            do{
                System.out.println("Eligue una opción:");
                num = Integer.parseInt(scanner.nextLine());
                    if(num > 4|| num < 1) System.out.println("Opción no disponible");
            }while(num > 4 || num < 1);

            switch(num){
                case 1: lista = generar_lista(lista);
                                imprimir_array(lista);
                        break;
                case 2: int numMax = mayor_valor(lista);
                        System.out.println("El mayor valor es: " + numMax);
                        int numMin = menor_valor(lista);
                        System.out.println("El menor valor es: " + numMin);
                        break;
                case 3: int suma = suma_array(lista);
                        System.out.println("La suma es: " + suma);
                        break;
                case 4: System.out.println("Saliendo..."); 
                        break;  
            }
            
        } while(num != 4);
    }
   
    public static int [] generar_lista(int lista[]){
        for(int i=0; i<lista.length; i++){
            int num = (int)(Math.random()*9+1);
            lista[i] = num;
        }
        return lista;
    }
    
    public static int suma_array(int lista[]){
        int suma = 0;
        for(int i=0; i<lista.length; i++){
            suma = suma + lista[i];
        }
        return suma;
    }
    
    public static int mayor_valor (int lista[]){
        int num = 0;
        for(int i = 0; i<lista.length;i++){
            if (num < lista[i]){
                num = lista[i];
            }
        }
        return num;
    }
    
    public static int menor_valor (int lista[]){
        int num = 10;
        for(int i = 0; i<lista.length;i++){
            if (num > lista[i]){
                num = lista[i];
            }
        }
        return num;
    }
    
    public static void imprimir_array (int lista[]){
        for(int i=0; i<lista.length; i++){
            System.out.printf("|%d",lista[i]);
        } System.out.println("|");
    }
}
