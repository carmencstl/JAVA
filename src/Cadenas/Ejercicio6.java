
package Cadenas;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = entrada.nextLine();
        int num = 0;
        
        for(int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            switch (caracter){
                
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                num++;
                break;
            }
        }
        System.out.print(num);
    }
    
}
