//63.- Crea un programa que encuentre el elemento de mayor valor de una matriz y...
//a) ... muestre la posición de su primera aparición.
//b) ... muestre una lista con las posiciones de todas sus apariciones.
package Matrices;


public class Ejercicio63 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[3][3];
        int mayor = 0;
        int posFila = 0;
        int auxFila;
        int auxColumna;
        int posColumna = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()* 9 + 1);
                System.out.print(matriz[i][j] + " ");
                if(mayor < matriz[i][j]){
                    mayor = matriz[i][j];
                    auxFila = i;
                    posFila = auxFila;
                    auxColumna = j;
                    posColumna = auxColumna;
                }
               
            } System.out.println();
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println(posFila + " " + posColumna);
        

    }

}
