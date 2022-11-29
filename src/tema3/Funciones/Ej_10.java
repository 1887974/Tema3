/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;

/**
 *
 * @author sara.mula
 */
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numerosPorValor;
        numerosPorValor = rellenarArray (5);
        imprimirArray(numerosPorRef);
        
        int numerosPorRef[ = new int[5];
        rellenarArray(numerosPorRef);
        imprimirArray(numerosPorRef);
        
    }
    
    public static void modificar(int[] array){
        
    }
    
    public static void rellenarArray(int vector[]){
        
    }
   
    public static void imprimirArray (int vector[]){
        System.out.print("Array--> ");
        for (int i = 0; i < vector.length; i++) {
        System.out.print(" "+vector[i]);
        }
        System.out.println("");
    }
    
}
