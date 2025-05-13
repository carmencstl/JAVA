import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = entrada.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = num1 / num2;
        double potencia = Math.pow(num1, num2);

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + producto);
        
        System.out.println("El cociente de " + num1 + " entre " + num2 + " da: " + cociente);
        
        System.out.println(num1 + " elevado a " + num2 + " da: " + potencia);
    }

}
