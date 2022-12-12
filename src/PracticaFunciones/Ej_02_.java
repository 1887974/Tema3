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
public class Ej_02_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int [10];
        
        rellenar_array(lista);
        imprimir_array(lista);
        System.out.println("\nLa suma del array tras su modificación es: " + suma_array(lista));
    }   
    
    public static void rellenar_array (int[]lista){
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random()*10);
        }
    }
    
    public static void imprimir_array(int[]lista){
        System.out.println("Los valores del array previos a su modificación son: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%d%s",lista[i],"  ");
        }
    }
    
    public static int suma_array (int[]lista){
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = lista[i] + 10;
            suma = suma + lista[i];
        }
        return suma;
    }
    
}
