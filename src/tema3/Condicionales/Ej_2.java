
package tema3.Condicionales;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    

        String usuario = "root";
        String password = "toor";

        System.out.println ("Iniciar sesión con usuario: ");        

        usuario = (scanner.nextLine());

        System.out.println("Contraseña: ");

        password = (scanner.nextLine ());

        if (usuario.equals ("root") && password.equals ("toor")){
            System.out.println ("Login correcto. Bienvenido.");
        }
        else { System.out.println ("Login incorrecto. ");
//        
//        boolean usuarioOK = false;
//        boolean passwordOK = false;
//        
//        if (usuario.equals ("root")) {
//            usuarioOK = true;
//                }
//        else { password.equals ("toor"));
//        }
//            passwordOK = true;
//        
        }
        
    }
}