package tema3.Arrays;

public class Ej_5 {

    public static void main(String[] args) {
        
        int [] lista = {1,2,7,4};
        boolean creciente;
        
        //Comprobar caracter por caraceter
            for (int i=0; i < lista.length-1; i++){
                creciente = false;

                if (lista [i] < lista [i+1]){
                    creciente = true;
                } 

                if (creciente == false) {
                    System.out.println("No está en orden creciente.");
                    break;
                }


            }
        if (creciente == true){
        System.out.println("Está en orden creciente.");
        }
    }
}

