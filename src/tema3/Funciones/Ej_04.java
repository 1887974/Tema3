/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Funciones;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author sara.mula
 */
public class Ej_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una la fecha (dd/mm/aaaa):");
        int dia = Integer.parseInt(scanner.nextLine());
        int mes = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        
        boolean fechaCorrecta;
        if(fechaCorrecta){
        System.out.println("Fecha introducida: " + imprimirFecha(dia, mes, year));
        } else{
            System.out.println("La fecha es incorrecta");
        }
    }
    
    public static boolean comprobarFecha(int dia, int mes, int year){
        boolean diaCorrecto;
        boolean mesCorrecto;
        boolean yearCorrecto;
        
        if (year >= 1900 && year <= 2500) {
            yearCorrecto = true; 
        } else {
            yearCorrecto = false;
        }
        
        if (mes <= 1 && mes <= 12) {
            mesCorrecto = true;
        } else {
            mesCorrecto = false;
        }
        switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12: 
            if (dia >= 1 && dia <= 31) diaCorrecto = true;
            else diaCorrecto = false;        
                        break;
            
        case 4, 6, 9, 11: 
            if (dia >= 1 && dia <= 31) diaCorrecto = true;
            else diaCorrecto = false;
                        break;
        
        case 2: 
            if (Year.of(year).isLeap()){
                if (dia >= 1 && dia <= 29) diaCorrecto = true;
                else diaCorrecto = false;
            }
            else {
                if (dia >= 1 && dia <= 28) diaCorrecto = true;
                else diaCorrecto = false;
            }        
        }
        
        return ;
    }
    
    public static String imprimirFecha (int dia, int mes, int year){
        
        String[] mesNombre = {
            "","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
        };
            String fechaExt = String.format("%d de %s de %d",dia,mesNombre[mes],year);
            return fechaExt;
    }
    
}
