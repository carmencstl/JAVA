// 39. Diseña un algoritmo que calcule el factorial de un número pedido por teclado.
// El factorial de un numero es la multiplicación desde el 1 hasta ese número. Pej 5! = 
//1*2*3*4*5 = 120

import java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        int factorial = 1;
        
        for(int i = 1 ; i <= num ; i++){
            factorial = factorial * i;        
        }
        System.out.println(factorial);      
    }
}
