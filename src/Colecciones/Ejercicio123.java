//123.- Pide por teclado un número. Dicho número indica cuantos elementos se van a
//pedir a continuación. Almacena esas números en un ArrayList. A continuación:
//a) Muestra el contenido de la lista.
//b) Intercambia la primera posición con la última.
//c) Pide otra lista de números distinta como se indica al principio y añade todos sus
//elementos a la lista inicial. Nota: al final sólo debe existir un arrayList con todos los
//valores juntos.
//d) Calcula la suma de todos los elementos de la lista.
//e) Calcula la media aritmética de los elementos de la lista.
//f) Muestra todos los valores de la lista que sean menores a la media antes
//calculada
package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio123 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Indica el tamanio de la lista: ");
        int numero = teclado.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        int num2;

        do {
            System.out.print("Escribe un numero para aniadir a la lista: ");
            num2 = teclado.nextInt();
            lista.add(num2);
            numero--;
        } while (numero != 0);

        for (int num : lista) {
            System.out.println(num);

        }

        System.out.println();

        int ult = lista.get(lista.size() - 1);
        int prim = lista.get(0);
        lista.set(0, ult);
        lista.set(lista.size() - 1, prim);

        for (int num : lista) {
            System.out.println(num);

        }

        System.out.print("Indica el tamanio de la segunda lista: ");
        int numero2 = teclado.nextInt();
        ArrayList<Integer> lista2 = new ArrayList<>();

        int num22;

        do {
            System.out.print("Escribe un numero para aniadir a la lista: ");
            num22 = teclado.nextInt();
            lista2.add(num22);
            numero2--;
        } while (numero2 != 0);

        System.out.println();

        for (int i : lista2) {
            lista.add(i);
        }

        for (int num : lista) {
            System.out.println(num);

        }
        
        int suma = 0;
        
         for (int num : lista) {
            suma+= num;

        }
        int media = suma / lista.size();
        System.out.println(suma);
        System.out.println(media);

        
           for (int num : lista) {
            if(num < media){
                System.out.println(num);
            }

        }
    }

}
