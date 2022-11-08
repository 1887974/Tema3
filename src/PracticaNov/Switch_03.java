package PracticaNov;

import java.util.Scanner;

public class Switch_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        String color;
        int edad;
        
        System.out.println("Introduce el color: ");
        color = scanner.nextLine();
        
        switch (color){
            case "rojo": 
                System.out.println("Stop");
            case "verde":
                System.out.println("Adelante");
            case "ámbar":
                System.out.println("Introduce tu edad: ");
                edad = Integer.parseInt(scanner.nextLine());
                if (edad <20) System.out.println("Stop");
                else System.out.println("Adelante");
            default: System.out.println("Color no registrado");
    
        }
    
    }
}