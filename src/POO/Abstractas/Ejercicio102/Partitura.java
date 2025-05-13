package POO.Abstractas.Ejercicio102;

public class Partitura {

    String nombre;
    String autor;
    Nota notas[] = new Nota[100];

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public int numNotas() {

        int i = 0;
        while (i < this.notas.length && this.notas[i] != null) {
            i++;
        }
        return i;
    }

    public boolean addNota(Nota nueva) {

        int indice = this.numNotas();

        if (indice < this.notas.length) {
            this.notas[indice] = nueva;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        int i = 0;
        String res = "";
        res += this.nombre + " de " + this.autor + "\n";

        while (i < this.notas.length && this.notas[i] != null) {
            res += this.notas[i] + " ";
            i++;  
            if (i % 10 == 0) {
                res += '\n';
            }
        }
        return res;

    }

}
