
package POO;

import java.util.Scanner;


public class Videoconsolas {
    
    String marca;
    String modelo;
    double precio;
    double almacenamiento;
    String color;
    boolean tieneLectorBR;
    
    
    public Videoconsolas(String marca, String modelo, double precio, double almacenamiento, String color, boolean tieneLectorBR){
        
        boolean funciona = true;
        
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.color = color;
        this.tieneLectorBR = tieneLectorBR;
    }
    
    public void encenderConsola(){
        System.out.println("La consola " + this.modelo + " esta encendida");
    }
    
    public void cargarJuego(){
        System.out.println("Cargando juego...");
        try {
        Thread.sleep(2000);
        } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
            }        
        System.out.println("Juego iniciado!");
        
    }
    
    public void aumentarAlmacenamiento() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Cuanto almacenamiento para " + this.modelo + " quieres aumentar? ");
        System.out.println();
        System.out.println("0. 50GB");
        System.out.println("1. 100GB");
        System.out.println("2. 200GB");
        System.out.println("3. 500GB");
        System.out.println("4. 1TB");
        int nuevoAlmacenamiento[] = {50, 100, 200, 500, 1000};
        
        int res;
        do{
            System.out.print("Elige una opcion: ");
            res = entrada.nextInt();
        }while(res < 0 || res > 4);
        this.almacenamiento += nuevoAlmacenamiento[res];
        
        if(this.almacenamiento > 999){
            this.almacenamiento = this.almacenamiento / 1000;
        }
        
        String unidad = (this.almacenamiento % 1000 >= 1) ? "TB" : "GB";
        
        System.out.println("El almacenamiento se ha ampliado a " + this.almacenamiento + " " +  unidad);
        
    }
    
    public void apagarConsola() {
        System.out.println("Apagando consola...");
    }
    
    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Precio: " + this.precio);
         if(this.almacenamiento > 999){
            this.almacenamiento = this.almacenamiento / 1000;
        }
        String unidad =(this.almacenamiento >= 1 && this.almacenamiento <= 9) ? "TB" : "GB";
        
        System.out.println("Almacenamiento: " + (int)this.almacenamiento + unidad);
        System.out.println("Color: " + this.color);
        if(!this.tieneLectorBR){
        System.out.println("No tiene lector de Blue-Ray");
        }
        else{
            System.out.println("Si tiene lector de Blu-Ray");
        }
        System.out.println();
    }
}
