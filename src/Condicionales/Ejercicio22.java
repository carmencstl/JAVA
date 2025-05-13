package Condicionales;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce un mes: ");
        int mes = input.nextInt();
        
        System.out.print("Introduce un anio: ");
        int anio = input.nextInt();
        
        if(mes != 2){
            if(mes == 4 || mes == 6 || mes == 11 || mes == 9){
                System.out.println("Tiene 30 dias");
            }
            else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                System.out.println("Tiene 31 dias");
            }
        }
        else if (anio % 4 == 0 && anio % 100 != 0 && mes == 2){
            System.out.println("Tiene 29 dias");
        }
        else{
            System.out.println("Tiene 28 dias");
        }
    }

}
