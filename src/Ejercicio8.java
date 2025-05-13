import java.util.Random; 
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
    Random rn = new Random();
    Scanner input = new Scanner(System.in);
        System.out.print("Introduce el numero de caras que tendra el dado: ");
        int num = input.nextInt();
        int cara = rn.nextInt(1, num+1);
        System.out.println(cara);
        
    }
}
