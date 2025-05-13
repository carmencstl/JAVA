package POO.Agenda;

public class Agenda {

    Contacto lista[];

    public Agenda(int tam) {

        this.lista = new Contacto[tam];
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = null;
        }
    }

    public void aniadirContacto(String nombre, int telefono, String email) {

        int i = 0;
        int cont = 1;

        while (i < this.lista.length && cont != 0) {
            if (this.lista[i] == null)  {
                this.lista[i] =  new Contacto(nombre, telefono, email);
                cont--;
            }
            i++;
        }
    }

    public void aniadirContacto(Contacto nuevoContacto) {

        int i = 0;
        int cont = 1;

        while (i < this.lista.length && cont != 0) {
            if (this.lista[i] == null) {
                this.lista[i] = nuevoContacto;
                cont--;
            }
            i++;
        }
    }

    public boolean borrarContacto(String email) {

        int i = 0;

        while (i < this.lista.length && !email.equals(this.lista[i].getEmail())) {
            i++;
        }

        if (this.lista[i].getEmail().equals(email)) {
            this.lista[i] = null;
            return true;
        }
        return false;

    }

    public boolean modificarContacto(String email, String emailNuevo, int telefono, String nombre) {

        int i = 0;

        while (i < this.lista.length && !email.equals(this.lista[i].getEmail())) {
            i++;
        }

        if (this.lista[i].getEmail().equals(email)) {
            this.lista[i].setNombre(nombre);
            this.lista[i].setTelefono(telefono);
            this.lista[i].setEmail(emailNuevo);
            return true;
        }
        return false;
    }
    
    
    public boolean llena(){
        
        for (int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {

        String res = "";

        for (int i = 0; i < this.lista.length; i++) {

            if (this.lista[i] != null) {
                res += "CONTACTO" + " N " + (i + 1) + "\n";
                res += this.lista[i].toString();
            }
            else{
                res += "";
            }

        }
        return res;
    }

}
