// 32. Escriba un programa que pida un número al usuario. Si el número introducido no es
// divisible por 2 y 3 entonces el programa mostrará un mensaje de error y volverá a pedir
// un número al usuario. En caso de que el número sea divisible por dichos números se
// mostrará el resultado de dividirlo por ellos y se terminará el programa.

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el numero: ");
        int num = entrada.nextInt();
        int division2, division3;
        
        //Inicio un bucle que compruebe si el numero no es divisible y mientras no lo sea vuelva a pedir un numero nuevo
        while((num % 2 != 0) || (num % 3 != 0)){
            System.out.print("Introduce el numero de nuevo: ");
            num = entrada.nextInt();
        }
        //Calculo las divisiones e imprimo el resultado
        division2 = num / 2;
        division3 = num / 3;
        System.out.println(num + " dividido entre 2 es: " + division2 + " y dividido entre 3 es: " + division3);            
    }

}
