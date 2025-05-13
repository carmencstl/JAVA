package POO.balaRevolver;

public class Bala {

    private int calibre;
    private int longitud;

    public Bala(int calibre, int longitud) {

        this.calibre = calibre;
        this.longitud = longitud;

    }

    public Bala() {

        this.calibre = 9;
        this.longitud = 40;
    }

    @Override
    public String toString() {

        String res = "";
        res += " calibre " + this.calibre + " mm y longitud " + this.longitud + " mm. \n";
        return res;
    }

    public int getCalibre() {
        return this.calibre;
    }

    public int getLongitud() {
        return this.longitud;
    }
    
    

}
