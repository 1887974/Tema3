package tema3.Arrays;

public class Ej_Extra_3 {

    public static void main(String[] args) {
    
        char [] tablaAux = new char [9];
        int [] lista1 = {1,2,3,5};
        int [] lista2 = {1,9,2,5};
        int num;
        boolean sonIguales = true;
        
        //Rellenar la tabla auxiliar
        for (int i=0; i<lista1.length; i++){
            num = lista1 [i];
            tablaAux [num] = 'x';
        }
//        //Imprimir tabla auxiliar
//        for (int i=0; i<tablaAux.length; i++){
//            num = lista1 [i];
//            tablaAux [num] = 'x';
        
        //Comprobar si los elementos de la lista2 se encuentran marcadosen la tabla
        for (int i=0; 1<lista2.length; i++){
            num = lista2[i];
            if (tablaAux [num]!= 'x'){
                sonIguales = false;
            }
            
        if (sonIguales) {
            System.out.println("Sí son guales.");
        } else System.out.println("No son iguales.");
            
        }
    }
}

    