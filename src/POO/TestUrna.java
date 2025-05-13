
package POO;


public class TestUrna {

    public static void main(String[] args) {
       
        
        int negras = (int)(Math.random() * 10 + 1);
        int blancas = (int)(Math.random() * 10 + 1);
        char bola1;
        char bola2; 
        
        Urna urna = new Urna(negras, blancas);
        
        System.out.println("Se crea una urna con " + urna.consultar() + " bolas, " + negras + " negras y " + blancas + " blancas.");
        
        while(urna.consultar() > 1){
            
            bola1 = urna.extraerBola();
            bola2 = urna.extraerBola();
            System.out.println("Se extrae una bola " + bola1 + " y una bola " + bola2);
            

            if(bola1 == bola2){
                urna.añadirBola('b');
                System.out.println("Se añade una bola blanca");
            }
            else{
                urna.añadirBola('n');
                System.out.println("Se añade una bola negra");
            }
         System.out.println("Quedan " + urna.getBolasNegras() + " bolas negras y " + urna.getBolasBlancas() + " bolas blancas");           
        }
        
        char ultimaBola = urna.extraerBola();
        
        System.out.println("La ultima bola es " + ultimaBola);
        
        
    }

}
