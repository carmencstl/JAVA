import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        double num = entrada.nextDouble();
        
        double horas = num / 3600;
        double minutos = ((num % 3600) / 60);
        double segundos = ((num % 3600) % 60);
        
        System.out.println((int) num + " expresado en horas son: " + (int) horas + ":" + (int) minutos + ":" + (int) segundos);
        
    }
}
