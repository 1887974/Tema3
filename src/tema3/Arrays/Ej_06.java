package tema3.Arrays;

import java.util.Scanner;

public class Ej_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] diasMes = {0,28,29,30,31};
        String [] nombresMes = {"","enero", "febrero","marzo","abril","mayo","junio", "julio", "agosto","septiembre","octubre","noviembre","diciembre"};
        
        int dia, mes, year;
        System.out.println("Introduce el día: ");
        dia = Integer.parseInt (scanner.nextLine ());
        
        System.out.println("Introduce el mes: ");
        mes = Integer.parseInt (scanner.nextLine ());
        
        System.out.println("Introduce el año: ");
        year = Integer.parseInt (scanner.nextLine ());
        
        if (dia >= 1 && dia <= 30) {
            System.out.println("Día correcto. ");
        } else {
            System.out.println("Día incorrecto. ");
        }
        
        switch (mes) {
            case 1,3,5,7,8,10,12:
                31
            case 4,6,9,11:
                30
            case 2:
                if (Year.of(year).isLeap ()){
                 29   
                } else {
                    28
                }
        }
        
        System.out.println(nombresMes[0]);
        
        if (mes >= 1 && mes <= 12) {
            System.out.println("Mes correcto. ");
        } else {
            System.out.println("Mes incorrecto. ");
        }
        if (year != 0) {
            System.out.println("Año correcto. ");
        } else {
            System.out.println("Año incorrecto. ");
        }
        
        System.out.println("El " +dia+ "de" +mes+ "de" +year+ "es una fecha correcta");
        System.out.println("El " +dia+ "de" +mes+ "de" +year+ "es una fecha incorrecta");
    
    }
}