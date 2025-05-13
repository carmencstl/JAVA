
package Bucles;

import java.util.Scanner;


public class Ejercicio45 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
  
        do{
            System.out.print("Introduce un numero mayor que 10: "); 
            num = entrada.nextInt();
        }while(num < 10);
        
        for(int i = 1; i <= num; i++){
           
            if(i % 3 == 0 && i % 5 != 0){ 
                if(i != num){
                    System.out.print("FIZZ, ");
                }
                else{
                     System.out.print(" FIZZ ");      
                }
            } 
                
            else if(i % 5 == 0 && i % 3 != 0 ){
                if(i != num){
                System.out.print("BUZZ, ");
                }
                else{
                    System.out.print("BUZZ ");
                }
            }    
            else if((i % 5 == 0) && (i % 3 == 0)){
                if (i != num){
                System.out.print("FIZZBUZZ, ");
                }
                else{
                    System.out.print("FIZZBUZZ ");
                }
            }
            else if(i != num){
                System.out.print(i + ", ");
            }
            else{
                System.out.print(i + " " );
            }
        }
                 
    }       

}   
