
package POO.Herencia.Ejercicio95;


public class Bicicleta extends Vehiculo{
    
    protected String tipo;

    public Bicicleta(String tipo, String color, int ruedas) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tipo=" + tipo + '}';
    }
    
    
}
