import java.util.Scanner;
public class T1P1E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Pido al usuario que introduzca un numero
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        
        //Compruebo si es positivo 
        if(num % 2 == 0){
            //Compruebo si es divisible entre 7
            if(num % 7 == 0){
                System.out.println("El numero es par y divisible entre siete");
            }
            //Si no es divisible entre siete
            else{
                System.out.println("El numero es par pero no es divisible entre siete");
            }
        }
        //Compruebo si no es positivo
        else{
            //Compruebo si es divisible entre 7
            if(num % 7 == 0){
                System.out.println("El numero no es par pero divisible entre siete");
            }
            //Si no es divisible entre siete
            else{
                System.out.println("El numero no es par y no es divisible entre siete");
            }
        }
    }
}
