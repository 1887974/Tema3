
package tema3.Condicionales;

import java.time.LocalTime;
//import java.util.Scanner;

public class Ej_4 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);       

        LocalTime localTime = LocalTime.now();
        
        System.out.println ("Introduzca hora actual: ");        
        int hora = localTime.getHour();

        
        if (hora >= 6 && hora < 12){
            System.out.println("Son las " + hora + " horas. Buenas días. ");
        }
        else if (hora >= 12 && hora < 21){
            System.out.println("Son las " + hora + " horas. Buenas tardes. ");
        }
        else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <6)){
            System.out.println("Son las " + hora + " horas. Buenas noches. ");
        }
//        else if (hora >= 0 && hora < 6){
//            System.out.println("Son las " + hora + " horas. Buenas noches. ");
//        }

        }
    }