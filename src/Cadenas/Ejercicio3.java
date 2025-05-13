package Cadenas;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.nextLine();
        System.out.print("Introduce un caracter: ");
        char car = entrada.next().charAt(0);

        cadena.replace('a', car);
        cadena.replace('e', car);
        cadena.replace('i', car);
        cadena.replace('o', car);
        cadena.replace('u', car);
        cadena.replace('A', car);
        cadena.replace('E', car);
        cadena.replace('I', car);
        cadena.replace('O', car);
        cadena.replace('U', car);
        

    }

}
