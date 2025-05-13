
package Arrays;
import java.util.Scanner;

public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String arr[] = new String[10];
        int rojo = 0;
        int azul = 0;
        
        System.out.println("Introduce un color: ");
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = entrada.next();
            if(arr[i].equals("rojo")){
                rojo++;
            }
            else if(arr[i].equals("azul")){
                azul++;
            }
            
        }
        System.out.println("El numero de veces que aparece el color azul es: " + azul);
        System.out.println("El numero de veces que aparece el color rojo es: " + rojo);
    }

}
