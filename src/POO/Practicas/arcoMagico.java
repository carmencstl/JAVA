package Practicas.examen;

public class arcoMagico {

    //Atributos que va a tener el arco
    int longitud;
    int peso;
    int material; //1-daedra, 2-elfico 3-cristal

    //Array de tipo flechaMagica para guardar las flechas
    flechaMagica carcaj[];

    public arcoMagico(int material, int tam) {

        this.carcaj = new flechaMagica[tam];

        //Compruebo que el material es correcto, sino el asigno el tipo cristal por defecto
        this.material = material;

        if (this.material < 1 || this.material > 3) {
            this.material = 3;
        }

        //Asigno cada peso y longitud segun el material.
        switch (this.material) {
            case 1:
                this.peso = 530;
                this.longitud = 750;
                break;
            case 2:
                this.peso = 300;
                this.longitud = 900;
                break;
            case 3:
                this.peso = 100;
                this.longitud = 1100;
        }

        //Guardo en elemento lo que me devuelve el metodo asignarElemento, que sera el elemento que tendran todas las flechas
        String elemento = asignarElemento();

        //Relleno el carcaj asignando un valor aleatorio para la longitud a cada flecha
        for (int i = 0; i < this.carcaj.length; i++) {

            int longitudFlecha = (int) (Math.random() * (60 - 40 + 1) + 40);
            this.carcaj[i] = new flechaMagica(longitudFlecha, elemento);

        }

    }

    //Disparo una flecha, si encuentra una flecha, la dispara y la "borra" (pongo null) y 
    //para comprobar uso un booleano para indicar que se ha disparado una flecha y para saber si no hay flechas disponibless
    public void disparar() {

        int i = 0;
        boolean disparada = false;

        while (i < this.carcaj.length && !disparada) {
            if (this.carcaj[i] != null) {
                System.out.println("Se ha disparado una " + this.carcaj[i]);
                this.carcaj[i] = null;
                disparada = true;
            }
            i++;
        }
        if (!disparada) {
            System.out.println("No hay flechas para disparar");
        }
    }

    //Recargo el carcaj de flechas, igual que en el constructo la llamada al metodo asignarElemento
    //esta dentro del bucle para que cada flecha tenga un elemento aleatorio.
    public void recargar() {

        for (int i = 0; i < this.carcaj.length; i++) {
            String elemento = asignarElemento();
            int longitudFlecha = (int) (Math.random() * (60 - 40 + 1) + 40);
            this.carcaj[i] = new flechaMagica(longitudFlecha, elemento);

        }

    }
    
    //Metodo privado para elegir un elemento aleatorio
    private String asignarElemento(){
        String elemento = "";
            int ale = (int) (Math.random() * 3);

            switch (ale) {
                case 0:
                    elemento = "Fuego";
                    break;
                case 1:
                    elemento = "Hielo";
                    break;
                case 2:
                    elemento = "Electricidad";
                    break;
            }
            return  elemento;
    }

//    @Override
//    public String toString() {
//        String res = "";
//        
//        for (int i = 0; i < this.carcaj.length; i++) {
//            res += this.carcaj[i] + "\n";
//        }
//        
//        return res;
//    }
}
