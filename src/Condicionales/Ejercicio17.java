import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca la clave: ");
        String clave = entrada.next();
        
        System.out.print("Introduzca de nuevo la clave: ");
        String clave2 = entrada.next();
        
        if(clave.equals(clave2)){
            System.out.println("Las claves coinciden");
        }
        else {
            System.out.println("Las claves no coinciden");
        } 
    }
}
