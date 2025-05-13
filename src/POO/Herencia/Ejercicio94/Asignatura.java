
package POO.Herencia.Ejercicio94;

public class Asignatura {
    
    int codigo;
    int nHoras;

    public Asignatura(int codigo, int nHoras) {
        this.codigo = codigo;
        this.nHoras = nHoras;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Asignatura con el codigo: " + this.codigo + " de " + this.nHoras + " horas.";
        return res;
    }
    
    
}
