//40. Diseña un algoritmo que  pida dos números por teclado (m y n) y calcule el número
// combinatorio de ambos.
// El número combinatorio se calcula usando la expresión: m! / (n!*(m-n)!)
// Importante: No hay dar por supuesto que m es mayor que n . Hay que averiguar cuál es
// el mayor y cuál es el menor. 

package Bucles;

import java.util.Scanner;


public class Ejercicio40 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int factorialM = 1; int factorialN = 1;
         int combinatorio; int factorialX = 1; int x;
         
         System.out.print("Introduce el primer numero: ");
         int m = entrada.nextInt();  
         System.out.print("Introduce el segundo numero: ");
         int n = entrada.nextInt();
         
         int max = Math.max(m, n);
         int min = Math.min(m, n);
         
         for(int i = 1 ; i <= max ; i++){
            factorialM = factorialM * i;        
        }
        
         for(int i = 1 ; i <= min ; i++){
            factorialN = factorialN * i;        
        }
        
        x = max - min;
        
          for(int i = 1 ; i <= x ; i++){
            factorialX = factorialX * i;     
        }
        
        combinatorio = factorialM / (factorialX * factorialN);
        System.out.println("El numero combinatorio de " + m + " y " + n + " es: " + combinatorio);
         
         
         
    }

}
