
package POO.Abstractas.Ejercicio99;

public class Conjunto extends Coleccion{

    public Conjunto() {
    }

    public Conjunto(int tam) {
        super(tam);
    }


    public void aniadir(int elemento){
         if (!this.contiene(elemento)) {
            super.aniadir(elemento);
        }
    }
    
}
