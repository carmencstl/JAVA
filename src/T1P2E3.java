//VERSION 2
import java.util.Scanner;


public class T1P2E3 {

    public static void main(String[] args) {
        
        //TODAS LAS VARIABLES QUE NECESITO
       Scanner entrada = new Scanner(System.in);
       char tablero [][] = new char [5][5];
       int cont = 0;
       int posBombaF = 0;
       int posBombaC = 0;
       int fila;
       int columna;
       boolean hayBomba = false; // SI ES FALSE NO HAY BOMBA SI ES TRUE HAY BOMBA
       int intentos = 0;
       
       //INICIALIZO LA MATRIZ CON O COMO 'VACIO'
        for(int i = 0; i < tablero.length; i++){
           for(int j = 0; j < tablero[i].length; j++){
               tablero[i][j] = 'O';
           }
        }
        
 
       //SACO DOS POSICIONES DE BOMBAS ALEATORIAMENTE Y LAS COLOCO COMO X
        while(cont < 2){
           posBombaF = (int)(Math.random() * 5);
           posBombaC = (int)(Math.random() * 5);
           tablero[posBombaF][posBombaC] = 'X';
           cont++;
        }
                            //MUESTRO EL TABLERO
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
               System.out.print(tablero[i][j] + " ");
            }
           System.out.println();
        }
        
      
       //EL DO WHILE GRANDE CONTROLA QUE SOLO HAYA 3 INTENTOS 
    do{  
         //DO WHILE PARA CONTROLAR QUE EL NUMERO DE FILA ES CORRECTO
        do{
           System.out.print("Intoduce el numero de fila: ");
           fila = entrada.nextInt();
        }while(fila < 0 || fila > tablero.length-1);
        
       //DO WHILE PARA CONTROLAR QUE EL NUMERO DE COLUMNA ES CORRECTO
        do{
           System.out.print("Intoduce el numero de columna: ");
           columna = entrada.nextInt();
        }while(columna < 0 || columna > tablero.length-1);
              
        //SI LA POSICION QUE ME HA DADO EL USARIO COINCIDE CON LA DE LA BOMBA HA PERDIDO
        if(tablero[fila][columna] == 'X'){
            hayBomba = true;
        }
       intentos++;
       
    }while(intentos < 3);
           
     //IF PARA SABER SI HA PERDIDO O HA GANADO
    if(hayBomba == true){
        System.out.println("Has perdido");
    }
    else{
        System.out.println("Has ganado");
    }
    
    //VUELVO A MOSTRAR EL TABLERO PARA VER DONDE ESTABAN LAS BOMBAS
    for(int i = 0; i < tablero.length; i++){
        for(int j = 0; j < tablero[i].length; j++){
            System.out.print(tablero[i][j] + " ");
        }
        System.out.println();
    }

}
   
}
