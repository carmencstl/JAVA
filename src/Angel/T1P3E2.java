package Angel;

import java.util.Scanner;

//NO BORRES NI CAMBIES NADA de este codigo 
//Tan solo añade lo que creas conveniente
//Cualquier duda, pregunta al profesor
public class T1P3E2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0; //controla la opcion elegida por el usuario
        int valor; // Guardamos el valor para luego añadirlo al array bidimensional
        int matriz[][] = {{1, 2, 3, 4}, {4, 5, 6, 7}, {8, 9, 1, 2}, {3, 4, 5, 6}};//Inicializamos la matriz con los valores
        int posicion[] = new int[2];//Para guardar la posicion, X e Y
        
        do {
            System.out.println("Manejo de Matrices");
            System.out.println("------------------");
            System.out.println("1. Meter valor.");
            System.out.println("2. Mostrar cajón.");
            System.out.println("3. Imprimir Matriz.");
            System.out.println("4. Resetear Matriz.");
            System.out.println("5. Salir.");

            System.out.print("Opcion? >> ");
            opcion = teclado.nextInt();
            while ((opcion < 1) || (opcion > 5)) {
                System.out.print("Opcion Incorrecta!! Opcion? >> ");
                opcion = teclado.nextInt();
            }

            System.out.println(""); //añadido por estetica

            //Control de cada opcion del menu
            switch (opcion) {
                case 1: //opcion1 del menu
                    do {//Controlamos la fila que va a introducir el usuario
                        System.out.println("¿Posición en la fila?");
                        posicion[0] = teclado.nextInt();
                        if (posicion[0] < 0 || posicion[0] > 3) {
                            System.out.println("Esa fila no existe. Usa una entre 0 y 3.");
                        }
                    } while (posicion[0] < 0 || posicion[0] > 3);

                    do {//Controlamos la columna que va a introducir el usuario
                        System.out.println("¿Posición en la columna?");
                        posicion[1] = teclado.nextInt();
                        if (posicion[1] < 0 || posicion[1] > 3) {
                            System.out.println("Esa columna no existe. Usa una entre 0 y 3.");
                        }
                    } while (posicion[1] < 0 || posicion[1] > 3);

                    do {//Controlamos el valor que va a introducir el usuario
                        System.out.println("¿Valor a introducir entre 1 y 9?");
                        valor = teclado.nextInt();
                        if (valor < 1 || valor > 9) {
                            System.out.println("Error. Introduce un valor correcto.");
                        }
                    } while (valor < 1 || valor > 9);
                    matriz[posicion[0]][posicion[1]] = valor;//Añadimos el valor a la matriz
                    System.out.println("");//Salto de linea
                    break;
                case 2: //Opcion 2 del menu
                    do {
                        System.out.println("¿Posición de la fila?");
                        posicion[0] = teclado.nextInt();
                        if (posicion[0] < 0 || posicion[0] > 3) {
                            System.out.println("Esa fila no existe. Usa una entre 0 y 3.");
                        }
                    } while (posicion[0] < 0 || posicion[0] > 3);

                    do {
                        System.out.println("¿Posición en la columna?");
                        posicion[1] = teclado.nextInt();
                        if (posicion[1] < 0 || posicion[1] > 3) {
                            System.out.println("Esa columna no existe. Usa una entre 0 y 3.");
                        }
                    } while (posicion[1] < 0 || posicion[1] > 3);
                    System.out.println("En la posición "+posicion[0]+","+posicion[1]+" hay un "+matriz[posicion[0]][posicion[1]]);
                    System.out.println("");//Salto de linea
                    break;
                case 3: //Opcion 3 del menu
                    for (int i = 0; i < matriz.length; i++) {//Mostramos la matriz separandola con comas
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (j == matriz.length-1) {
                                System.out.print("0"+matriz[i][j]);//Excepto en la última posición
                            }else System.out.print("0"+matriz[i][j]+",");
                        }
                        System.out.println("");//Salto de linea
                    }
                    System.out.println("");//Salto de linea
                    break;
                case 4: //opcion 4 del menu
                    
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {//La reseteamos con valores aleatorios entre 1 y 9
                            matriz[i][j] = (int)(Math.random()*9+1);
                        }
                    }
                    System.out.println("Array reseteada.");
                    break;
                case 5: //opcion 5 del menu
                    System.out.println("Gracias por su visita!!");
                    break;// Nos fuimos
            }

        } while (opcion != 5);

    }

}
