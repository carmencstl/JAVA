package Cadenas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        boolean contiene = false;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.nextLine();
        System.out.print("Introduce una palabra: ");
        String palabra = entrada.next();

        String cadenaDividida[] = cadena.split(" ");

        int i = 0;

        while (i < cadenaDividida.length && !contiene) {
            if (cadenaDividida[i].equalsIgnoreCase(palabra)) {
                contiene = true;
            }
            i++;
        }

        if (contiene) {
            System.out.print("La frase contiene la palabra");
        } else {
            System.out.print("La frase no contiene la palabara");
        }
    }

}
