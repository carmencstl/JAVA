package POO.Figuras;

public class Punto {

    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void trasladar(int x, int y) {

        this.x += x;
        this.y += y;

    }

    public String toString() {

        String res = "";
        res += "Punto " + "x= " + this.x + "y punto y= " + this.y;
        return res;
    }

}
