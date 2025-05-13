//1. Dada una lista/vector/array con 80 celdas y en cada celda un número aleatorio entre 1
//y 100, se desea saber cuáles son los valores máximo y mínimo del array y la posición de
//la última aparición de cada uno. Ejemplo:
//LISTA: [1, 4, 28, 48, 54, 100, 28, 19, 13, 31, 49, 13, 88, 47,
//93, 78, 85, 1, 64, 20, 84, 42, 69, 63, 37, 93, 29, 36, 44, 30,
//71, 76, 58, 4, 76, 95, 4, 10, 40, 56, 95, 5, 47, 76, 27, 64, 3,
//98, 17, 44, 65, 55, 32, 82, 6, 95, 71, 46, 8, 83, 88, 8, 25, 79,
//34, 4, 10, 51, 31, 31, 63, 48, 100, 36, 1, 65, 100, 43, 89, 24]
//Valor máximo: 100 Posición: 76
//Valor mínimo: 1 Posición: 74
//Nota: el array tiene que crearse al comienzo del programa y debe ser distinto con cada
//ejecución.
package Avanzados;

public class Ej1 {

    public static void main(String[] args) {

        int array[] = new int[80];
        int mayor = array[0];
        int pMayor = 0;
        int pMenor = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }

        int menor = array[0];
        
        for (int i = 0; i < array.length; i++) {

            if (mayor <= array[i]) {
                mayor = array[i];
                pMayor = i;
            } else if (menor >= array[i]) {
                menor = array[i];
                pMenor = i;
            }
        }

        System.out.println("Valor maximo: " + mayor);
        System.out.println("Posicion: " + pMayor);
        System.out.println("Valor minimo: " + menor);
        System.out.println("Posicion: " + pMenor);

    }

}
