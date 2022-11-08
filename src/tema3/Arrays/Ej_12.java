package tema3.Arrays;
/**
 *
 * @author sara.mula
 */

public class Ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int [5][5];
        int sumaFila, sumaColumna;
        
        for(int fila = 0; fila<matriz.length; fila++){
            for (int columna = 0; columna<matriz.length; columna++){
                matriz [fila][columna] = (int)(Math.random()*10);
            } 
        }
        
        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j <matriz.length; j++){
                System.out.print(" " + matriz [i][j] + " ");
            } System.out.println(" ");
        }
        
        for (int fila = 0; fila<matriz.length; fila++){
            sumaFila = 0;
            for (int columna = 0; columna<matriz.length;columna++){
                sumaFila = sumaFila + matriz [fila] [columna];                
            } System.out.println("La suma de la fila " + (fila+1) + " es igual a " + sumaFila);
        }
        System.out.println("------------");
        
        for (int columna = 0; columna<matriz.length; columna++){
            sumaColumna = 0;
            for (int fila = 0; fila<matriz.length;fila++){
                sumaColumna = sumaColumna + matriz [fila] [columna];                
            } System.out.println("La suma de la columna " + (columna+1) + " es igual a " + sumaColumna);
        }
        
    }
}
