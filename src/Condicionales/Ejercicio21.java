package Condicionales;

import java.util.Scanner;
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce un anio: ");
        int anio = input.nextInt();
        
        if(anio % 4 == 0 && anio % 100 != 0) {
            System.out.println("Es bisiesto");
        }
        else {
            System.out.println("No es bisiesto");
        }
    }
}
