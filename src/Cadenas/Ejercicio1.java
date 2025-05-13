
package Cadenas;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.next();
        System.out.println("La cadena tiene: " + cadena.length() + " caracteres.");
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(cadena.length()-1));
    }
    
}
