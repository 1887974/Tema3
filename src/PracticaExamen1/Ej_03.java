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
public class Ej_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo de potencia");
        System.out.println("-------------------");
        System.out.println("Dime la base: ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.println("Dime el exponente: ");
        int exponente = Integer.parseInt(scanner.nextLine());
        
        double resultado;
        if (exponente >= 0){
            resultado = calculo_potencia(base,exponente);
        } else {
            resultado = potencia_negativa(base,exponente);
        }
        System.out.printf("%d%s%d%s%f\n",base," elevado a ",exponente," es ",resultado);
        
    }
    
    public static int calculo_potencia (int base, int exponente){
        int resultado = 1;
        if (exponente == 0){
            resultado = 1;
        } else {
            for (int i = 0; i < exponente; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;
    }
    
    public static double potencia_negativa (int base, int exponente){
        int resultado = 1;
        //el bucle no funciona porque el valor de exponente es negativo
        for (int i = 0; i < exponente; i++) {
                resultado = resultado * base;
            }
        resultado = 1 / resultado;
        return resultado;
    }
    
}
