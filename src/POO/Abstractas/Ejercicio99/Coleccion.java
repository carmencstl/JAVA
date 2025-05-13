package POO.Abstractas.Ejercicio99;

public abstract class Coleccion {

    private int listaNumeros[];
    private int elementos;
    private final int tam = 10;

    public Coleccion() {
        this.listaNumeros = new int[this.tam];
    }

    public Coleccion(int tam) {

        if (tam < 0) {
            this.listaNumeros = new int[tam];
        } else {
            this.listaNumeros = new int[this.tam];
        }

    }

    public int getElementos() {
        return this.elementos;
    }

    public int getElementos(int pos) {

        if (pos < 0 || pos > this.listaNumeros.length) {
            return -1;
        } else {
            return this.listaNumeros[pos];
        }

    }

    public boolean sinElementos() {
        return this.elementos == 0;
    }

    public void aniadir(int elemento) {

        if (lleno()) {
            int nuevaLista[] = new int[this.listaNumeros.length * 2];

            for (int i = 0; i < this.listaNumeros.length; i++) {
                nuevaLista[i] = this.listaNumeros[i];
            }
            nuevaLista[this.listaNumeros.length] = elemento;

            this.listaNumeros = nuevaLista;
        } else {

            int i = 0;
            while (i < this.listaNumeros.length && this.listaNumeros[i] == 0) {
                i++;
            }
            this.listaNumeros[i] = elemento;
        }
    }

    private boolean lleno() {
        return this.listaNumeros[this.listaNumeros.length - 1] != 0;
    }

    public boolean contiene(int elemento) {

        for (int i = 0; i < this.listaNumeros.length; i++) {
            if (this.listaNumeros.length == elemento) {
                return true;
            }
        }
        return false;
    }
}
