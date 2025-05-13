import java.util.Scanner;

public class ejercicioPizarra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el anio: ");
        
        int anio = input.nextInt();
        int siglo = anio / 100;
        
        System.out.println(anio + " pertenece al siglo: " + (siglo + 1));
    }

}
