
package tema3.Condicionales;

import java.util.Scanner;

public class Switch_Ej_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        String color = (scanner.nextLine());

        
        
        switch (color) {
            case "verde": System.out.println ("Puedes pasar.");
                        break;
            
            case "rojo": System.out.println ("Stop.");
                        break;
                    
            case "ambar": System.out.println ("Dime la edad: ");
            int edad = Integer.parseInt (scanner.nextLine());
                
                if (edad < 20) { System.out.println ("Eres menor, detente.");
                }   else {System.out.println ("Adelante.");  
                }       break;
                
            default:
                System.out.println ("Error: color incorrecto.");
        }

        }
    }
