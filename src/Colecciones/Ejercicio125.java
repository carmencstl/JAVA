//125.- Crea un programa que, haciendo uso de un ArrayList de números enteros,
//muestre por pantalla un menú con las siguientes opciones:
//1. Agregar: se le pide al usuario que indique un número entero por teclado y mete
//ese número dentro de la estructura.
//2. Buscar: se le pide al usuario un número entero e indica si ese número se
//encuentra en la estructura o no.
//3. Eliminar: se le pide al usuario un número entero y, si el elemento está en la
//estructura, lo elimina (y lo indica por pantalla). Si el elemento no está en la
//estructura, saca un mensaje indicándolo.
//4. Modificar: se le pide al usuario un número entero y, si el elemento está en la
//estructura, se solicita otro número para cambiarlo. Si el elemento no está en la
//estructura, saca un mensaje indicándolo.
//5. Insertar en posición: se le pide al usuario un número entero y una posición
//(entero mayor a 0). Mete el número en la posición indicada de la estructura.
//6. Mostrar: muestra el contenido de la estructura.
//7. Salir: Sale del programa y muestra un mensaje de despedida.
package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio125 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        int res;

        int num;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1.Agregar");
            System.out.println("2.Buscar");
            System.out.println("3.Eliminar");
            System.out.println("4.Modificar");
            System.out.println("5.Insertar");
            System.out.println("6.Mostrar");
            System.out.println("7.Salir");
            res = teclado.nextInt();

            switch (res) {
                case 1:
                    System.out.print("Indica el numero que quieres agregar: ");
                    num = teclado.nextInt();
                    lista.add(num);
                    break;

                case 2:
                    System.out.print("Indica el numero que quieres buscar: ");
                    num = teclado.nextInt();
                    String buscar = lista.contains(num) ? "Si esta en la lista" : "No esta en la lista";
                    System.out.println(buscar);
                    break;

                case 3:
                    System.out.print("Indica el numero que quieres eliminar: ");
                    num = teclado.nextInt();
                    boolean buscarN = lista.contains(num);
                    if (buscarN) {
                        lista.remove(lista.indexOf(num));
                        System.out.println("Se ha eliminado el numero");
                    } else {
                        System.out.println("El numero no se encuentra en la lista");
                    }
                break;
                
         
              
            }

        } while (!salir);

    }

}
