import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = entrada.nextInt();
        
        if (num1 < 0 && num2 < 0 && num3 < 0){
            System.out.println("Los numeros son: " + num1 + ", " + num2 + ", " + num3);
            if (num1 > num2 && num1 > num3){
                System.out.println("El mayor es: " + num1);
            }
            else if (num2 > num1 && num2 > num3){
                System.out.println("El mayor es: " + num2);
            }
            else if (num3 > num1 && num3 > num2){
                System.out.println("El mayor es: " + num3);
                
            }
            if(num1 < num2 && num1 < num3){
                System.out.println("El menor es: " + num1);
            }
            else if (num2 < num1 && num2 < num3){
                System.out.println("El menor es: " + num2);
            }
            else if (num3 < num1 && num3 < num2){
                System.out.println("El menor es: " + num3);
            }  
        }
        else {
                System.out.println("Al menos uno de los numeros no es menor que 0");
            }
        
    }

}
