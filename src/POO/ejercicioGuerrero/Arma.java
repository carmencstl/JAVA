
package POO.ejercicioGuerrero;


public class Arma {
    
    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;

    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }
    
    public void subirNivel(){
        
        this.nivel += 1;
        this.poder += 1;
        this.resistencia += 2;
        
    }
    

    public int getPoder() {
        return this.poder;
    }

    public int getResistencia() {
        return this.resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", resistencia=" + resistencia + ", poder=" + poder + ", nivel=" + nivel + '}';
    }
    
    

}
