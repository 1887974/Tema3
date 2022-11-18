/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Cadenas;

/**
 *
 * @author sara.mula
 */
public class Ej_10_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaLarga = "La resaca de Juan es pesada";
        String cadena = "esa";
        
        int indicePalabra;
        int totalPalabras = 0;
        
        boolean continuar = true;
        
        cadenaLarga = cadenaLarga.toLowerCase();
        
        //pasar índice por índice hasta sacar el de la cadena a buscar
        //en caso de que no aparezca devuelve -1 y finaliza el bucle
        while(continuar){
            indicePalabra = cadenaLarga.indexOf(cadena);
            
            if(indicePalabra != -1){
                totalPalabras ++;
                    cadenaLarga = cadenaLarga.substring(indicePalabra + cadena.length());
            } else {
                continuar = false;
            }
        }
        System.out.println("La cadena " + cadena + " está " + totalPalabras + " veces.");
        
    }
}
