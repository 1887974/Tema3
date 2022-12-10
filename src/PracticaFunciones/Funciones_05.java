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
public class Funciones_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Generador de números aleatorios(15)");
        System.out.println("Introduce el valor más bajo: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el valor más alto: ");
        int max = Integer.parseInt(scanner.nextLine());
        
        int[] lista = aleatorio(min,max);
        for(int i = 0; i < lista.length; i++){
            System.out.printf("%d\t",lista[i]);
        }
    }    
    
    public static int[] aleatorio (int min, int max){
        int[] lista = new int [15];
        for(int i = 0; i < lista.length; i++){
            int num = (int)(Math.random()*(max-min+1)+min);
            lista[i] = num;
        }
        return lista;
    }
}
