import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int segundos;
        System.out.print("Introduce los segundos: ");
        segundos = input.nextInt();
        
        int minutos = (int)(Math.ceil(segundos / 60 ));
        System.out.println("Nos encontramos en el minuto: " + (minutos + 1));
        
    }
}
