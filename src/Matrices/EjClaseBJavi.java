
package matrices;

import java.util.Scanner;

/*
Se coloca a A en una posicion aleatoria del tablero
Se le pregunta al usuario donde quiere mover a A 
1 - arriba
2 - abajo
3 - izquierda
4 - derecha
Mueve a A en esa direccion (si no se sale de la matriz)


Pon en el tablero un zombie en una posicion aleatoria (diferente de A)
Cada vez que se mueva A se mueve el zombie aleatoriamente (arriba, abajo, izquierda, derecha) sin salirse del tablero
*/
public class EjClaseBJavi {

    // Definimos las variables que vamos a necesitar
    public static void main(String[] args) {
    char[][] tablero = new char[4][4];
    int numA = (int)(Math.random()*(tablero.length));
    int numB = (int)(Math.random()*(tablero.length));
    int numX = (int)(Math.random()*(tablero.length));
    int numY = (int)(Math.random()*(tablero.length));
    int res = 1;
    int zom =1;
    Scanner teclado = new Scanner(System.in);
    
    // Rellenamos la matriz de C = casilla 
    // Y una casilla con A del jugador y otra con Z del zombie
    for(int i=0; i<tablero.length;i++){
        for(int j=0;j<tablero[i].length;j++){
            if(i==numA && j == numB){
                tablero[i][j] = 'A';
            }else if(i==numX && j==numY){
                tablero[i][j] = 'Z';
            }else{
                tablero[i][j] = 'C';
            }
        }
    }
    // Mostramos en pantalla el tablero
    for(int i=0; i<tablero.length;i++){
        for(int j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]+" ");
                
        }
        System.out.println();
    }
    // Seguimos jugando a no ser que el usuario decida salir del juego con un 0
    while(res>0 && res<4){
        // Mostramos en pantalla el tablero
        for(int i=0; i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]+" ");
                
            }
            System.out.println();
        }
        // Mostramos el menu del juego
        System.out.println("Elige donde quieres mover a A: ");
        System.out.println("0 - salir del juego");
        System.out.println("1 - arriba");
        System.out.println("2 - abajo");
        System.out.println("3 - izquierda");
        System.out.println("4 - derecha");
        
        // Obligamos al usuario a realizar un movimiento posible (que no salga del tablero)
        do{
            System.out.print("Introduce hacia donde quieres mover a A: ");
            res =teclado.nextInt();
            if(res==1 && numA == 0){
                System.out.println("No puedes moverte hacia arriba, fin del tablero");
                res=-1;
            }else if(res == 2 && numA == tablero.length-1){
                System.out.println("No puedes moverte hacia abajo, fin del tablero");
                res=-1;
            }else if(res == 3 && numB == 0){
                System.out.println("No puedes moverte hacia la izquierda, fin del tablero");
                res=-1;
            }else if(res==4 && numB == tablero.length-1){
                System.out.println("No puedes moverte hacia la derecha, fin del tablero");
                res=-1;
            }
            
        }while(res<0 || res >4);
        // Si el usuario responde con 0 no ejecutamos mas codigo pues quiere salir
        if(res!=0){
            // Movemos al zombie de forma aleatoria
            zom = (int)(Math.random()*4+1);
            // Aseguramos que el zombie no se salga del tablero
            if(zom==1 && numX == 0){
                zom = (int)(Math.random()*3+2);
            }else if(zom == 2 && numX == tablero.length-1){
                do{
                    zom = (int)(Math.random()*4+1);
                }while(zom==2);
            }else if(zom == 3 && numY == 0){
                do{
                    zom = (int)(Math.random()*4+1);
                }while(zom==3);
            }else if(zom==4 && numY == tablero.length-1){
                zom = (int)(Math.random()*3+1);
            }
            // Realizamos el movimiento del jugador
            switch (res) {
                case 0:
                    System.out.println("Has salido del juego");
                    break;
                case 1:
                    // Cambiamos el valor de la casilla a la que se mueve por la que tenia antes
                    tablero[numA][numB] = 'C';
                    numA--;
                    tablero[numA][numB] = 'A';
                    break;
                case 2:
                    tablero[numA][numB] = 'C';
                    numA++;
                    tablero[numA][numB] = 'A';
                    break;
                case 3:
                    tablero[numA][numB] = 'C';
                    numB--;
                    tablero[numA][numB] = 'A';
                    break;
                case 4:
                    tablero[numA][numB] = 'C';
                    numB++;
                    tablero[numA][numB] = 'A';
                    break;
            } 
            // Realizamos el movimiento del zombie
            switch (zom) {
                case 1:
                    tablero[numX][numY] = 'C';
                    numX--;
                    tablero[numX][numY] = 'Z';
                    System.out.println("El zombie se mueve hacia arriba");
                    break;
                case 2:
                    tablero[numX][numY] = 'C';
                    numX++;
                    tablero[numX][numY] = 'Z';
                    System.out.println("El zombie se mueve hacia abajo");
                    break;
                case 3:
                    tablero[numX][numY] = 'C';
                    numY--;
                    tablero[numX][numY] = 'Z';
                    System.out.println("El zombie se mueve hacia la izquierda");
                    break;
                case 4:
                    tablero[numX][numY] = 'C';
                    numY++;
                    tablero[numX][numY] = 'Z';
                    System.out.println("El zombie se mueve hacia la derecha");
                    break;
            }
            // En caso de que el jugador y el zombie coincidan en la misma casilla pierde el usuario
            if(numA == numX && numB == numY){
                System.out.println("El zombie te ha pillado, has perdido");
                res=-1;
            }
        }

        
    }
    
     
     
     
     
     
    }

}
