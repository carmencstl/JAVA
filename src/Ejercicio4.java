import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        double m = entrada.nextDouble(); 
        
        System.out.println("Introduce el segundo numero");
        double n = entrada.nextDouble();
        
        double resultadoA = m / n * (m - n);
        double resultadoB = 12.3 / m + 5 - n * 9;
        double resultadoC = m * 2048 / n * 1024 - Math.pow(m, n);
        double resultadoD = Math.pow(3203 / m-n, n) % (Math.pow(n, 2)* Math.pow(m, 3));
        
        System.out.println("El resultado a) es: " + resultadoA);
        System.out.println("El resultado b) es: " + resultadoB);
        System.out.println("El resultado c) es: " + resultadoC);
        System.out.println("El resultado d) es: " + resultadoD);
        
    }

}
