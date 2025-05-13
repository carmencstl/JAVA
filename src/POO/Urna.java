
package POO;

public class Urna {
    
    private int bolasNegras;
    private int bolasBlancas;
    
    public Urna(int bolasNegras, int bolasBlancas){
        
        this.bolasNegras = bolasNegras;
        this.bolasBlancas = bolasBlancas;
        
    }
    
    public int consultar(){
        return this.bolasBlancas + this.bolasNegras;
    }
    
    public char extraerBola(){
        int totalBolas = consultar();
        
        int ale = (int)(Math.random() * totalBolas + 1);
        
        if(ale <= this.bolasBlancas){
            this.bolasBlancas -= 1;
            return 'b';
        }
        else{
            this.bolasNegras -= 1;
            return 'n';
        }
        
    }
    
    public void añadirBola(char bola){
        
        switch (bola) {
            case 'b':
            case 'B':
                this.bolasBlancas++; 
            break;
            
            case 'n':
            case 'N':
                this.bolasNegras++;
            break;
        }
        
    }
    
    public int getBolasNegras(){
        return this.bolasNegras;
    }
    
    public int getBolasBlancas(){
        return this.bolasBlancas;
    }
    
    
}
