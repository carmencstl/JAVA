//29. Mejora el ejercicio 14 (minuto partido de futbol) añadiendo lo siguiente:
// • Impiden la entrada de segundos máximos (5400). Si el usuario se pasa, saca un
// mensaje por pantalla indicándolo y vuelve a pedir el número. 
//• El programa no termina hasta que el usuario mete un numero negativo.



import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce los segundos: ");
        int segundos = entrada.nextInt();
        
        while(segundos >= 0) {
            if (segundos >=5400){
                System.out.print("El numero introducido supera los minutos de partida. Introduzca otro numero: ");
                segundos = entrada.nextInt();
            }
            else{
                int min = segundos / 60;
                System.out.println("El partido se encuentra en el minuto: " + (min + 1));
                System.out.print("Introduzca los segundos: ");
                segundos = entrada.nextInt();
            }
        }
       System.out.println("Error, no puedes introducir un numero negativo");

    }
}
