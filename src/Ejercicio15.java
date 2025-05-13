import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero entero de cuatro cifras: ");
        int num = input.nextInt();
        
        int num1 = num / 1000;
        int num2 = ((num % 1000) / 100);
        int num3 = ((num % 100) / 10);
        int num4 = (num % 10);
        
        int nuevoNumero = (num4 * 1000) + (num3 * 100) + (num2 * 10) + num1;
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(nuevoNumero);
    }

}
