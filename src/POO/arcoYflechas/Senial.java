package POO.arcoYflechas;

public class Senial {

    private String nombre;
    double danio;
    private String tipos[] = {"Quinetica", "Fuego", "Viento", "Hipnotica"};
    private String tipoSenial;
    private int nivel;
    private double energia;

    public Senial(String nombre, int tipo) {

        this.nombre = nombre;
        this.nivel = 1;
        this.energia = (int) (((Math.random() * 15 + 5 - 1) + 5) * (this.nivel / 5.0));

        if (tipo < 0 || tipo > 3) {
            this.tipoSenial = this.tipos[3];
        } else {
            this.tipoSenial = this.tipos[tipo];
        }

        switch (tipo) {

            case 1:
                this.danio = ( (Math.random() * (100 - 50 + 1) + 50)) * (this.nivel / 10.0);
                break;
            case 2:
                this.danio = ( (Math.random() * (50 - 25 + 1) + 25)) * (this.nivel / 10.0);
                break;
            default:
                this.danio = 0;
                break;
        }
    }

    @Override
    public String toString() {

        String res = "";

        res += "Señal: " + this.nombre + "\n";
        res += "Tipo: ";
        switch (tipoSenial) {

            case "Fuego":
                res += "Fuego \n";
                break;
            case "Viento":
                res += "Viento \n";
                break;
            case "Hipnotica":
                res += "Hipnotica \n";
                break;
            default:
                res += "Quinetica \n";
                break;
        }
        res += "Nivel: " + this.nivel + "\n";
        res += "Danio: " + this.danio + " puntos \n";
        res += "Consume: " + this.energia + " puntos.";

        return res;
    }

    public double getEnergia() {
        return this.energia;
    }

    public String getNombre() {
        return this.nombre;
    }

}
