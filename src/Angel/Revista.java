
package T2P1;

public class Revista {
    //Propiedades de la clase
    private String editorial;
    private String titulo;
    private double precioBase;
    
    //Método constructor
    public Revista(String editorial, String titulo, double precioBase){
        this.titulo = titulo;
        this.editorial = editorial;
        this.precioBase = precioBase;
    }

    public String getTitulo() {
        return this.titulo;
    }
    
    //Get y set de la variable privada titulo
    public void setTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }
    
    //Get y Set de la variable privada precioBase
     public double getPrecioBase() {
        return this.precioBase;
    }
    
    public void setPrecioBase(double nuevoPrecioBase){
        this.precioBase = nuevoPrecioBase;
    }
    
    public double calcularPrecioFinal(double IVA){
        double precioFinal = 0;//Nos servirá para guardar el resultado
        
        precioFinal = this.precioBase + this.precioBase * IVA /100;//Formula
        return precioFinal;
    }
    
    public String toString(){//Mostramos los datos aprovechando los getters
        return "Revista["+this.editorial+"#"+getTitulo()+"#"+calcularPrecioFinal(21)+"]";
    }
}
