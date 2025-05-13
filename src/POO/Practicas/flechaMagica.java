package Practicas.examen;

public class flechaMagica {

    //Atributos que va a tener la flecha
    private int longitud;
    private String elemento;

    public flechaMagica(int longitud, String elemento) {

        //Compruebo que la longitud de la flecha es adecuada, si no lo es, le asigno 15 cm por defecto.
        this.longitud = longitud;
        if (this.longitud < 15) {
            this.longitud = 15;
        }
        //Asigno el elemento de la flecha llamando al metodo cambiarElemento pasandole el elemento elegido por parametro.
        this.cambiarElemento(elemento);

    }

    //Constructor con longitud y elemento por defecto
    public flechaMagica() {

        this.longitud = 56;
        this.elemento = "fuego";
    }

    //Metodo para cambiar elemento.
    public void cambiarElemento(String elemento) {

        switch (elemento.toLowerCase()) {

            case "fuego":
                this.elemento = "fuego";
                break;
            case "electricidad":
                this.elemento = "electricidad";
                break;
            default:
                this.elemento = "hielo";

        }
    }

    @Override
    public String toString() {

        String res = "";
        res += "flecha de ";
        res += this.elemento + " ";
        res += this.longitud + " ctms de longitud";
        return res;
    }

}
