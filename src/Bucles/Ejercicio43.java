
package Bucles;

import java.util.Scanner;


public class Ejercicio43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");  
        int num = entrada.nextInt();
        
        for(int filas = 1; filas <= num; filas++){
            
            for(int espacios = 1; espacios <= (num - filas); espacios++){
                System.out.print(" ");
            }
            
            for (int asteriscos = 1; asteriscos <= filas; asteriscos++){
                System.out.print("* ");
            }
            System.out.println();      
        }
        

    }

}
