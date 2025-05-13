package POO.cieloYestrellas;

public class Estrella {

    int x;
    int y;
    char forma;

    public Estrella(int x, int y) {
        
        this.x = x;
        this.y = y;
        
        if(esCercana()){
            this.forma = '*';
        }
        else{
            this.forma = '.';
        }
        
    }
    

    public boolean esCercana() {
        
        int cercana = (int)(Math.random() * 31);
       
        return cercana <= 10;
        
    }
    

    @Override
    public String toString() {
        
        return this.forma + "";
    }
    
    
    

}
