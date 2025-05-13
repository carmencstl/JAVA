import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        double segundos = entrada.nextDouble();
        
        double horas = segundos / 3600;
        double minutos = segundos / 60;
        
        System.out.println( segundos + " expresado en horas son: " + horas + " En minutos son: " + minutos + " y en segundos: " + segundos);
    }
}
