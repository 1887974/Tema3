/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFunciones;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Funciones_08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int max = 10; int min = -10; int num = 0;
        int [] lista = new int [5];
        lista = generar_lista(lista,max,min);
        
        do{
            System.out.println("Manejador de arrays");
            System.out.println("-------------------");
            System.out.print("Array -> ");
            imprimir_lista(lista);
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
                case 1: lista = generar_lista(lista,max,min);
                        break;
                case 2: int numMax = mayor_valor(lista,min);
                        System.out.println("El mayor valor es: " + numMax);
                        int numMin = menor_valor(lista,max);
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
    public static int[] generar_lista (int[]lista,int max,int min){
        for(int i = 0; i < lista.length; i++){
            int num = (int)(Math.random()*(max-min+1)+min);
            lista[i] = num;
        }
        return lista;
    }
    
    public static int suma_array (int[]lista){
        int suma = 0;
        for (int i = 0; i < lista.length; i++){
            suma = suma + lista[i];
        }
        return suma;
    }
    
    public static int mayor_valor (int[]lista,int min){
        int num = min;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] > num){
                num = lista[i];
            }
        }
        return num;
    }
    
    public static int menor_valor (int[]lista, int max){
        int num = max;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] < num){
                num = lista[i];
            }
        }
        return num;
    }
    
    public static void imprimir_lista (int[]lista){
        System.out.println("Lista generada -> |");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%d%s","|");
        }
    }
}
