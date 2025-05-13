
package POO.Figuras;

public class Cilindro {
    
    int altura;
    Circulo base;
    
    
    public Cilindro(int altura, Circulo base){
        
        this.altura = altura;
        this.base = base;
    }
    
    
    public double volumen(){
        
        return this.base.radio * 2 * Math.PI;
        
    }

    public String toString() {
        return "Cilindro{" + "altura=" + this.altura + ", base=" + this.base + '}';
    }

            
}
