import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del jugador 1: ");
        String jug1 = entrada.next();
        
        System.out.print("Introduce el nombre del jugador 2: ");
        String jug2 = entrada.next();
        
        int dado1 = (int)(Math.random() * 6 + 1);
        int dado2 = (int)(Math.random() * 6 + 1);
               
        if(dado1 > dado2 ){
            System.out.println("Ha ganado " + jug1);
        }   
        else if(dado1 == dado2){
        System.out.println("Empate");
        }
        else {
            System.out.println("Ha ganado " + jug2 );
        }
    }
}
