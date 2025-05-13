package POO.ruletaRusa;

import POO.balaRevolver.Bala;

public class rusaRevolver {

    private int posicionBala;
    private int posicionActual;
    private Bala tambor[];

    public rusaRevolver(int tamTambor) {

        this.tambor = new Bala[tamTambor];

        this.posicionBala = (int) (Math.random() * tamTambor);
        this.posicionActual = (int) (Math.random() * tamTambor);
        this.tambor[this.posicionBala] = new Bala();

    }

    public boolean disparar() {

        moverTambor();
        return this.tambor[this.posicionActual] != null;

    }

    public void moverTambor() {

        if (this.posicionActual == this.tambor.length-1) {
            this.posicionActual = 0;
        }
        else{
          this.posicionActual++;    
        }   
    }

    public int getTamTambor() {

        return this.tambor.length;
    }

    public int getPosicionBala() {
        return this.posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public Bala[] getTambor() {
        return this.tambor;
    }

    public void setTambor(int posicion, Bala nuevo) {
        this.tambor[posicion] = nuevo;
    }

    public int getPosicionActual() {
        return this.posicionActual;
    }
    
    


    @Override
    public String toString() {

        String res = "";

        return res += "La bala esta en el espacio n " + this.posicionBala + " y el martillo apunta a la n " + this.posicionActual;
    }

}
