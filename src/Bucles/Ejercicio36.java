import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
//        int sumaMayor;
//        int sumaMenor;
        int suma = 0;
        int contador = 5;
        
        do{
            System.out.print("Introduce un numero: ");
            num = entrada.nextInt();
            suma = suma + num;
            if(num > 36){

            }
            else if (num < 10){

            }
            contador--;
        } while((contador > 0));
        System.out.println(suma);
    }
}
