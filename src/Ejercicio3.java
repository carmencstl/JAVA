import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.print("Introduce el primer numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Introduce el segundo numero: ");
        double num2 = entrada.nextDouble();
        
        System.out.print("Introduce el tercer numero: ");
        double num3 = entrada.nextDouble();
        
        System.out.print("Introduce el cuarto numero: ");
        double num4 = entrada.nextDouble();
        
        System.out.print("Introduce el quinto numero: ");
        double num5 = entrada.nextDouble();
        
        double media = (num1 + num2 + num3 + num4 + num5) / 5;
        
        if (media % 1 != 0){
            System.out.println("La media es: " + media);
        } 
        else{
            System.out.println("La media es: " + (int) media);
            }
        }
        
    }

