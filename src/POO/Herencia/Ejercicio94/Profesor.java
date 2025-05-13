package POO.Herencia.Ejercicio94;

public class Profesor {

    private String nombre;
    protected Asignatura asignaturas[];
    protected int nHorasTotales;
    protected boolean imparte; // T - da clase F - no da clase
    protected int asignaturasImpartidas;

    public Profesor(String nombre, int nAsignaturas) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[nAsignaturas];
        this.imparte = false;
        this.asignaturasImpartidas = (int) ((Math.random() * nAsignaturas) + 1);

        for (int i = 0; i < asignaturasImpartidas; i++) {
            int codigo = (int) ((Math.random() * 200 - 100 + 1) + 100);
            int horas = (int) ((Math.random() * 8 - 3 + 1) + 3);
            this.asignaturas[i] = new Asignatura(codigo, horas);
            this.nHorasTotales += horas;
        }
    }

    public void empezarClase() {

        if (!this.imparte) {
            int ale;
            do {
                ale = (int) (Math.random() * this.asignaturasImpartidas);
            } while (this.asignaturas[ale] == null);
            System.out.println(this.nombre + " esta dando clase de " + this.asignaturas[ale].codigo);
            this.imparte = true;
        } else {
            System.out.println("Ya esta dando clase");
        }
    }

    public void parar() {

        if (this.imparte) {
            System.out.println(this.nombre + " ha finalizado de dar clase");
            this.imparte = false;
        } else {
            System.out.println("No esta dando clase");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {

        String res = "";
        res += "Nombre: " + this.nombre + "\n";
        res += "Horas totales: " + this.nHorasTotales + "\n";
        res += "Numero de asignaturas impartidas: " + this.asignaturasImpartidas + "\n";
        res += "Asignaturas: \n";
        if (this.asignaturas[0] == null) {
            res += "No tiene asignaturas";
        } else {
            for (int i = 0; i < this.asignaturas.length; i++) {
                if (this.asignaturas[i] != null) {
                    res += "Codigo: " + this.asignaturas[i].codigo + " con " + this.asignaturas[i].nHoras + " horas \n";
                }
            }
        }

        res += this.imparte ? "Esta dando clase" : "No esta dando clase \n";

        return res;
    }

}
