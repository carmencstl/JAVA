

package Angel;


public class Laptop {
    
    String marca,modelo;
    
    int cantidadDeRam;
    
    double cantidadDeDiscoDuro;
    
    int capacidadBateria;
    
    double tamaño;
    
    String sistemaOperativo;
    
    boolean encendido;//False apagado, true encendido

    public Laptop(String marca, String modelo, int cantidadDeRam, double cantidadDeDiscoDuro, int capacidadBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadDeRam = cantidadDeRam;
        this.cantidadDeDiscoDuro = cantidadDeDiscoDuro;
        this.capacidadBateria = capacidadBateria;
        this.tamaño = 15.3;
        this.sistemaOperativo = "Windows 11";
        this.encendido = false;
    }//Declaramos los valores en el método constructor
    
    public void encenderse(){//Si no esta encendido lo encendemos
        if (!encendido) {
            System.out.println(this.marca);
            System.out.println(this.modelo);
            System.out.println(this.sistemaOperativo);
            encendido = true;
        }else 
            System.out.println("El ordenador ya esta encendido");
    }
    
    public void apagarse(){//Si no esta apagado lo apagamos
        if (encendido) {
            System.out.println("Tu sistema operativo "+this.sistemaOperativo+" se esta apagando.");
            encendido = false;
        }else System.out.println("El ordenador ya está apagado.");
    }
    
    public void aumentarRam(int cantidad){//Si la cantidad es correcta la añadimos
        if (cantidad>0) {
            this.cantidadDeRam += cantidad;
        }else System.out.println("No se ha podido aumentar la RAM del portátil.");
    }
}
