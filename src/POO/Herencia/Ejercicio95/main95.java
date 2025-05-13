
package POO.Herencia.Ejercicio95;

import java.util.Scanner;


public class main95 {

   
    public static void main(String[] args) {
       
        Coche polo = new Coche(120, 150, "Negro", 4);
        Camioneta fragoneta = new Camioneta(100, 120, 150, "Blanco", 4);
        Bicicleta bike = new Bicicleta ("Urbana", "Roja", 2);
        Motocicleta motomoto = new Motocicleta (90, 45, "Deportiva", "Rosa", 2);
        
        Vehiculo garaje[] = {polo, fragoneta, bike, motomoto};
//        
//        for(int i = 0; i < garaje.length; i++){
//            System.out.println(garaje[i]);
//        }

        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int ruedas = entrada.nextInt();
        int num = 0;
        
                
        for(int i = 0; i < garaje.length; i++){
            if(garaje[i].ruedas == ruedas){
                num++;
            }
        }
        
        System.out.print("Se han encontrado " + num + " vehiculos con " + ruedas + " ruedas.");
        
    }
    
    
    
}
