/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaExamen1;

/**
 *
 * @author sara
 */
public class Ej_01 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        lista = rellenar_array(lista);
        imprimir_array(lista);
        
        System.out.printf("\n%s%d\n","Mínimo: ", valor_min(lista));
        System.out.printf("%s%d\n","Suma pares: ", suma_pares(lista));
        System.out.print("¿Aparece el 5?: ");
        if (aparece_cinco(lista)) {
            System.out.printf("%s\n","Sí");
        } else {
            System.out.printf("%s\n","No");
        }
    }
    
    public static int[] rellenar_array (int[]lista){
        int num;
        for (int i = 0; i < lista.length; i++) {
            num = (int)(Math.random()*9+1);
            lista[i] = num;
        }
        return lista;
    }
    
    public static void imprimir_array (int[] lista){
        System.out.printf("%s\n%s","Array números:","|");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%d%s",lista[i],"|");
        }
    }
    
    public static int valor_min (int[]lista){
        int min = 10;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
        }
        return min;
    }
    
    public static int suma_pares (int[]lista){
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                suma = suma + lista[i];
            }
        }
        return suma;
    }
    
    public static boolean aparece_cinco (int[]lista){
        boolean hayCinco = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == 5) {
                hayCinco = true;
            }
        }
        return hayCinco;
    }
}
