//55.- Haz un programa que dado un array valores que posea una serie de números pej
// 2,4,6,8,1,3,5,7, y un numero que se pida por teclado, indique si ese número está
// en el array o no lo está
package Arrays;

import java.util.Scanner;



public class Ejercicio55 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arr[] = {2,4,6,8,1,3,5,7};
        int num;
        int i = 0;
        
        do{
            System.out.print("Introduce un numero: ");
            num = entrada.nextInt();
        }while(num < 0);
        
        while(i < arr.length && arr[i] != num){                       
            i++;
        }
          if(i < arr.length){
                System.out.println("Si aparece");
            }
            else{    
             System.out.println("No aparece");  
            }
        }     
}
