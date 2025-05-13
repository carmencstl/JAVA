// 30. Escribe un programa que lea de teclado 2 números enteros y saque en pantalla todos
// los números que estén entre ellos. Ejemplo:
// Introduce primer número: 4
// Introduce segundo número: 10
// 4,5,6,7,8,9,10
// Importante: El programa no debe asumir que el usuario introducirá primero el número más
// pequeño.
// b) Modifica el programa para que solo escriba en pantalla los números pares del
// intervalo.

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = entrada.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        String cad = "";
     
//        if(num1 < num2){
//            min = num1;
//            max = num2;
//        }
//        else{
//            max = num1;
//            min = num2;
//        }
//        while (min <= max){
//            if((min % 2 == 0) && (min == max || min == max - 1)){
//               cad = cad + min;
//           }
//            else if(min % 2 == 0) {
//                cad = cad + min + ", ";
//            }
//            min++;
//        }
//        System.out.println(cad);

        for(int i = min; i <= max; i++){
             if((i % 2 == 0) && (i == max || i == max - 1)){
               cad = cad + i;
           }
           else if(i % 2 == 0) {
                cad = cad + i + ", ";
           }       
        }
        System.out.println(cad); 
    }
}
