/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Cadenas;

/**
 *
 * @author sara.mula
 */
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Tres tigres son uno, dos, tres.";
        String cadenaBuscar = "tres";
        int contador = 0;
        
        cadena = cadena.toLowerCase();
        
        //cambiar puntos y comas por espacios para dividir las palabras e intrpducirlas en un array
        cadena = cadena.replace('.', ' ');
        cadena = cadena.replace(',', ' ');
        
        String[] palabras = cadena.split(" ");
        
//        //Listado de palabras encontradas
//        for (int i = 0; i < palabras.length; i++) {
//            System.out.println(palabras[i]);
//        }
        
        //comparar palabra por palabra con la cadena a buscar
        for(int i = 0; i<palabras.length; i++){
            if(palabras[i].equals(cadenaBuscar)){
                contador++;
            }
        }
        System.out.println("La palabra " + cadenaBuscar + " aparece un total de " + contador + " veces.");

    }
}
