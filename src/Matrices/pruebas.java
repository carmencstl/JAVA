import java.util.Scanner;

public class pruebas
{

    private static final char[][] tablero = new char[10][10];
    private static int aleFila;
    private static int aleColumna; 
    private static int aleFzombie;
    private static int aleCzombie;
    private static int aleFmeta;
    private static int aleCmeta;
    private static int res;
    private static final Scanner entrada = new Scanner(System.in);
    private static int cont = 0;
    
    public static void main(String[] args) {

        rellenarTablero();
        mostrarTablero();

        do {
            mostrarMenu();
            res = entrada.nextInt();

            switch (res) {
                case 1:
                    if((aleFila - 1) == aleFzombie && aleColumna == aleCzombie){
                       hayZombie();
                    }
                    else{
                       arriba(); 
                    }   
                    break;
                case 2:
                    if((aleFila + 1) == aleFzombie && aleColumna == aleCzombie){
                        hayZombie();
                    }
                    else{
                        abajo();
                    }
                    break;
                case 3:
                    if(aleColumna - 1 == aleCzombie && aleFila == aleFzombie){
                        hayZombie();
                    }
                    else{
                       izquierda(); 
                    }
                    break;
                case 4:
                    if(aleColumna + 1 == aleCzombie && aleFila == aleFzombie){
                        hayZombie();
                    }
                    else{
                       derecha(); 
                    }
                    break;
            }
            
            if ((aleCzombie != tablero.length - 1) || (aleCzombie != 0 ) || (aleFzombie < tablero.length - 1) || (aleFzombie > 0) || (aleFzombie != aleFmeta ) || (aleCzombie != aleCmeta)) {
               zombie();
            }
            
            if (aleCzombie == aleColumna && aleFzombie == aleFila) {
                perder();
            }
            
            comprobarTablero();
            
            if (res != 5) {
                mostrarTablero();
            }
        } while (res != 5);
} 
    
 //FUNCIONES   
    
//Posicion inicial meta
        public static void posMeta(){
        aleFmeta = (int) (Math.random() * 10);
        aleCmeta = (int) (Math.random() * 10);
}
    
 //Posicion inicial zombie
    public static void posZombie(){
        aleFzombie = (int) (Math.random() * 10);
        aleCzombie = (int) (Math.random() * 10);
}
    
//Posicion inicial jugadir
    public static void posJugador(){
        aleFila = (int) (Math.random() * 10);
        aleColumna = (int) (Math.random() * 10);
}
    
    
//Rellenar tablero
    public static void rellenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '0';
            }
            if(aleFila == aleFzombie && aleColumna == aleCzombie){
                posZombie();
                posJugador();
                //posMeta();
            }
            else{
                tablero[aleFila][aleColumna] = 'A';
                tablero[aleFzombie][aleCzombie] = 'Z';
                //tablero[aleFmeta][aleCmeta] = 'M';
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
        if (aleFila > 0) {
            tablero[aleFila][aleColumna] = 'X';
            aleFila = aleFila - 1;
            tablero[aleFila][aleColumna] = 'A';
        } 
        else {
            System.out.println("No puedes moverte hacia arriba");
        }
    }
    
//Moverse abajo
    public static void abajo(){
        if (aleFila < tablero.length - 1) {
           tablero[aleFila][aleColumna] = 'X';
            aleFila = aleFila + 1;
            tablero[aleFila][aleColumna] = 'A';
        } else {
         System.out.println("No puedes moverte hacia abajo");
        }
    }

//Moverse izquierda
    public static void izquierda(){
        if (aleColumna != 0) {
            tablero[aleFila][aleColumna] = 'X';
            aleColumna = aleColumna - 1;
            tablero[aleFila][aleColumna] = 'A';
        } else {
            System.out.println("No puedes moverte hacia la izquierda");
        }
    }
 
//Moverse derecha
    public static void derecha(){
        if (aleColumna != tablero.length - 1) {
            tablero[aleFila][aleColumna] = 'X';
            aleColumna = aleColumna + 1;
            tablero[aleFila][aleColumna] = 'A';
        } 
        
        else {
            System.out.println("No puedes moverte hacia la derecha");
        } 
    }
    
//Moverse zombie
    public static void zombie(){
        tablero[aleFzombie][aleCzombie] = '0';
        aleFzombie = (int) (Math.random() * 10);
        aleCzombie = (int) (Math.random() * 10);
        tablero[aleFzombie][aleCzombie] = 'Z';
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

//Comprobar tablero
        public static void comprobarTablero(){
            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[i].length; j++){
                    if(tablero.equals('X')){
                        cont++;
                    }
                }
            }
            if(cont == 100){
                ganar();
            }
        }

    
}