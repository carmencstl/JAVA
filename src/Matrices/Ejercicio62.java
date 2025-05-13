//62.- Crea un programa que cree una matriz de tamaño NxM (tamaños introducido por
//teclado) e introduzca en ella los valores también a través del teclado teclado. A
//continuación deberá mostrar por pantalla cuántos valores son mayores que cero, cuántos
//son menores que cero y cuántos son igual a cero (es decir, se muestran 3 números).

package Matrices;

import java.util.Scanner;


public class Ejercicio62 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Introduce el numero de columnas: ");
        int columnas = entrada.nextInt();
        int mayorC = 0;
        int menorC = 0;
        int cero = 0;
        
        int matriz[][] = new int[filas][columnas];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Introduce un numero: ");
                matriz[i][j] = entrada.nextInt();
                if(matriz[i][j] > 0){
                    mayorC++;
                }
                else if(matriz[i][j] < 0){
                    menorC++;
                }
                else{
                    cero++;
                }
                
            }
        }
        System.out.println("El numero de valores mayores que 0 es: " + mayorC);
        System.out.println("El numero de valores menores que 0 es: " + menorC);
        System.out.println("El numero de valores iguales a 0 son: " + cero);
        

    }

}
