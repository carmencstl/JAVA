package POO.Herencia.Ejercicio95;

public class Motocicleta extends Bicicleta {

    protected double velocidad;
    protected int cilindrada;

    public Motocicleta(double velocidad, int cilindrada, String tipo, String color, int ruedas) {
        super(tipo, color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "velocidad=" + velocidad + ", cilindrada=" + cilindrada + '}';
    }
    
    
}
