package Cadenas;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.nextLine();

        String cadenaNueva = cadena.substring(0, 4);
        String cadenaNueva2 = cadena.substring(cadena.length() - 3, cadena.length());
        System.out.print(cadenaNueva2);
    }

}
