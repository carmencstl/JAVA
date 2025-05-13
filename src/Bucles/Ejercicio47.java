//47. El juego de las bolas:
// Este es un juego donde el jugador compite contra la máquina. Para ello:
// • El usuario comienza introduciendo un numero natural positivo que representará
// la cantidad de bolas inicial que hay en una urna. 
//• A continuación, la maquina decide quien empieza de forma aleatoria.
// • En cada turno, el usuario o la máquina podrán retirar  1,2 ó 3 bolas (es decir,
// eligen restar 1, 2 o 3). 
//◦ Si es el jugador, se le preguntará cuantas bolas quiere sacar (hay que
// controlar que sean 1, 2 o 3).
// ◦ Si es la máquina, decidirá de forma aleatoria si saca 1,2 o 3 bolas.
// • Los turnos se repiten de forma alternativa hasta que uno de los dos retira la
// última bola. Quien haga eso, pierde.
// Mejora: haz que la máquina decida si quita 1, 2 o 3 bolas en su turno dependiendo de las
// bolas que haya en la urna (y no de forma aleatoria)

package Bucles;

import java.util.Scanner;   

public class Ejercicio47 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int cont = 0;
        int num2;
        
        do {
            System.out.print("Introduce un numero positivo: ");
            num = entrada.nextInt();
        } while (num < 1);
        
        int res = 0;
        int empieza = (int)(Math.random()*2+1);
        System.out.println(empieza == 1 ? "Empieza el usuario" : "Empieza la maquina");  
        
        while(num > 0 ){   
            if(empieza == 1){
                do {
                    System.out.println("Cuántas bolas quieres sacar? Introduce un numero del 1 al 3: ");
                    res = entrada.nextInt();
                }while (res < 1 || res > 3);  
             
                num = num - res;
                System.out.println("Quedan: " + num + " bolas");
                if(num > 0){
                    empieza = 2;
                }
                else{
                    System.out.println("Has perdido");
                }
        }
            else{
                   if(num == 1){
                       res = 1;
                   }
                   else if((num - 1) % 4 == 0){
                    res = (int)(Math.random()*3+1);                             
                   }
                   else{
                       num2 = num;
                       do{ 
                           num--;
                           cont++;
                       }while((num - 1) % 4 != 0);
                    num = num2;
                    res = cont;
                    
                }
                    num = num - res;
                    System.out.println("La maquina saca: " + res);
                    System.out.println("Quedan: " + num + " bolas");
                    if(num > 0){
                    empieza = 1;                       
                    } 
                    else{
                    System.out.println("La maquina pierde");
                    }   
               }
            }
        }
    }

