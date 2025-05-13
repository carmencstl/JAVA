
package POO.Herencia.Ejercicio95;


public class Coche extends Vehiculo{
    
    protected double velocidad;
    protected int cilindrada; 

    public Coche(double velocidad, int cilindrada, String color, int ruedas) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Coche{" + "velocidad=" + velocidad + ", cilindrada=" + cilindrada + '}';
    }
    
    
    
}
