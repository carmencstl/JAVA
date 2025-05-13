
package POO.ruletaRusa;


public class Jugador {
    
    private String nombre;
    private boolean estado; //true vivo false muerto
    
    public Jugador(String nombre, boolean estado){
        
        this.nombre = nombre;
        this.estado = true;
    }

    public boolean disparar(rusaRevolver pistola){
        
        if(pistola.disparar()){
            this.estado = false;
            pistola.setTambor(pistola.getPosicionBala(), null);
        }  
        return this.estado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean getEstado() {
        return this.estado;
    }
    
    
}
