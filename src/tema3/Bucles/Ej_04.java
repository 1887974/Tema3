package tema3.Bucles;

public class Ej_04 {

    public static void main(String[] args) {
        
        System.out.println ("Múltiplos de 5 usando un for. ");  
        
        int i;
        for (i=0; i<=50; i=i+5) {
            System.out.println(i);
        }
        
        System.out.println ("Múltiplos de 5 usando un do while. ");  

        int x=0;
        do {
            System.out.println(x);
            x+=5;
        } while (x <=50);
        
        System.out.println ("Múltiplos de 5 usando un while. ");  

        int a=0;
        while (a <= 50) {
            System.out.println(a);
            a+=5;
        }
        
        System.out.println("Múltiplos de 5 pares en orden descendente usando un for.");
        
        for (int j = 100; j>= 50; j-=2) {
            System.out.println(j);
        }
        
        System.out.println("Múltiplos de 5 pares en orden descendente usando un do while.");
        
//        int u=100;
//        do {
//            System.out.println(u);
//            u-=2;
//        } while (x >=50);
        
        System.out.println("Múltiplos de 5 en orden descendente usando un while.");
    
        int h=100;
        while (h >= 50) {
            System.out.println(h);
            h-=2;
        }
    
    }
}