import java.util.Scanner;
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Introduce el segundo numero: ");
        double num2 = entrada.nextDouble();
        
        if(num1 > num2){
            System.out.println(num1 - num2);
            System.out.println(num1 / num2);
        }
        else {
            System.out.println(num1 + num2);
            System.out.println(num1 * num2);
        }
    }
}
