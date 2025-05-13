import java.util.Scanner;

public class Zombie {
    
    static int tamanio = 5;
    static final char[][] tablero = new char[tamanio][tamanio];
    static int [] coordJugador = new int [2];
    static int [] coordZombie = new int [2];
    static int [] coordMeta = new int [2];
    static char jugador = 'A';
    static char zombie = 'Z';
    static char meta = 'M';
    static char casilla = '0';
    static int res;
    static int num;
    //static int nZombies = (tamanio * tamanio) % 25;
    static final Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {

        rellenarTablero();
        mostrarTablero();

        do {
            mostrarMenu();
            res = entrada.nextInt();

            switch (res) {
                case 1:
                    if((coordJugador[0] - 1) == coordZombie[0] && coordJugador[1] == coordZombie[1]){
                       hayZombie();
                    }
                    else{
                       arriba(); 
                    }   
                    break;
                case 2:
                    if((coordJugador[0] + 1) == coordZombie[0] && coordJugador[1] == coordZombie[1]){
                        hayZombie();
                    }
                    else{
                        abajo();
                    }
                    break;
                case 3:
                    if(coordJugador[1] - 1 == coordZombie[1] && coordJugador[0] == coordZombie[0]){
                        hayZombie();
                    }
                    else{
                       izquierda(); 
                    }
                    break;
                case 4:
                    if(coordJugador[1] + 1 == coordZombie[1] && coordJugador[0] == coordZombie[0]){
                        hayZombie();
                    }
                    else{
                       derecha(); 
                    }
                    break;
            }
            
            if ((coordZombie[1] != tablero.length - 1) || (coordZombie[1] != 0 ) || (coordZombie[0] < tablero.length - 1) || (coordZombie[0] > 0) || (coordZombie[0] != coordMeta[0] ) || (coordZombie[1] != coordMeta[1])) {
               zombie();
            }
            
          
            
            if(coordJugador[1] == coordMeta[1] && coordJugador[0] == coordMeta[0]){
                ganar();
            }
            
            if (res != 5) {
                mostrarTablero();
            }
        } while (res != 5);
        
       
    }
 //FUNCIONES   
    
//Posicion inicial meta
        public static void posMeta(){
        coordMeta[0] = (int) (Math.random() * tamanio);
        coordMeta[1] = (int) (Math.random() * tamanio);
}
    
 //Posicion inicial zombie
    public static void posZombie(){
        coordZombie[0] = (int)(Math.random()* tamanio);
        coordZombie[1] = (int)(Math.random()* tamanio);
    }
    
//Posicion inicial jugador
    public static void posJugador(){
        coordJugador[0] = (int) (Math.random() * tamanio);
        coordJugador[1] = (int) (Math.random() * tamanio);
}
    
    
//Rellenar tablero
    public static void rellenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '0';
            }
            if(coordJugador[0] == coordZombie[0] && coordJugador[1] == coordZombie[1]){
                posZombie();
                posJugador();
                posMeta();
            }
            else{
                tablero[coordJugador[0]][coordJugador[1]] = jugador;
                tablero[coordZombie[0]][coordZombie[1]] = zombie;
                tablero[coordMeta[0]][coordMeta[1]] = meta;
            }
            
        }
    }
    
    
//Mostrar tablero
    public static void mostrarTablero(){
          for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
              System.out.println();
        }
    }
    
//Mostrar menu
    public static void mostrarMenu(){
        System.out.println("Donde quieres mover A: ");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        System.out.println("5. Salir");
    }
    
//Moverse arriba 
    public static void arriba(){  
        if (coordJugador[0] > 0) {
            tablero[coordJugador[0]][coordJugador[1]] = casilla;
            coordJugador[0] = coordJugador[0] - 1;
            tablero[coordJugador[0]][coordJugador[1]] = jugador;
        } 
        else {
            System.out.println("No puedes moverte hacia arriba");
        }
    }
    
//Moverse abajo
    public static void abajo(){
        if (coordJugador[0] < tablero.length - 1) {
           tablero[coordJugador[0]][coordJugador[1]] = casilla;
            coordJugador[0] = coordJugador[0] + 1;
            tablero[coordJugador[0]][coordJugador[1]] = jugador;
        } else {
         System.out.println("No puedes moverte hacia abajo");
        }
    }

//Moverse izquierda
    public static void izquierda(){
        if (coordJugador[1] != 0) {
            tablero[coordJugador[0]][coordJugador[1]] = casilla;
            coordJugador[1] = coordJugador[1] - 1;
            tablero[coordJugador[0]][coordJugador[1]] = jugador;
        } else {
            System.out.println("No puedes moverte hacia la izquierda");
        }
    }
 
//Moverse derecha
    public static void derecha(){
        if (coordJugador[1] != tablero.length - 1) {
            tablero[coordJugador[0]][coordJugador[1]] = casilla;
            coordJugador[1] = coordJugador[1] + 1;
            tablero[coordJugador[0]][coordJugador[1]] = jugador;
        } 
        
        else {
            System.out.println("No puedes moverte hacia la derecha");
        } 
    }
    
    
//Moverse zombie
    public static void zombie(){
            num = (int)(Math.random()*1);
            
          if(num == 0){
              if(coordZombie[0] > coordJugador[0]){
                 tablero[coordZombie[0]][coordZombie[1]] = casilla;
                 coordZombie[0]--;
                 tablero[coordZombie[0]][coordZombie[1]] = zombie;
              }
              else if(coordZombie[0] < coordJugador[0]){
                  tablero[coordZombie[0]][coordZombie[1]] = casilla;
                  coordZombie[0]++;
                  tablero[coordZombie[0]][coordZombie[1]] = zombie;
              }
              else{
                  num = 1;
              }
            
          }   
          
          if(num == 1){
              if(coordZombie[1] > coordJugador[1]){
                 tablero[coordZombie[0]][coordZombie[1]]= casilla;
                 coordZombie[1]--;
                 tablero[coordZombie[0]][coordZombie[1]] = zombie;
              }
              else if(coordZombie[1] < coordJugador[1]){
                  tablero[coordZombie[0]][coordZombie[1]] = casilla;
                  coordZombie[1]++;
                  tablero[coordZombie[0]][coordZombie[1]] = zombie;
              }
                      
              else{
                  num = 0;
              }
              
                if (coordZombie[1] == coordJugador[1] && coordZombie[0] == coordJugador[0]) {
                perder();
            }
             
          }
    }

//Has perdido
    public static void perder(){
            System.out.println("Has perdido, el zombie te ha mordido");
            res = 5;
    }
    
//Has ganado{
    public static void ganar(){
        System.out.println("Has llegado a la meta!!");
        res = 5;
    }
    
//Hay un zombie!
    public static void hayZombie(){
        System.out.println("Ahi no puedes moverte, hay un zombie!!");
    }

}