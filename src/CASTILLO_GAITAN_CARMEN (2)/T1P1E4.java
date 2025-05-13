import java.util.Scanner;
public class T1P1E4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.print("Introduce un numero positivo (numero negativo para salir): ");
        int num = teclado.nextInt();
        int i = 0;
        int suma = 0;
        int media;
        
        //Hago un bucle para que siga preguntando hasta que sea negativo
        while(num > 0){
            //Hago el sumatorio primero para que cuando vuelva a pedir el numero no cuente el negativo
            suma = suma + num;
            //Vuelvo a pedir un numero
            System.out.print("Introduce un numero positivo (numero negativo para salir): ");
            num = teclado.nextInt();
            //sumo a la variable contador las veces que se ejecuta el bucle para saber cuantos numeros se han introducido
            i++;
        }
        //Fuera del bucle calculo la media usando el sumatorio y el total del vueltas del bucle
        media = suma / i;
        //Imprimo los resultados
        System.out.println("Se han introducido: " + i);
        System.out.println("La suma de todos ellos es: " + suma);
        System.out.println("La media de todos ellos es: " + media);
    }
}
