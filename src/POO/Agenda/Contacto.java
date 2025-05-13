package POO.Agenda;

public class Contacto {

    private String nombre;
    private int telefono;
    private String email;

    public Contacto(String nombre, int telefono, String email) {
        
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        
    }
    
    public void modificar(String nombre, int telefono, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    @Override
    public String toString() {
        
        String res = "";
        res += "Nombre: " + this.nombre + "\n";
        res += "Telefono: " + this.telefono + "\n";
        res += "Email: " + this.email + "\n";
        return res;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    

}
