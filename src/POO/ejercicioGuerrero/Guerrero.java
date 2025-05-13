package POO.ejercicioGuerrero;

public class Guerrero {

    private String nombre;
    private int salud;
    private int ataque;
    private int escudo;
    private int saludActual;
    private boolean muerto;
    private Arma arma;
    private int nivel;
    private int experienciaActual;
    private int siguienteNivel;

    public Guerrero(String nombre, int salud, int ataque, int escudo, Arma arma) {

        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = this.salud;
        this.muerto = false;
        this.arma = arma;
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = (int) (Math.round(this.nivel * 10) + (this.nivel * 1.5));

    }

    public int atacar(Guerrero enemigo) {

        if (!muerto && !enemigo.getMuerto()) {

            int ataqueTotal;

            if (this.arma.getResistencia() > 0) {
                this.experienciaActual += 3;
                ataqueTotal = this.ataque + this.arma.getPoder();
            } else {
                this.experienciaActual += 5;
                ataqueTotal = this.ataque;
            }

            int danio = ataqueTotal - enemigo.getEscudo();
            
            enemigo.setSaludActual(enemigo.getSaludActual() - danio);
            this.arma.setResistencia(arma.getResistencia() - 1);
            
            comprobarEstado(enemigo);
            subidaNivel();

            return danio;

        }

        return 0;
    }

    public boolean subir() {

        return this.experienciaActual == this.siguienteNivel;

    }

    public void subidaNivel() {

        if (subir()) {
            this.nivel++;
            this.experienciaActual = 0;
            this.siguienteNivel = (int) (Math.round(this.nivel * 10) + (this.nivel * 1.5));
            this.ataque++;
            this.escudo++;
            this.salud += 10;
            this.saludActual += 10;
        }
    }

    public void mejorarArma(Arma arma) {

        if (this.arma.getNombre().equals(arma.getNombre())) {

            this.arma.subirNivel();

        }
    }

    public int getEscudo() {
        return this.escudo;
    }

    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public void setSaludActual(int saludActual) {
        this.saludActual = saludActual;
    }

    public int getSaludActual() {
        return this.saludActual;
    }

    public boolean getMuerto() {
        return this.muerto;
    }

    private void comprobarEstado(Guerrero enemigo) {

        if (enemigo.getSaludActual() <= 0) {
            enemigo.setMuerto(true);
        }
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", salud=" + salud + ", ataque=" + ataque + ", escudo=" + escudo + ", saludActual=" + saludActual + ", muerto=" + muerto + ", arma=" + arma + ", nivel=" + nivel + ", experienciaActual=" + experienciaActual + ", siguienteNivel=" + siguienteNivel + '}';
    }

    

}
