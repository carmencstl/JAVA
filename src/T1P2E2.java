
import java.util.Scanner;

//Realiza un programa que haga lo siguiente:
// a) (0,75 puntos) pida un número entero, positivo por teclado al usuario (debe con
//trolar que eso suceda correctamente y, en caso de que no suceda así, volver
// a pedir el número). A continuación cree un array llamado ‘original’ con tamaño
// indicado por ese numero.
// b) (0,75 puntos) Inicializa ese array con números aleatorios enteros entre el 1 y el
// 20 e imprime todas sus celdas en horizontal separadas por un espacio.
// c) (0,5 puntos)  Pide al usuario un número enteros entre -5 y 5. Se debe controlar
// que eso suceda correctamente y, en caso de que no suceda así, mostrar un
// mensaje de error (ver ejemplo) y volver a pedir el número.
// d) (1 punto)  Multiplica ese numero por todos los elementos del array ‘original’ y
// muestra la suma de todos los elementos del array ‘original’ tras ser multiplica
//dos. Nota: Los valores del array ‘original’ no deben cambiar

public class T1P2E2 {

    public static void main(String[] args) {
        
        //VARIABLES QUE VOY A UTILIZAR
        Scanner entrada = new Scanner(System.in);
        int tam;
        int num;
        int suma = 0;
        
        //DO WHILE PARA CONTROLAR QUE EL NUMERO QUE INTRODUCE ES MAYOR A 0
        do{
            System.out.print("Introduce un numero positivo: ");
            tam = entrada.nextInt();
                if(tam <= 0){
                    System.out.println("ERROR. Necesito un numero mayor que 0.");
                }
        }while(tam <= 0);
         
        //CREO EL ARRAY DE TAMAÑO EL NUMERO QUE ME HA INTRODUCIDO EL USUARIO
        int original [] = new int [tam];
        System.out.println("Se ha creado el siguiente array");
        
        //LO RELLENO DE NUMEROS DEL 1 AL 20 Y LO MUESTRO
        for(int i = 0; i < original.length; i++){
            original[i] = (int)((Math.random() * 20) + 1);
            System.out.print(original[i] + " ");
        }
        System.out.println();
        
        //LE PIDO AL USUARIO UN NUMERO DEL -5 AL 5
        do{
            System.out.print("Introduce un numero entre -5 y 5: ");
            num = entrada.nextInt();
                if(num < -5 || num > 5 ){
                    System.out.print("ERROR. Necesito valores entre -5 y 5: ");
                    num = entrada.nextInt();
                }
        }while(num < -5 || num > 5);        
        
        // CREO UN ARRAY AUXILIAR
        int aux [] = new int [tam];
        
        //MULTIPLICO LOS VALORES DE ORIGINAL POR EL NUMERO QUE ME HA DADO EL USUARIO Y LO GUARDO EN AUX PARA NO CAMBIAR ORIGINAL
        for(int i = 0; i < original.length; i++){
            aux[i] = original[i] * num;
            //HAGO LA SUMA TOTAL
            suma = suma + aux[i];
        }
        //MUESTRO LA SUMA TOTAL
        System.out.println("La suma total de todo el array multiplicado por " + num + " es " + suma);
    }

}
