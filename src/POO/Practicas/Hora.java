package Practicas.examen;

public class Hora {

    //Atributos de la clase Hora
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        //Asigno y compruebo que los valores son correctos, si no, asigno 0 como valor por defecto
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

        if (this.hora < 0 || this.hora > 23) {
            this.hora = 0;
        }
        if (this.minutos < 0 || this.minutos > 59) {
            this.minutos = 0;
        }
        if (this.segundos < 0 || this.segundos > 59) {
            this.segundos = 0;
        }
    }

    //Constructor sin segundos, siendo su valor por defecto 0
    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = 0;

        if (this.hora < 0 || this.hora > 23) {
            this.hora = 0;
        }
        if (this.minutos < 0 || this.minutos > 59) {
            this.minutos = 0;
        }
    }

    //Incremento 1 a minutos y pongo segundos a 0, si llega a 60 minutos, sumo 1 a hora y pongo minutos a 0, si hora es mayor
    //que 23, la pongo tambien a 0
    public void incrementarMin() {

        this.minutos++;
        this.segundos = 0;
        if (this.minutos > 59) {
            this.hora++;
            this.minutos = 0;
            if (this.hora > 23) {
                this.hora = 0;
            }
        }
    }

    //Sumo 1 a segundos y en el caso de que minutos sea mayor de 59 llamo al metodo incrementarMin
    public void incrementarSeg() {
        this.segundos++;
        if (this.segundos > 59) {
            incrementarMin();
        }
    }

    //Constructor de copia
    public Hora(Hora acopiar) {
        this.hora = acopiar.getHora();
        this.minutos = acopiar.getMinutos();
        this.segundos = acopiar.getSegundos();
    }

    //Getters para el constructor de copia
    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    //Metodo toStringo que coloca un 0 en los casos de que solo haya un digito. 
    @Override
    public String toString() {
        String res = "";

        if (this.hora < 10) {
            res += "0";
        }
        res += this.hora + ":";
        if (this.minutos < 10) {
            res += "0";
        }
        res += this.minutos + ":";
        if (this.segundos < 10) {
            res += "0";
        }
        res += this.segundos;

        return res;
    }

}
