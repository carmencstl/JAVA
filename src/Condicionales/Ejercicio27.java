//Escribe un programa que lea por teclado un número entero y escriba en pantalla los
//dígitos desglosados si es un número POOC válido, o un mensaje de error si no es un
//número POOC válido. Para ser válido se debe cumplir las 3 condiciones siguientes:
//• El número debe ser exactamente de 4 cifras.
//• El número de provincia debe ser un número entre 1 y 8 (ambos incluidos).
//• El dígito de control tiene que ser igual al resto de la división entera del tipo de
//operación entre el número de provincia.

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.print("Introduce un numero de 4 cifras: ");
        int num = entrada.nextInt();
        
        if(num >= 1000 && num <= 8999 && ((num % 1000) / 10) % (num / 1000) == (num % 10)){
            System.out.println("El numero POOC es valido");
            int p = num / 1000;
            System.out.println("P: " + p);
            int oo = (num % 1000) / 10;
            System.out.println("OO: " + oo);
            int c = num % 10;
            System.out.println("C: " + c);
        } 
        else{
            System.out.println("El numero POOC no es valido");
            }
    }

}
