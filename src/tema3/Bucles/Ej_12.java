package tema3.Bucles;

import java.util.Scanner;

public class Ej_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        boolean correoValido = false;
        
        do {
            boolean tieneArroba = false;
            boolean tienePunto = false;
            int posicionArroba = 0;
            int posicionPunto = 0;
            
            System.out.println("Introduce tu correo electronico: ");
            String correo = scanner.nextLine ();
            for (int i = 0; i <= correo.length()-1; i++){
                char caracterActual = correo.charAt(i);
                //comprobar el correo caracter a caracter
                if (caracterActual == '@'){
                    tieneArroba = true;
                    //guardar la posicion del @
                    posicionArroba = i;

                } else if (caracterActual == '.'){
                    tienePunto = true;
                    //guardar la posicion del punto
                    posicionPunto = i;
                } 
            }
            correoValido = tieneArroba && tienePunto && posicionArroba < posicionPunto;
            //se va a repetir el bucle mientras el correo no tenga las 3 condiciones
        } while (correoValido == false);
        //solo se va a imprimir por pantalla cuando se acabe el bucle, cuando el correo sea válido
        System.out.println ("Correo válido.");
        
    }
}
