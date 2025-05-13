//A continuación, hay que crear el archivo TestUrna.java e implementar el test de la
//siguiente forma:
//• Debe crear una urna con un número de bolas blancas y negras aleatorias (entre 1
//y 10).
//• Mientras quede más de una bola en la urna, se sacan dos bolas:
//◦ Si ambas son del mismo color, se mete una bola blanca en la urna.
//◦ Si son de diferente color, metemos una bola negra.
//• Por último, cuando quede una sola bola, se saca y se indica su color,
package POO;

public class TestUrnita {

    public static void main(String[] args) {

        int bolasNegras = (int) (Math.random() * 10 + 1);
        int bolasBlancas = (int) (Math.random() * 10 + 1);
        char bola1;
        char bola2;

        Urnita urna = new Urnita(bolasBlancas, bolasNegras);

        while (urna.totalBolas() > 1) {
            bola1 = urna.extraer();
            System.out.println("Se ha extraido una bola: " + bola1);
            bola2 = urna.extraer();
            System.out.println("Se ha extraido una bola: " + bola2);

            if (bola1 == bola2) {
                urna.introducir('b');
                System.out.println("Se ha aniadido una bola blanca");
            } else {
                urna.introducir('n');
                System.out.println("Se ha aniadido una bola negra");
            }
            System.out.println("Quedan: " + (urna.getBolasBlancas()+ urna.getBolasNegras()) + " bolas en la urna, " + urna.getBolasBlancas() + " bolas blancas y " + urna.getBolasNegras() + " bolas negras.");
        }
        char ultimaBola = urna.extraer();
        
        System.out.println("La ultima bola es " + ultimaBola);

    }

}
