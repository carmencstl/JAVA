package POO.balaRevolver;

public class Revolver {

    //Son las caracteristicas de las revolver
    private String marca;
    private String modelo;
    private Bala tambor[]; // guarda las balas. 
    private int martillo = 0;

    //METODO CONSTRUCTOR, CREA LOS OBJETOS RECIBIENDO LA INFORMACION SOBRE EL OBJETO. 
    public Revolver(String marca, String modelo, int tamTambor) {

        this.marca = marca;
        this.modelo = modelo;
        this.tambor = new Bala[tamTambor];

        for (int i = 0; i < tamTambor; i++) {
            int calibre = (int)(Math.random() * (20 - 5 + 1) + 5);
            int longitud = (int)(Math.random() * (70 - 20 + 1) + 20);
            this.tambor[i] = new Bala(calibre, longitud);
        }
    }
    

    public String disparar() {

        String res = "";

        if (this.tambor[this.martillo] != null) {
            res += this.tambor[this.martillo];
            this.tambor[this.martillo] = null;

        } else {
            res += "No hay bala en este hueco";
        }
        this.martillo++;
        comprobarMartillo();
        return res;
    }

    private void comprobarMartillo() {

        if (this.martillo == this.tambor.length) {
            this.martillo = 0;
        }
    }

    @Override
    public String toString() {

        String res = "";
        res += "Revolver con marca " + this.marca + ", modelo " + this.modelo + ", tamaño de tambor de " + this.tambor.length + " balas" + "\n";

        for (int i = 0; i < this.tambor.length; i++) {
            res += "Bala n " + (i + 1);
            if (this.tambor[i] != null) {
                res += this.tambor[i];
            } else {
                res += " No hay bala \n";
            }
        }
        return res;

    }
}
