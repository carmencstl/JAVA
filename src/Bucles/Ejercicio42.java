//42. Escribe un algoritmo que lea por teclado un número N entero positivo y dibuje un
// cuadrado de asteriscos de lado N. Pej: Si el número es 4, se obtiene:
package Bucles;

import java.util.Scanner;


public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");  
        int num = entrada.nextInt();
        String cad = "";
        
        for(int i = 1; i <= num;  i++){
            if(i < num){
                cad = cad + "* ";
            }
            else{
                cad = cad + "*";
                      
            }   
        }
        
        for(int i = 1; i <= num;  i++){
        System.out.println(cad);
    }
    }
}