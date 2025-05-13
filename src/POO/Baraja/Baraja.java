package POO.baraja;

public class Baraja {

    Carta mazo[][] = new Carta[4][12];
    Carta usadas[][] = new Carta[4][12];

    public Baraja() {

        for (int i = 0; i < this.mazo.length; i++) {
            for (int j = 0; j < this.mazo[i].length; j++) {
                this.mazo[i][j] = new Carta((j + 1), i);
            }
        }

    }

    public void mostrar() {

        for (int i = 0; i < this.mazo.length; i++) {
            for (int j = 0; j < this.mazo[i].length; j++) {
                System.out.print(this.mazo[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void barajar() {

        int nuevaFila;
        int nuevaColumna;

        for (int i = 0; i < this.mazo.length; i++) {
            for (int j = 0; j < this.mazo[i].length; j++) {

                nuevaFila = (int) (Math.random() * this.mazo.length);
                nuevaColumna = (int) (Math.random() * this.mazo[i].length);
                Carta temp = this.mazo[i][j];
                this.mazo[i][j] = this.mazo[nuevaFila][nuevaColumna];
                this.mazo[nuevaFila][nuevaColumna] = temp;
            }
        }
    }

    public int cartasDisponibles() {

        int disponibles = 0;

        for (int i = 0; i < this.mazo.length; i++) {
            for (int j = 0; j < this.mazo[i].length; j++) {
                if (this.mazo[i][j] != null) {
                    disponibles++;
                }
            }
        }
        return disponibles;
    }

    public void siguienteCarta() {
        boolean encontrado = false;

        for (int i = 0; i < this.mazo.length && !encontrado; i++) {
            for (int j = 0; j < this.mazo[i].length && !encontrado; j++) {
                if (this.mazo[i][j] != null) {
                    this.usadas[i][j] = this.mazo[i][j];
                    this.mazo[i][j] = null;
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No quedan cartas en el mazo");
        }

    }

    public int darCartas(int nCartas) {

        int i = 0;

        if (cartasDisponibles() < nCartas) {
            System.out.println("No quedan suficientes cartas");
        } else {
            while (i < nCartas) {
                siguienteCarta();
                i++;
            }
        }
        return nCartas;
    }

    public void cartasUsadas() {
//        
//        for (int i = 0; i < this.usadas.length; i++) {
//            for (int j = 0; j < this.usadas[i].length; j++) {
//                if (this.usadas[i][j] != null) {
//                    System.out.print(this.usadas[i][j] + " ");
//                }
//            }
//        }

        int i = 0;
        boolean vacia = false;

        while (i < this.usadas.length && !vacia) {
            int j = 0;
            while (j < this.usadas[i].length && !vacia) {
                if (this.usadas[i][j] == null) {
                    vacia = true;
                } else {
                    System.out.print(this.usadas[i][j] + " ");
                }
                j++;
            }
            i++;
        }
        if (this.usadas[0][0] == null) {
            System.out.println("No hay cartas usadas");
        }
    }

    public void reiniciar() {
//          
//        for (int i = 0; i < this.usadas.length; i++) {
//            for (int j = 0; j < this.usadas[i].length; j++) {  
//                if(this.usadas[i][j] != null){
//                    this.mazo[i][j] = this.usadas[i][j];
//                    this.usadas[i][j] = null;
//                }
//                
//            }
//            
//        }

        int i = 0;
        boolean vacia = false;

        while (i < this.usadas.length && !vacia) {
            int j = 0;
            while (j < this.usadas[i].length && !vacia) {
                if (this.usadas[i][j] == null) {
                    vacia = true;
                } else {
                    this.mazo[i][j] = this.usadas[i][j];
                    this.usadas[i][j] = null;
                }
                j++;
            }
            i++;
        }

    }
}
