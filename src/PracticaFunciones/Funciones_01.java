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
public class Funciones_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número a comprobar si es par o no: ");
        int num = Integer.parseInt(scanner.nextLine());
        
        if(esPar(num)){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }
        
    }    
    
    public static boolean esPar (int num){
        boolean resultado;
        if(num % 2 == 0){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
}
