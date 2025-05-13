//58.- Uno de los métodos más famosos para ordenar un array numérico es el algoritmo
//de ordenación por selección. Este algoritmo consiste en:
//• Se busca el elemento más pequeño del array se coloca en la primera posición.
//• Se hace lo mismo que en el punto anterior pero ahora se toma todo el array
//menos la primera posición (porque ya está ordenada).
//• Se repite el primer punto pero ahora solo se toma todo el array menos las dos
//primeras posiciones (porque ya están ordenadas).
//• Se repite el primer punto hasta que ordeno todos los elementos del array.

package Arrays;


public class Ejercicio58 {

    public static void main(String[] args) {
           int arr[] = {9,8,7,6,5,4,3,2,1};
           
           int menor = arr[0];
           int mayor = arr[0];
           
           for(int i = 0; i < arr.length; i++){
               if(menor > arr[i]){
                   menor = arr[i];                                                                                                            
               }
           }
           
    }
    
    
    
}
