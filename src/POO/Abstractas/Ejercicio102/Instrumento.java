package POO.Abstractas.Ejercicio102;

public abstract class Instrumento {

    String marca;
    String fecha;
    Partitura partitura;
    boolean sonando;
    boolean roto;

    public Instrumento(String marca, String fecha, Partitura partitura) {
        this.marca = marca;
        this.fecha = fecha;
        this.partitura = partitura;
        this.sonando = false;
        this.roto = false;
    }

    public Instrumento(String marca, String fecha) {
        this.marca = marca;
        this.fecha = fecha;
        this.partitura = new Partitura("Desconocido", "Desconocido");
        this.sonando = false;
        this.roto = false;

        int nNotas = (int) ((Math.random() * 100 - 10 + 1) + 10);

        for (int i = 0; i < nNotas; i++) {
            this.aniadirNota();
        }
    }

    public boolean aniadirNota() {
        int valor = (int) (Math.random() * 7);
        int duracion = (int) (Math.random() * 5 + 1);
        return this.partitura.addNota(new Nota(duracion, valor));
    }

    public abstract String tocarPartitura();

    public void pararDeTocar() {
        this.sonando = false;
    }
}
