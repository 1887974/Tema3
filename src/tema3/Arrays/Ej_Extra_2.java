package tema3.Arrays;

public class Ej_Extra_2 {

    public static void main(String[] args) {
    
        int [] lista1 = {1,2,3,2};
        int [] lista2 = {1,9,2,5};
        boolean sonIguales = true;
        
        //Comparar la i de cada lista
        for (int i=0; i<lista1.length; i++){
            
            if (lista1 [i] != lista2[i]){
                sonIguales = false;
        }
        
        if (sonIguales){
            System.out.println("Sí son iguales.");    
        } else System.out.println("No son iguales.");
        }
        
    }
}
    