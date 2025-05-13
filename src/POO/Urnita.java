package POO;
//El objetivo de este ejercicio es crear la clase Urna cuyos objetos pueden contener
//bolas blancas y bolas negras y, además, nos va a permitir realizar operaciones básicas
//sobre ellas. Posteriormente crearemos un test para ver si la clase funciona
//correctamente.
//• La clase tendrá un par de variables de instancia privadas en las que se
//almacenará el número de bolas de cada color.
//• También tendrá un constructor que permita crear instancias de la clase con un
//número inicial de bolas blancas y negras pasadas como parámetros.
//• Además incluirá métodos para:
//◦ Consultar el número total de bolas.
//◦ Extraer una bola y saber su color. El color vendrá dado simplemente por un
//carácter ‘n’ o ‘b’. Para extraer una bola aleatoriamente se suma el número de
//bolas blancas y negras y se toma un número aleatorio entre 1 y esa suma. Si
//ese número es menor o igual que el número de bolas blancas, suponemos que
//la bola que sale es blanca. En otro caso, suponemos que la bola es negra.
//◦ Introducir una bola de un color determinado.

public class Urnita {

    private int blancas;
    private int negras;

    public Urnita(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;

    }

    public int totalBolas() {
        return (this.negras + this.blancas);
    }
    
    public char extraer(){
        int total = totalBolas();
        int bola = (int)(Math.random() *total + 1);
        if(bola <= this.blancas){
            this.blancas -=1;
            return 'b';
        }else{
            this.negras-=1;
            return 'n'; 
        }
    }
    
    public void introducir(char bola){
        switch (bola){
            case 'b':
            case 'B':
                this.blancas++;
                break;
            case 'N':
            case 'n':
                this.negras++;
                break;
            default:
                System.out.println("La bola introducida no es valida");
        }
    }
    
        public int getBolasNegras(){
        return this.negras;
    }
    
    public int getBolasBlancas(){
        return this.blancas;
    }

}
