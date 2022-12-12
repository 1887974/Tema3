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
public class Ej_01_password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tieneCuatroPalabras;
        String cadena;
        do{
            System.out.println("Introduce la cadena de texto a cifrar: (mínimo 4 palabras)");
            cadena = scanner.nextLine();
            if (total_palabras(cadena) >= 4){
                tieneCuatroPalabras = true;
            } else {
                System.out.println("Número de palabras insuficiente!!");
                tieneCuatroPalabras = false;
            }
        } while (tieneCuatroPalabras == false);
        generar_contraseña(cadena);
        System.out.printf("%s%d%s\n","La cadena tiene un total de ",total_palabras(cadena)," palabras");
        
    }
    
    public static int total_palabras (String cadena){
        cadena = cadena.trim();
        String [] listaPalabras = cadena.split(" "); 
        return listaPalabras.length;
    }
    
    public static void generar_contraseña (String cadena){

        String password = "";
        String [] listaPalabras = cadena.split(" ");
        
        password = password + Character.toUpperCase(listaPalabras[0].charAt(0));
        for (int i = 1; i < listaPalabras.length; i++) {
            password = password + Character.toLowerCase(listaPalabras[i].charAt(0));
        }
        int num = (int)(Math.random()*10);
        password = password + '+' + num;
        
        System.out.println("Contraseña generada: " + password);
    }
    
}
