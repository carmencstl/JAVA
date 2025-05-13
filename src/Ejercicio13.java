import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double alturaRectangulo, anchuraRectangulo, ladoBaldosa, precioBaldosa, totalBaldosas, totalPresupuesto, areaRectangulo, areaCuadrado;
    
        System.out.print("Introduce la altura del rectangulo: ");
        alturaRectangulo = input.nextDouble();
        System.out.print("Introduce la anchura del rectangulo: ");
        anchuraRectangulo = input.nextDouble();
        System.out.print("Introduce el lado de la baldosa: ");
        ladoBaldosa = input.nextDouble();
        System.out.print("Introduce el precio de las baldosas: ");
        precioBaldosa = input.nextDouble();
        
        areaRectangulo = anchuraRectangulo * alturaRectangulo;
        areaCuadrado = Math.pow(ladoBaldosa, 2);
        totalBaldosas = (int)(Math.ceil(areaRectangulo / areaCuadrado));
        totalPresupuesto = totalBaldosas * precioBaldosa;
        
        System.out.println("Se necesitaran: " + totalBaldosas + " baldosas");
        System.out.println("El total de tu presupuesto es: " + totalPresupuesto);
    }
}
