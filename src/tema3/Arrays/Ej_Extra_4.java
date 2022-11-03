package tema3.arrays;

//import java.util.Arrays;

public class Ej_Extra_4 {

    public static void main(String[] args) {
        
        //System.out.println(Arrays.toString());
        
        int [] lista1 = {1,2,7,5};
        int [] lista2 = {1,3,5,2};
        
        //Comprobar caracter por caraceter
        for (int i=0; i< lista1.length; i++){
            //IMPORTANTE resetear el valor 
            boolean coincide = false;
            
            //Comprobar el primer caracter de la primera lista con todos los de la segunda
            for (int j=0; j< lista2.length; j++){
                
                if (lista1 [i] == lista2 [j]){
                    coincide = true;
                    break;
                }
            }
        
            if (coincide == false) {
                System.out.println("No son iguales.");
                break;
            }        
        
        }

    }
}

