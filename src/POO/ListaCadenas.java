package POO;

public class ListaCadenas {

    public String lista[];
    int indice;

    public ListaCadenas(int tam) {

        this.lista = new String[tam];
        this.indice = 0;
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = "";
        }
    }

    public void aniadir(String elemento) {
        
        if(buscar("") != -1){
            this.lista[this.indice] = elemento;
            this.indice = buscar("");
        }
        else{
            System.out.println("No se ha podido aniadir");
        }
    }

    public void aniadir(String elemento, int pos) {

        if (pos >= 0 && pos <= lista.length) {
            lista[pos] = elemento;
        } else {
            System.out.println("La posicion no existe");
        }
    }

    public int tamanio() {
        return this.lista.length;
    }

    public boolean llena() {

        int i = 0;
        while (i < lista.length && !lista[i].equals("")) {
            i++;
        }

        if (i < lista.length) {
            return false;
        } else {
            return true;
        }
    }

    public boolean vacia() {
        int i = 0;
        while (i < lista.length && lista[i].equals("")) {
            i++;
        }

        if (i < lista.length) {
            return false;
        } else {
            return true;
        }
    }
    
    public String obtener(int pos){
        
        if(pos < 0 || pos > this.lista.length){
            System.out.println("La posicion indicada no existe");
        }
        return lista[pos];
    }
    
    public int buscar(String elemento){
        
        int i = 0;
        while (i < this.lista.length) {
            if(this.lista[i].equals(elemento)){
                return i;
            }
            i++;
        }
        return -1;
    }
    
    public void borrar(){
        int i = 0;
        while (i < lista.length && !lista[i].equals("")) {
            lista[i] = "";
            i++;
        }
    }
    
    public void borrar(int pos){
        if (pos >= 0 && pos <= lista.length) {
            lista[pos] = "";
        }
        else{
            System.out.println("La posicion indicada no existe");
        }
    }
    
    public void borrar(String elemento){
        
        int pos = buscar(elemento);
        if(pos != -1){
          this.lista[pos] = "";  
        }
        else{
            System.out.println("No se ha encontrado en elemento");
        }
 
    }
}
