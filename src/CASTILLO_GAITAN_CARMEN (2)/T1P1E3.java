
import java.util.Scanner;

public class T1P1E3 {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que ha tomado para comer?(palmera, donut o pitufo): ");
        String res = teclado.next();
        
        
        double precioPalmera = 1.20;
        int precioDonut = 1;
        double precioMixto = 1.90;
        double precioTomate = 1.30;
        double precioCafe = 1.50;
        double precioZumo = 1.25;
        double precioTotal = 0;
        
        
        String tipoPitufo;

        switch (res) {

            case "palmera":
                System.out.println("Palmera: 1,20 euros");
                precioTotal += precioPalmera;
                break;
                
            case "donut":
                System.out.println("Donut: 1 euro");
                precioTotal += precioDonut;
                break;
                
            case "pitufo":

                System.out.println("Que tipo de pitufo? Mixto o tomate");
                tipoPitufo = teclado.next();

                if (tipoPitufo.equals("mixto")) {
                    System.out.println("Pitufo mixto: 1,90 euros");
                    precioTotal += precioMixto;
                } else {
                    System.out.println("Pitufo tomate: 1,30 euros");
                    precioTotal += precioTomate;
                }
                break;
        }
        
        System.out.println("Que ha tomado para beber?(zumo o cafe): ");
            
            res = teclado.next();
        switch (res){
            
            case "zumo":
                System.out.println("Zumo: 1,25 euros");
                precioTotal += precioZumo;
                break;
                
            case "cafe":
                System.out.println("Cafe: 1,50 euros");
                precioTotal += precioCafe;
        }
        
        System.out.println("Total desayuno: " + precioTotal);
        
    }
}
