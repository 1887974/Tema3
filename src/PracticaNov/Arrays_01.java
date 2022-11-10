package PracticaNov;
/**
 *
 * @author sara.mula
 */
public class Arrays_01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] animales = {"perro","gato","conejo","pollo","león"};
        
        System.out.println(animales[0] +" "+ animales[1] +" "+  animales[2] +" "+  animales[3] +" "+  animales[4]);
        
        for (int i =0; i < animales.length; i++){
            System.out.println(animales[i]);
        }
        
        int[] num = {2,4,6,8,10};
        
        for (int i = num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }
    }
}
