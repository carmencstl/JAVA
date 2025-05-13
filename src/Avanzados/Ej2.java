//2. Crea un programa que, a partir de un número introducido por el usuario, pinte las
//siguientes figuras:
//a) Triangulo rectángulo de números. Ejemplo:
//Altura de la figura: 6
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//6 6 6 6 6 6
package Avanzados;

import java.util.Scanner;


public class Ej2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int altura = entrada.nextInt();
        
        for (int i = 1; i <= altura; i++){
            for(int j = 1; j <= i; j++){
               System.out.print(i + " "); 
            }
            System.out.println();
        }
           

        for (int i = 1; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } 
    }

}
