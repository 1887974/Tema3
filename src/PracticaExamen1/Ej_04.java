/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaExamen1;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Ej_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suma de diagonal cuadrado");
        System.out.println("-------------------------");
        System.out.println ("Tamaño del lado: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Cuadro generado");
        
        int[][] lista = new int[size][size];
        lista = rellenar_array(lista);
        
        imprimir_array(lista,size);
        int suma = suma_diagonal(lista);
        System.out.printf("%s%d\n","La suma de la diagonal es: ",suma);
        
    }
    
    public static int[][] rellenar_array (int[][]lista){
        int num;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                num = (int)(Math.random()*10);
                lista[i][j] = num;
            }
        }
        return lista;
    }
    
    public static void imprimir_array (int[][] lista, int size){
        for (int i = 0; i < lista.length; i++){
            for (int j = 0; j < lista.length; j++) {
                System.out.print(lista[i][j]);
                if (j == size -1){
                    System.out.print("\n");
                }
            }
        }
    }
    
    public static int suma_diagonal (int[][]lista){
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (i == j){
                    suma = suma + lista[i][j];
                }
            }
        }
        return suma;
    }
}
