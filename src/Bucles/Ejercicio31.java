//Realizar un algoritmo que pida por teclado un numero entero y a continuación
// muestre todos los divisores de ese número.

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        int i;
        String cad = "";
        
        //Inicio un bucle que aumente el divisor mientras sea menor o igual que el dividendo
        for (i = 1; i <= num; i++) {
                //Compruebo si es divisible y si es lo imprimo
                if(num % i == 0 && i == num){
                cad = cad + i;
            }
                else if (num % i == 0){
                    cad = cad + i + ", ";
                }
        }
        System.out.println(cad);
    }
}
