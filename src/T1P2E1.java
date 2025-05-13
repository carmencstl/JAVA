
import java.util.Scanner;

// Crea un programa y realiza las siguientes acciones:
// a) (0,5 puntos) Pide al usuario un numero N mayor a 1 (si el usuario no mete un
// numero correcto, vuelve a pedirlo). Crea un array bidimensional llamada ma
//triz de tamaño NxN
// b) (0,25 puntos)  Rellena la matriz con valores aleatorios entre 3 y 15.
// c) (0,75 puntos) Muestra por pantalla el contenido de matriz respetando el número
// de filas y columnas. Es decir, todos los valores de una fila deben salir en hori
//zontal separados por espacios y debajo, la siguiente fila. Además, todos los
// valores deben ocupar 2 espacios. Si un valor ocupa solo un espacio, ponle un
// 0 delante.
// d) (0,5 puntos) Calcula la media de la diagonal principal y muestra ese valor por
// pantalla.
public class T1P2E1 {

    public static void main(String[] args) {
        
        //VARIABLES QUE VOY A UTILIZAR
        int tam;
        double suma = 0;
        double media;
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        
        //DO WHILE PARA CONTROLAR QUE EL NUMERO QUE INTRODUCE SEA MAYOR A 1
        do{
            System.out.print("Introduce un numero mayor a 1: ");
            tam = entrada.nextInt();
                if(tam <= 1){
                    System.out.println("ERROR!! El número debe ser mayor a 1");
                }
        }while(tam <= 1);
        
        //CREO LA MATRIZ DEL TAMAÑO QUE ME HA INTRODUCIDO EL USUSARIO
        int matriz[][] = new int [tam][tam];
        
        //LA RELENO DE NUMEROS ALEATORIOS DEL 3 AL 15 Y LA MUESTRO COLOCANDO UN CERO SI EL NUMERO ES DE UNA SOLA CIFRA Y CON ESPACIOS
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * (15 - 3 + 1) + 3);
                    if(matriz[i][j] < 10){
                        System.out.print("0" + matriz[i][j] + " ");
                    }
                    else{
                        System.out.print(matriz[i][j] + " ");
                    }
            }
            System.out.println();
        }
        
        //CALCULO LA SUMA TOTAL DE LA DIAGONAL
        for(int i = 0; i < matriz.length; i++){
            suma = suma + matriz[i][i];
            cont++;
        }
        
        //CALCULO LA MEDIA 
        media = suma / cont;
        System.out.println("La media es: " + media);
        
        
    }

}
