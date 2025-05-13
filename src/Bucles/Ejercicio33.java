// 33. Realizar un programa que calcule el resultado de elevar un número a otro. Para ello,
// leerá dos números enteros, la base y el exponente, y calculará el resultado, mostrándolo
// en pantalla. No se pueden utilizar las funciones que te calculen automáticamente el
// resultado como, por ejemplo, la función Math.pow


import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la base de la potencia: ");
        int base = entrada.nextInt();
        System.out.print("Introduce el exponente de la potencia: ");
        int exponente = entrada.nextInt();
        int potencia = 1;
        
//        int i = 1;            
//        while(i <= exponente){
//            potencia = potencia * base;
//            i++;
//        }
//        System.out.println(potencia);
        
        for(int i = 1; i<= exponente; i++){
            potencia = potencia * base;
        }
        System.out.println(base + " elevado a " + exponente + " es: " + potencia);       
    }
}
