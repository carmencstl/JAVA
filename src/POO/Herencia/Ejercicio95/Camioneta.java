
package POO.Herencia.Ejercicio95;


public class Camioneta extends Coche{
    
    protected double carga;

    public Camioneta(double carga, double velocidad, int cilindrada, String color, int ruedas) {
        super(velocidad, cilindrada, color, ruedas);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "carga=" + carga + '}';
    }
    
    
}
