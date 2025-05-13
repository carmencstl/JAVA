package POO.Herencia.Ejercicio94;

public class ProfesorUniversidad extends Profesor {

    boolean esInvestigador;
    int nHorasInvestiga;
    boolean estaInvestigando;

    public ProfesorUniversidad(String nombre, int nAsignaturas) {
        super(nombre, nAsignaturas);
        this.estaInvestigando = false;
        if (this.nHorasTotales < 8) {
            this.esInvestigador = false;
            this.nHorasInvestiga = 0;
        } else {
            this.esInvestigador = true;
        }
    }

    public void investigar() {

        if (this.esInvestigador) {
            if (this.imparte) {
                System.out.print(this.getNombre() + "esta dando clase y no puede investigar");
            } else {
                System.out.print(this.getNombre() + " esta investigando");
                this.estaInvestigando = true;
            }
        } else {
            System.out.print("No puede investigar");
        }
    }

    public void pararInvestigar() {

        if (this.estaInvestigando) {
            this.estaInvestigando = false;
        }
    }

    public void cogerAsignatura(Asignatura nueva) {

        int i = 0;
        boolean hueco = false;
        int asig = 0;

        if (this.nHorasTotales < 25) {
            while (i < this.asignaturas.length && !hueco) {
                if (this.asignaturas[i] == null) {
                    asig = i;
                    hueco = true;
                }
                i++;
            }
            if (hueco) {
                this.asignaturas[asig] = nueva;
                this.nHorasTotales += nueva.nHoras;
                this.asignaturasImpartidas++;
                comprobarHoras();
                System.out.print("Asignatura cogida");
            } else {
                System.out.print("No puede coger mas asignaturas");
            }

        } else {
            System.out.print("El profesor imparte mas de 25 horas.");
        }

    }
    
    public void abandonarAsignatura(){
        this.nHorasTotales -= this.asignaturas[this.asignaturas.length-1].nHoras;
        this.asignaturas[this.asignaturas.length-1] = null;
        comprobarHoras();
    }
    
    
    private void comprobarHoras(){
        if(this.nHorasTotales < 8){
            this.esInvestigador = false;
        }
        else{
            this.esInvestigador = true;
            this.nHorasInvestiga = 20;
        }
    }
    
    

    @Override
    public String toString() {
        String res = "";
        
        if(this.imparte){
            res += getNombre() + " esta dando clase";
        }
        else if(this.estaInvestigando){
            res += getNombre() + " esta investigando";
        }
        else{
             res += getNombre() + " no esta haciendo nada";
        }
        return res;
    }

}
