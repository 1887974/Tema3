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
        
        
        switch(comprobarFecha(dia,mes,year)){
            case 0: System.out.println("Fecha introducida: " + imprimirFecha(dia, mes, year));
                    break;
            case 1: System.out.printf("La fecha %d/%d/%d es \033[31mINCORRECTA (año incorrecto)\n",dia,mes,year);
                    break;
            case 2: System.out.printf("La fecha %d/%d/%d es \033[31mINCORRECTA (mes incorrecto)\n",dia,mes,year);
                    break;
            case 3: System.out.printf("La fecha %d/%d/%d es \033[31mINCORRECTA (día incorrecto)\n",dia,mes,year);
                    break;
        }
    }
    
    public static int comprobarFecha(int dia, int mes, int year){
        boolean diaCorrecto = false;
        boolean mesCorrecto;
        boolean yearCorrecto;
        
        //analizo el año
        if (year >= 1900 && year <= 2500) {
            yearCorrecto = true; 
        } else {
            yearCorrecto = false;
        }
        //analizo el mes
        if (mes >= 1 && mes <= 12) {
            mesCorrecto = true;
        } else {
            mesCorrecto = false;
        }
        //analizo el dia dependiendo del mes
        switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12: 
            if (dia >= 1 && dia <= 31) diaCorrecto = true;
            else diaCorrecto = false;        
                        break;
        case 4, 6, 9, 11: 
            if (dia >= 1 && dia <= 31) diaCorrecto = true;
            else diaCorrecto = false;
                        break;
        //analizo si febrero es bisisesto
        case 2: 
            if (Year.of(year).isLeap()){
                if (dia >= 1 && dia <= 29) diaCorrecto = true;
                else diaCorrecto = false;
            }
            else {
                if (dia >= 1 && dia <= 28) diaCorrecto = true;
                else diaCorrecto = false;
            }
                        break;
        }
        //codigo para saber qué dato es incorrecto
        if(yearCorrecto == false) return 1;
        else if(mesCorrecto == false) return 2;
        else if(diaCorrecto == false) return 3;
        else return 0;//todo correcto
        }
    
    public static String imprimirFecha (int dia, int mes, int year){
        String[] mesNombre = {
            "","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
        };
            String fechaExt = String.format("%d de %s de %d",dia,mesNombre[mes],year);
            return fechaExt;
    }
    
}
