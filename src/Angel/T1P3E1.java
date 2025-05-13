package Angel;

import java.util.Scanner;

public class T1P3E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño; //Tamaño de la matriz introducido por el usuario
        double media=0; //Media de la diagonal
        System.out.println("APARTADO A");
        do {//Corregimos que introduzca un valor valido
            System.out.print("Introduce un valor mayor a 1:");
            tamaño = teclado.nextInt();
            
            if (tamaño <= 1) {
                System.out.println("ERROR!! El número debe ser mayor a 1");
            }
        } while (tamaño <= 1);
        int matriz[][] = new int[tamaño][tamaño];
        
        for (int i = 0; i < matriz.length; i++) {//Apartado B
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*13+3);//Con el mathRandom los creamos.
            }
        }
        
        System.out.println("\nAPARTADO C");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]<10) {//Mostramos la matriz
                    System.out.print("0"+matriz[i][j]+" ");//Si el numero es menor de 9 le ponemos un 0
                }else System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nAPARTADO D");
        for (int i = 0; i < matriz.length; i++) {
            media += matriz[i][i];//Le sumamos a media los valores de la diagonal
        }
        System.out.println("La media de la diagonal es: "+(media/matriz.length));
        //Lo dividimos por el tamaño de la matriz
    }

}
