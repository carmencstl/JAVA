package Condicionales;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
        System.out.print("Introduce la cantidad a desglosar: ");
        int dinero = entrada.nextInt();
        int billetes;
        
       
     
       if(dinero > 0){
           
           System.out.println("El desglose obtenido es... ");
           
           if (dinero  >= 500){
             billetes = dinero / 500;
             dinero = dinero % 500;
           System.out.println(billetes + " billetes de 500.");
           }
           
           if (dinero >= 200){
            billetes = dinero / 200;
            dinero = dinero % 200;
           System.out.println(billetes + " billetes de 200.");
           }

           if (dinero >= 100){
           billetes = dinero / 100;
           dinero = dinero % 100;
           System.out.println(billetes + " billetes de 100.");
           }
           
           if (dinero >= 50){
           billetes = dinero / 50;
           dinero = dinero % 50;  
           System.out.println(billetes + " billetes de 50.");
           }
           
           if (dinero >= 20){
           billetes = dinero / 20;
           dinero = dinero % 20;
           System.out.println(billetes + " billetes de 20.");
           }
           
           if (dinero >= 10){
           billetes = dinero / 10;
           dinero = dinero % 10;
           System.out.println(billetes + " billetes de 10.");
           }
           
           if (dinero >= 5){
           billetes = dinero / 5;
           dinero = dinero % 5;
           System.out.println(billetes + " billetes de 5.");
           }
           
           if (dinero >= 2){
           billetes = dinero / 2;
           dinero = dinero % 2;
           System.out.println(billetes + " monedas de 2 euros.");
           }
           
           if (dinero >= 1){
           System.out.println(dinero + "  monedas de 1 euro.");
           }
         }
       else {
           System.out.println("La cantidad introducida no es valida.");
        }
       }       
    }   