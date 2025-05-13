//65.- Se dice que una matriz M es simétrica perfecta si tiene el mismo número de filas y
//de columnas (MxM) y si todos sus elementos cumplen que el elemento de la posición [i]
//[j] es el mismo que el de la posición [j][i].
//Implementa un programa que analice una matriz (creala y ponle valores tú) e indique si
//es simétrica perfecta o no

package Matrices;

public class Ejercicio65 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        boolean perfecta = true;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 3);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        if(matriz.length != matriz[0].length){
            perfecta = false;
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] != matriz[j][i]){
                    perfecta = false;
                }
            }

        }
        
        if(perfecta == true){
            System.out.println("Es perfecta");
        }
        else{
            System.out.println("No es perfecta");
        }
 
        
        
        
        
        
    }

}
