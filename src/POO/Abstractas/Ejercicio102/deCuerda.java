package POO.Abstractas.Ejercicio102;

public abstract class deCuerda extends Instrumento {

    int cuerdas;
    boolean tipo; //true pulsadas false percutidas

    public deCuerda(int cuerdas, boolean tipo, String marca, String fecha, Partitura partitura) {
        super(marca, fecha, partitura);
        this.cuerdas = cuerdas;
        this.tipo = tipo;
    }

    public deCuerda(int cuerdas, boolean tipo, String marca, String fecha) {
        super(marca, fecha);
        this.cuerdas = cuerdas;
        this.tipo = tipo;
    }

    public abstract void afinar();

}
