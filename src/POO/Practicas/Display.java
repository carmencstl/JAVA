package Practicas.examen;

public class Display {

    //Atributos de la clase display
    private String tipo;
    private int altura;
    private int anchura;
    private int radio;
    private Hora hora;

    public Display(String tipo) {

        this.tipo = tipo;

        //Compruebo que el tipo de display sea correcto, sino asigno digital por defecto
        if ((!this.tipo.toLowerCase().equals("digital")) && (!this.tipo.toLowerCase().equals("analogico"))) {
            this.tipo = "digital";
        }

        //inicializo los atributos de forma aleatoria segun el tipo de display
        switch (this.tipo.toLowerCase()) {
            case "digital":
                this.anchura = (int) (Math.random() * (10 - 3 + 1) + 3);
                this.altura = (int) (Math.random() * (this.anchura) + 1);
                this.radio = 0;

                break;
            case "analogico":
                this.anchura = 0;
                this.altura = 0;
                this.radio = (int) ((Math.random() * 5 - 2 + 1) + 2);
                break;
        }

        //Creo una hora aleatoria para mostrarla en el display
        int horas = (int) (Math.random() * 24);
        int minutos = (int) (Math.random() * 60);
        int segundos = (int) (Math.random() * 60);
        this.hora = new Hora(horas, minutos, segundos);

    }

    //Cambio a una hora nueva
    public void setHora(Hora nueva) {
        this.hora = nueva;
    }
    
    //Uso los metodos de la clase hora para el atributo Hora de la clase Display
    public void sumaMinutos() {
        this.hora.incrementarMin();
    }

    public void sumaSegundos() {
        this.hora.incrementarSeg();
    }

    
    @Override
    public String toString() {
        String res = "";
        res = "Display de tipo " + this.tipo + " que muestra las " + this.hora;
        return res;
    }

}
