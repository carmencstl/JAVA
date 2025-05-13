
package POO.baraja;

public class Carta {
    
    int numero;
    String palos[] = {"P", "T", "C", "D"}; 
    String palo;
    
    public Carta(int numero, int palo) {
        
        this.numero = numero;
        this.palo = this.palos[palo];

    }

    @Override
    public String toString() {
        return this.numero + "-" + this.palo;
    }
    
    
    
}
