import java.util.Scanner;


public class ejercicioSumatorio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        int contador = 1;
        int suma = 0;
        
        while (num > 2 && contador <= num){
            suma += contador;
            contador++;
        }
        System.out.println(suma);
    }
}
