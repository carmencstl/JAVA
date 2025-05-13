
package POO.Herencia.Ejercicio96;


public class Personaje {
    
    protected String nombre;
    protected int x;
    protected int y;
    protected double puntosVida;
    protected double puntosEscudo;
    protected double puntosAtaque;
    private int MAXVIDA;
    private int MAXESCUDO;
    private int MAXATAQUE;

    public Personaje(String nombre, int x, int y, int MAXVIDA, int MAXESCUDO, int MAXATAQUE) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.MAXVIDA = MAXVIDA;
        this.MAXESCUDO = MAXESCUDO;
        this.MAXATAQUE = MAXATAQUE;
    }
    
    public void desplazarse(int x, int y){
        
        if(x < 0){
            x = 0;
        }
        if (y < 0){
            y = 0;
        }
        this.x += x;
        this.y += y;
        
    }

    public void setMAXVIDA(int MAXVIDA) {
        this.MAXVIDA = MAXVIDA;
    }

    public void setMAXESCUDO(int MAXESCUDO) {
        this.MAXESCUDO = MAXESCUDO;
    }

    public void setMAXATAQUE(int MAXATAQUE) {
        this.MAXATAQUE = MAXATAQUE;
    }
    
  

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", x=" + x + ", y=" + y + ", puntosVida=" + puntosVida + ", puntosEscudo=" + puntosEscudo + ", puntosAtaque=" + puntosAtaque + ", MAXVIDA=" + MAXVIDA + ", MAXESCUDO=" + MAXESCUDO + ", MAXATAQUE=" + MAXATAQUE + '}';
    }
   
    
    
    
    
}
