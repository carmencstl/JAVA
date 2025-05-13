import java.util.Scanner;


public class bucleExamen {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pido un numero al usuario
        System.out.print("Introduce un numero positivo (negativo para salir): ");
        // lo guardo en num
        int num = entrada.nextInt();
        //defino las variables que necesito
        int suma = 0;
        int i = 0;
        int media;
       
        //abro un bucle que solo entre si el numero es positivo
        while(num > 0){
            //voy calculando la suma primero
            suma = suma + num;
            //vuelvo a pedir un numero 
            System.out.print("Introduce un numero positivo (negativo para salir): ");
            num = entrada.nextInt();
            //variable que va sumando uno para ir controlando el numero de numeros que introduzco
            i++;
        }
        //cuando acabo calculo la media fuera del bucle e imprimo los resultados
        media = suma / i;
        System.out.println("Numeros introducidos: " + i);
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);

    }

}
