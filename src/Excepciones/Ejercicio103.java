//103.- Crea un programa que pida al usuario una cadena de texto y un numero entero N.
//A continuación, el programa indicará el carácter de la cadena situado en la posición N.
//En caso de que no se pueda realizar dicha acción debe mostrarse el mensaje: “No existe
//la posición N en la cadena” (Siendo N el número indicado por el usuario).
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio103 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = -99;
        boolean salir = false;

        System.out.print("Introduce un mensaje: ");
        String texto = teclado.nextLine();

        do {
            try {
                System.out.print("Introduce un numero: ");
                numero = teclado.nextInt();
                System.out.println(texto.charAt(numero));
                salir = true;

            } catch (InputMismatchException error) {
                System.out.println("Se ha introducido un valor incorrecto");
                teclado.nextLine();
            } catch (IndexOutOfBoundsException error) {
                System.out.println("No exite la posicion " + numero + " en la cadena");
            }
        } while (!salir);

    }

}
