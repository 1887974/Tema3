    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFunciones;

/**
 *
 * @author sara
 */
public class Funciones_07 {
    public static void main(String[] args) {
        int[] lista1 = {1,4,3};
        int[] lista2 = {3,4,5};
        
        if(comparar_vectores(lista1, lista2) == true){
            System.out.println("Son iguales");
        } else{
            System.out.println("No son iguales");
        }
        System.out.println("La unión de ambos arrays es:");
        int[] resultado = fusionar_vectores(lista1,lista2);
        for(int i = 0; i < resultado.length; i++){
            System.out.println (" " + resultado[i]);
        }
    }
    
    public static boolean comparar_vectores(int[]lista1, int[]lista2){
        boolean sonIguales = false;
        if(lista1.length != lista2.length){
            sonIguales = false;
        } else{
            for(int i = 0; i < lista1.length; i++){
                if(lista1[i] == lista2[i]){
                    sonIguales = true;
                }
            }
        }
        return sonIguales;
    }
    
    public static int[] fusionar_vectores (int[]lista1, int[]lista2){
        int[] listaNueva = new int [lista1.length+lista2.length];
        int indiceListaNueva = 0;
        
        //se llena el array hasta 1 indice menos que lista1.length
        //se va sumando 1 cada vez que se llena un indice para que cuando pase a llenar con los valores 
        //de lista2 siga por el indice vacio
      
        for(int i = 0; i < lista1.length; i++){
            listaNueva[indiceListaNueva] = lista1[i];
            indiceListaNueva++;
        }
        
        for(int i = 0; i < lista2.length; i++){
            listaNueva[indiceListaNueva] = lista2[i];
            indiceListaNueva++;
        }
        return listaNueva;
    }
    
}
