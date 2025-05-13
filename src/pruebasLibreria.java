
import java.util.Arrays;

public class pruebasLibreria {

    public static void main(String[] args) {
        int tablero [][] = new int [3][3];
        Recursos.rellenarMatriz(1, 9, tablero);
        Recursos.mostrarMatriz(tablero);
        System.out.println("El mayor es: " + Recursos.mayorMatriz(tablero));
        System.out.println("El menor es: " + Recursos.menorMatriz(tablero));
        System.out.println("La primera posicion del mayor es: " + Arrays.toString(Recursos.posMayorMatriz(tablero)));
        System.out.println("El mayor de la diagonal principal es: " + Recursos.mayorDiagonal(tablero));
        System.out.println("El menor de la diagonal principal es: " + Recursos.menorDiagonal(tablero));
    }

}
