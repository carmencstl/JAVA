
package Bucles;


public class pruebaMathRandom {

    public static void main(String[] args) {
        int num = (int)(Math.random()* (10 - 5 ) + 5) ;
        
        
        while(num == 10){
            num = (int)(Math.random()* (10 - 5 ) + 5) ;
            System.out.println(num);
        }
    }

}
