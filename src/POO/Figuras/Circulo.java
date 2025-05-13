package POO.Figuras;

public class Circulo {

    int radio;
    Punto centro;

    public Circulo(int radio, Punto punto) {

        this.radio = radio;
        this.centro = punto;

    }

    public double area() {

        return (Math.PI * (Math.pow(this.radio, 2)));
    }

    public double perimetro() {

        return 2 * Math.PI * this.radio;

    }

    public void trasladar(int x, int y) {

        this.centro.trasladar(x, y);

    }

    @Override
    public String toString() {
        
        return "Circulo{" + "radio=" + this.radio + ", centro=" + this.centro + '}';
    }

}
