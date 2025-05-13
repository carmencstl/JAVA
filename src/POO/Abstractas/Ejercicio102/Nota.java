package POO.Abstractas.Ejercicio102;

public class Nota {

    final String NOTAS[] = {"do", "re", "mi", "fa", "sol", "la", "si"};
    int duracion;
    String nota;

    public Nota(int duracion, int nota) {

        this.nota = this.NOTAS[nota];
        this.duracion = duracion;

    }

    @Override
    public String toString() {

        return "[" + this.nota + "," + this.duracion + "]";

    }

}
