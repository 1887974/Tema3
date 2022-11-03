package tema3.Arrays;

import java.util.Scanner;

public class Ej_07_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String datosPersonales;
        
        System.out.println("Introduce tusdatos: (nombre;primer apellido;segundo apellido;correo;número de teléfono)");
        datosPersonales = scanner.nextLine();
        String[] cadaDato = datosPersonales.split (";");
        
        String nombreCompleto = cadaDato [0] + " " + cadaDato [1] + " " + cadaDato [2];
        String correo = cadaDato [3];
        String telefono = cadaDato [4];
        
        String[] parteCorreo= cadaDato [3].split ("@");
        String usuarioCorreo = parteCorreo [0];
        
        System.out.println("La información introducida corresponde a: ");
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Usuario de correo: " + usuarioCorreo);
        System.out.println("Número de teléfono: " + telefono);
     
    }
}

