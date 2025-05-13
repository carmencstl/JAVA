package POO.Herencia.Ejercicio96;

public class Habilidad {

    String nombre;
    private double mana;
    int nivel;
    char tecla;
    private double dBasico;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.tecla = tecla;
        this.mana = calcularMana();
        this.dBasico = calcularBasico();

    }

    private void subirNivel() {
        this.nivel++;
        this.mana = calcularMana();
        this.dBasico = calcularBasico();

    }

    private double calcularBasico() {
        return ((int) ((Math.random() * 20 - 5 + 1) + 5) + (this.mana / 3));
    }

    private double calcularMana() {
        return ((int) ((Math.random() * 10) + 1) + (this.nivel / 2));
    }

    @Override
    public String toString() {
        return "Habilidad{" + "nombre=" + nombre + ", mana=" + mana + ", nivel=" + nivel + ", tecla=" + tecla + ", dBasico=" + dBasico + '}';
    }

}
