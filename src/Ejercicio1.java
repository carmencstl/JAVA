import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce tu DNI: ");
        String dni = entrada.nextLine();

        System.out.print("Introduce tu fecha de nacimiento: ");
        String fecha = entrada.nextLine();

        System.out.println("Nombre...............: " + nombre);
        System.out.println("DNI..................: " + dni);
        System.out.println("Fecha de Nacimiento..: " + fecha);
    }
}
