package tema3.Arrays;
/**
 *
 * @author sara.mula
 */
public class Ej_13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] alumnos = new String [5];
        double suma;
        int[] listaSuspensos = new int [3];
        int suspensos;
                
        alumnos [0] = "Juan";
        alumnos [1] = "Celia";
        alumnos [2] = "Alfredo";
        alumnos [3] = "María";
        alumnos [4] = "Pedro";
        
        double [][] notas = {{5,6,7,0},{4,2,7,0},{6,8,9,0},{10,8,9,0},{4,2,4,0}};
        
        //rellenar la columna [3] con 
        //bucle externo para pasar fila x fila
        for (int i = 0; i<5; i++){
            suma = 0;
            //bucle interno para pasar columna x columna
            for(int j = 0; j<3; j++){
            suma = suma + notas [i][j];    
            }
            //el índice de las medias es [i](cambia para cada fila)[3](mantiene la columna)
            notas [i][3] = suma/3; 
        }
        
        //sumar suspensos x columnas
        for (int i = 0; i<listaSuspensos.length; i++){
            suspensos = 0;
            if (i<5) {
                suspensos++;
            }
        listaSuspensos [i] = suspensos;
        }
        //imprimir tabla
        System.out.println("      Ev.1 Ev.2 Ev.3 Media");
        System.out.println("--------------------------");
        
        for (int fila = 0; fila<notas.length; fila++){
            System.out.printf(alumnos[fila]);
            for (int columna = 0; columna<4; columna++){
                System.out.printf(" "+notas [fila][columna]);
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------");
        System.out.printf("Susp: ");
        for(int i = 0; i<3; i++){
            System.out.print(listaSuspensos [i] + " ");
        }

        //sacar la media más alta
        double mayorMedia = 0;
        String alumnoMedia= "--";
        for (int i = 0; i<5; i++){
            if (notas [i][3]>mayorMedia)
                mayorMedia = notas [i][3];
            alumnoMedia = alumnos [i];
        }
        
        System.out.println("\nEl alumno con mayor media es " + alumnoMedia + " con un " + mayorMedia);
        
        
        
        
    }
    
}
