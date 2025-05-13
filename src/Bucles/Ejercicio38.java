
package Bucles;

import java.util.Scanner;


public class Ejercicio38 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
        System.out.print("Introduce cuantas notas hay: ");
        int numNotas = entrada.nextInt();
        double nota = 0; double suma = 0; double media;
        
        for(int i = 1; i <= numNotas; i++){
            do{
                System.out.print("Introduce la nota n" + i + ": ");
                nota = entrada.nextDouble();
            } while(nota < 0 && nota > 10);
            suma = suma + nota; 
            
        } media = suma / numNotas;
        System.out.println("La media es: " + media);
        
        
    }

}
