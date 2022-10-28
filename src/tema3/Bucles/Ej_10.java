package tema3.Bucles;

import java.util.Scanner;

public class Ej_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        String tecla;
        int opcion;
        double numA, numB;
        
        do {
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            //Bucle hasta  que la opcion sea válida (Control de la entrada)
            do {
              System.out.println("Operación que desea realizar: (1-5)");  
              opcion = Integer.parseInt (scanner.nextLine());            
            } while (opcion <1 || opcion >5);
              
                  
            switch (opcion) {
                case 1: System.out.println("Primer número: "); 
                    numA = Double.parseDouble (scanner.nextLine());
                        System.out.println("Segundo número: "); 
                    numB = Double.parseDouble (scanner.nextLine());
                    System.out.println("La suma es: ");
                    System.out.print(numA + numB);
                        break;
                case 2: System.out.println("Primer número: "); 
                    numA = Double.parseDouble (scanner.nextLine());
                        System.out.println("Segundo número: "); 
                    numB = Double.parseDouble (scanner.nextLine());
                    System.out.println("La resta es: ");
                    System.out.print(numA - numB);
                        break;
                case 3: System.out.println("Primer número: "); 
                    numA = Double.parseDouble (scanner.nextLine());
                        System.out.println("Segundo número: "); 
                    numB = Double.parseDouble (scanner.nextLine());
                    System.out.println("La multiplicación es: ");
                    System.out.print(numA * numB);
                        break;
                case 4: System.out.println("Primer número: "); 
                    numA = Double.parseDouble (scanner.nextLine());
                        System.out.println("Segundo número: "); 
                    numB = Double.parseDouble (scanner.nextLine());
                    System.out.print("La división es: ");
                    System.out.println(numA / numB);
                        break;
                case 5: System.out.println("Saliendo del programa...");          
                        break;
            }   
            
        } while (opcion != 5);
        
        
}
    
}