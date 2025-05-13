package POO.ruletaRusa;

public class Juego {

    private rusaRevolver revolver;
    private Jugador jugadores[];

    public Juego(rusaRevolver revolver, int nJugadores) {

        this.revolver = revolver;

        if (nJugadores <= this.revolver.getTamTambor()) {

            this.jugadores = new Jugador[nJugadores];

            for (int i = 0; i < nJugadores; i++) {
                this.jugadores[i] = new Jugador("Jugador " + i + 1, true);
            }
        }

    }

    public String ronda() {

        String res = "";
        boolean vivo;

        for (int i = 0; i < this.jugadores.length; i++) {

            vivo = this.jugadores[i].disparar(this.revolver);
            System.out.println(this.revolver.getPosicionBala());
            System.out.println(this.revolver.getPosicionActual());
            if (!vivo) {

                res += this.jugadores[i].getNombre() + " ha muerto." + "\n";
            } else {
                res += this.jugadores[i].getNombre() + " esta vivo." + "\n";
            }

        }
        if (finJuego()) {
            res += "Se acabó el juego";
        } else {
            res += "No ha muerto nadie";
        }

        return res;
    }

    public boolean finJuego() {

        for (int i = 0; i < this.jugadores.length; i++) {

            if (!this.jugadores[i].getEstado()) {
                return true;
            }
        }
        return false;
    }

}
