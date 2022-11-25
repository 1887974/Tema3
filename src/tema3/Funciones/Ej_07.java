/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;

/**
 *
 * @author sara.mula
 */
public class Ej_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector1 = {1,2,3};
        int [] vector2 = {1,2,4};
        
        int [] resultado = fusionar_vectores(vector1,vector2);
        
        System.out.println("Fusión de los vectores:");
        for(int i = 0; i < resultado.length; i++){
            System.out.println(" " + resultado[i]);
        }
        
        if(comparar_vectores(vector1,vector2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
    
    //comparar los array, si no tienen el mismo tamaño no se comparan
    public static boolean comparar_vectores(int[]lista1,int[]lista2){
        if(lista1.length != lista2.length){
            return false;
            } else{
                for(int i = 0; i<= (lista1.length + lista2.length); i++){
                    if(lista1[i] != lista2[i]){
                        return false;
                    }
                }
            }
        return true;
    }
    
    //unir 2 arrays, el indice es para continuar por la siguiente posicion libre
    //después de rellenarlo con el primer array
    public static int[] fusionar_vectores(int[]lista1,int[]lista2){
        int[] resultado = new int [lista1.length + lista2.length];
        int indice_contador = 0;
        
        for(int i=0; i<= lista1.length; i++){
            resultado[indice_contador] = lista1[i];
            indice_contador++;
        }
         for (int i = 0; i < lista2.length; i++) {
            resultado[indice_contador]=lista2[i];
            indice_contador++;
        }
        
        return resultado;
    }
}   

