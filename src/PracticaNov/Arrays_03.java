package PracticaNov;
/**
 *
 * @author sara.mula
 */

import java.util.Scanner;

public class Arrays_03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int [] notas = new int [5];
        int nota;
        
        System.out.println("Introduce las notas: ");
        //bucle para rellenar los 5 valores del array
        for (int i = 0; i<notas.length;i++){
            System.out.println((i+1) + "ª nota: ");
            nota = Integer.parseInt(scanner.nextLine());
            notas[i] = nota;
        }
        
        int notaMax = 0;
        int notaMin = 10;
        int suma = 0;

        for(int i = 0; i<notas.length;i++){
            if(notas[i]>notaMax) notaMax = notas[i];
            if(notas[i]<notaMin) notaMin = notas[i];
            suma = suma + notas[i];
            
        }
        
        double notasMedia = suma/notas.length;
        
        System.out.println("La nota más alta es " + notaMax);
        System.out.println("La nota más baja es " + notaMin);
        System.out.println("La nota más media es " + notasMedia);
        
        
    }
}