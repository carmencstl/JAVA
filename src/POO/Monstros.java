package POO;

public class Monstros {

    String nombre;
    int esfuerzo = 10;
    int vidas = 7;
    int hambre = 3;
    boolean estado = true; //true - vivo false - muerto;

    public Monstros(String nombre) {

        this.nombre = nombre;

    }

    public void jugar() {

        
        if (this.estado) {
            System.out.println(this.nombre + " esta jugando.");
            this.esfuerzo -= 3;
            this.hambre -= 1;
            
            if(this.esfuerzo <= 0 || this.hambre <= 0){
            this.esfuerzo = 0;
            this.hambre = 0;
            }
            
        } else {
            System.out.println(this.nombre + " ha muerto, no puede jugar");
        }
        comprobarEstado();
    }

    public void comunicarse(String mensaje) {
        
        
        if (this.estado) {
            System.out.println(this.nombre + " dice: " + mensaje);
            this.esfuerzo -= 1;
        } else {
            System.out.println(this.nombre + " ha muerto, no puede comunicarse");
        }
        comprobarEstado();
    }

    public void comer(String comida) {
        
        
        if (this.estado) {
            String comidaFavorita = "hamburguesa";
            this.esfuerzo -= 2;

            if (comida.equals(comidaFavorita)) {
                this.hambre += 3;
            } else {
                this.hambre += 2;
            }

            if (this.hambre > 3) {
                this.hambre = 3;
            }
        } else {
            System.out.println(this.nombre + " ha muerto, no puede comer");
        }
        comprobarEstado();
        
    }
    

    public void dormir() {
        

        if (this.estado) {
            this.esfuerzo += 5;
            if (this.esfuerzo > 10) {
                this.esfuerzo = 10;
            }
        } else {
            System.out.println(this.nombre + " ha muerto, no puede dormir");
        }
        
        comprobarEstado();

    }

    public boolean comprobarEstado() {

        if (this.esfuerzo <= 0 || this.hambre <= 0) {
            this.vidas -= 1; 
            if (this.vidas <= 0) {
                this.estado = false;
            }
        }
        comprobarVida();
        return this.estado;
    }

    public void comprobarVida() {
        
        
        if (!this.estado) {
            this.hambre = -1;
            this.esfuerzo = -1;
            this.vidas = -1;
        }
    }
    
    @Override
    public String toString(){
        
        String res = "";
        
        res += "Nombre: " + this.nombre + "\n";
        res += "Hambre: " + this.hambre + "\n";
        res += "Esfuerzo: " + this.esfuerzo + "\n";
        res += "Vidas: " + this.vidas;
        
        return res;
    }

}
