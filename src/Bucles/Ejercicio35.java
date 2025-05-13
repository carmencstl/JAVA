import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num2 = entrada.nextInt();
//        int i= 1; 
        int multiplos;
        
//        while (i <= num2){
//            multiplos = num1 * i;
//            if(multiplos <= (num1 * num2)){
//                System.out.print(multiplos + ", ");
//             i++;   

        for(int i = 1; i * num1 <= (num1 * num2); i++ ){
            multiplos = num1 * i;
            System.out.print(multiplos + ", ");
        } 
    }
}