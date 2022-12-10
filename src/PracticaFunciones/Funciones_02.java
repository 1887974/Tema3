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
public class Funciones_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un conjunto de 5 números para comprobar su fortuna:");
        int[] lista = new int [5];
        lista = rellenarArray(lista);

        if(esAfortunado(lista)){
            System.out.println("Es afortunado.");
        } else {
            System.out.println ("No es afortunado.");
        }
    }    
    
    public static int [] rellenarArray (int[] lista){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < lista.length; i++){
            int num = Integer.parseInt(scanner.nextLine());
            lista[i] = num;
        }
        return lista;
    }
    
    public static boolean esAfortunado (int[] lista){
        boolean resultado;
        int contadorAfortunado = 0;
        int contadorNoAfortunado = 0;
        
        for(int i = 0; i < lista.length; i++){
            if((lista[i] == 2) || (lista[i] == 5) || (lista[i] == 8)){
                contadorAfortunado ++;
            } else {
                contadorNoAfortunado ++;
            }
        }  
        
        if(contadorAfortunado > contadorNoAfortunado){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
}
