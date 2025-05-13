package POO.arcoYflechas;

public final class Arco_Magico {

    double longitud;
    double peso;
    int material; //1 (daedra), 2 (élfico) y 3 (cristal).
    Flecha_Magica carcaj[];

    public Arco_Magico(int material, int tam) {

        this.material = material;
        this.carcaj = new Flecha_Magica[tam];

        switch (material) {

            case 2:
                this.longitud = 900;
                this.peso = 300;
                break;
            case 3:
                this.longitud = 1100;
                this.peso = 100;
                break;
            default:
                this.longitud = 750;
                this.peso = 530;
                break;
        }
        recargar();

    }

    public void disparar() {

        boolean disparada = false;
        for (int i = 0; i < this.carcaj.length && !disparada; i++) {
            if (this.carcaj[i] != null) {
                System.out.println("Se ha disparado una " + this.carcaj[i]);
                this.carcaj[i] = null;
                disparada = true;
            }
        }
        if (!disparada) {
            System.out.println("No hay flechas para disparar");
        }
    }

    public void recargar() {

        int elemento = (int) ((Math.random() * 3) + 1);

        for (int i = 0; i < this.carcaj.length; i++) {

            int longFlecha = (int) (Math.random() * (60 - 40 + 1) + 40);
            this.carcaj[i] = new Flecha_Magica(longFlecha, elemento);
        }

    }

}
