package POO.cieloYestrellas;

public class Cielo {

    int filas;
    int columnas;
    Estrella cielo[][];

    public Cielo(int filas, int columnas) {

        this.filas = filas;
        this.columnas = columnas;
        this.cielo = new Estrella[this.filas][this.columnas];

    }

    public void ponerEstrellas(int nEstrellas) {

        int x;
        int y;

        for (int i = 0; i < nEstrellas; i++) {

            x = (int) (Math.random() * this.cielo.length);
            y = (int) (Math.random() * this.cielo[0].length);

            if (this.cielo[x][y] == null) {
                this.cielo[x][y] = new Estrella(x, y);
            } else {
                i--;
            }
        }
    }

    @Override
    public String toString() {
        
        String res = "";
        for(int i = 0; i < this.cielo.length; i++){
            for(int j = 0; j < this.cielo[i].length; j++){
                if(this.cielo[i][j] == null){
                    res += " ";
                }
                else
                    res += this.cielo[i][j] + " ";
            }
            res += "\n";      
        }
        return res;
    }
    
    

}
