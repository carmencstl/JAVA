
package Cadenas;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.nextLine();
        
        String palabras [] = cadena.split(" ");
        System.out.print(palabras.length);
                
    }
    
}
