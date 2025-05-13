import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Introduce la segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Introduce la tercera nota: ");
        double nota3 = entrada.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 6.5){
            System.out.println("Promociona con media de: " + media);
        }
        else {
            System.out.println("No promociona");
        }
    }
}
