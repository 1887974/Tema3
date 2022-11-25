/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;

/**
 *
 * @author sara.mula
 */
public class Ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] lista = new int [5];
        
        
        
        
        
        
        
        
    }
    
    public static int [] generar_lista(int lista[]){
        for(int i=0; i<lista.length; i++){
            int num = (int)(Math.random()*9+1);
            lista[i] = num;
        }
        return lista;
    }
    
    public static int suma_array(){
        int suma = 0;
        return suma;
    }
    
    
    
}
