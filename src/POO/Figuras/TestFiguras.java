
package POO.Figuras;


public class TestFiguras {

    public static void main(String[] args) {
        
        Punto punto = new Punto(3, 5);
        Circulo circulo = new Circulo(5, punto);
        Cilindro cilindro = new Cilindro(10, circulo);
        
        
    }

}
