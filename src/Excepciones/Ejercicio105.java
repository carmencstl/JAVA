package Excepciones;
//105.-Implementa un programa que cree un array de números decimales cuyo tamaño
//debe indicarlo el usuario por teclado. A continuación, utilizando un bucle, debe pedir

import java.util.InputMismatchException;
import java.util.Scanner;

//tantos valores por teclado como tamaño tenga el array y los debe ir guardando en cada
//celda del array. Hay que manejar todas posibles excepciones y seguir pidiendo valores
//hasta rellenar completamente el vector.
public class Ejercicio105 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tam = -99;
        boolean salir = false;

        do {
            try {
                System.out.print("Introduce un tamanio: ");
                tam = teclado.nextInt();
                salir = true;

            } catch (InputMismatchException error) {
                System.out.println("Se ha introducido un valor incorrecto ");
                teclado.next();
            }
        } while (!salir);

        do {
            try {
                double array[] = new double[tam];
                for (int i = 0; i < array.length; i++) {
                    
                    try {
                        System.out.println("Introduce numeros para rellenar la lista: ");
                        array[i] = teclado.nextDouble();
                        
                    } catch (InputMismatchException error) {
                        System.out.println("Se ha introducido un valor incorrecto ");
                        teclado.next();
                        i--;
                    }
                }

            } catch (Exception error) {
                System.out.print("Se ha introducido un numero negativo. Introduce otro numero: ");
                tam = teclado.nextInt();
            }
        } while (tam < 0);

    }

}
