/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaCadenas;

import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Cadenas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Recoger un char por teclado: ");
        System.out.println("----------------------------");
        char opcion;
        do{
            System.out.println("¿Quieres continuar? [S|N]");
            opcion = scanner.nextLine().charAt(0);//tomas el primer char del string 
            opcion = Character.toUpperCase(opcion);//se convierte siempre a mayúscula
            
        } while (opcion == 'S');
        
        System.out.println("Recoger un string por teclado: ");
        System.out.println("----------------------------");
        String opcion2;
        do{
            System.out.println("¿Quieres continuar? [S|N]");
            opcion2 = scanner.nextLine().substring(0,1);//tomas el char que ocupa el indice 0 del string
            opcion2 = opcion2.toUpperCase();//se convierte a mayúscula
            
        } while (opcion2.equals("S"));//se hace el bucle mientras que la opcion sea igual al string "S"
    }
    
}
