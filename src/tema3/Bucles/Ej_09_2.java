package tema3.Bucles;

public class Ej_09_2 {

    public static void main(String[] args) {

        System.out.println ("Cronómetro: ");  
                //bucle externo minutos (i), interno segundos (j)
        for (int i = 0; i <= 2 ; i++) {	          
            for (int j = 0; j<= 59; j++) {
                
                if (j >= 0 && j<=9){
                    
                    System.out.println (i+ ":0" + j);            
                } else System.out.println (i+ ":" + j);            
                
                try {
                    Thread.sleep(1*1000);
                } catch (Exception e){
                    System.out.println(e);
                }
                
                    //para acabar en el 2:00
                if (i==2 && j==0){
                    break;
                }
            }
        }
        
    }
}