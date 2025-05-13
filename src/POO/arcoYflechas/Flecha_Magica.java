package POO.arcoYflechas;

public  class Flecha_Magica {

    private double longitud;
    private int elemento; //1 Fuego, 2 hielo, 3 electricidad

    public Flecha_Magica(double longitud, int elemento) {

        this.longitud = longitud;
        cambiarElemento(elemento);

    }

    public final void cambiarElemento(int elemento) {

        this.elemento = elemento;

        if (this.elemento < 1 || this.elemento > 4) {
            this.elemento = 1;
        }

    }

    public String toString() {

        String res = "";
        res += "flecha de";
        switch (this.elemento) {

            case 2:
                res += " hielo ";
                break;
            case 3:
                res += " electricidad ";
                break;
            default:
                res += " fuego ";
                break;

        }
        res += "de " + this.longitud + " ctms de longitud";
        return res;

    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    
    
    

}
