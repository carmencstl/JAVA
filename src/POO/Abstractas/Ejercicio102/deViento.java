package POO.Abstractas.Ejercicio102;

public abstract class deViento extends Instrumento {

    boolean tipo; // metal true madera false

    public deViento(boolean tipo, String marca, String fecha, Partitura partitura) {
        super(marca, fecha, partitura);
        this.tipo = tipo;
    }

    public deViento(boolean tipo, String marca, String fecha) {
        super(marca, fecha);
        this.tipo = tipo;
    }

    public abstract void afinar();

}
