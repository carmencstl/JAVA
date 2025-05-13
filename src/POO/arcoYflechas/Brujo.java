
package POO.arcoYflechas;

public class Brujo {
    
    private String nombre;
    private int edad;
    private String lugarNacimiento;
    private Senial senial;
    private double magia;

    public Brujo(String nombre, String lugarNacimiento, Senial senial) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.senial = senial;
        this.edad = (int)(Math.random()*(55 - 18 + 1) + 18);
        this.magia = ((Math.floor((Math.random()*(180 - 90 + 1) + 90) * 100))/100);
    }
    
    
    public String conjurar(Brujo enemigo){
        
        String res = "";
        if(this.magia >= this.senial.getEnergia()){
            this.magia -= this.senial.getEnergia();
            res += this.nombre + " ha lanzado la senial " + this.senial.getNombre() + "...";
            res += "... " + enemigo.nombre + " ha recibido " + this.magia + " puntos de danio.";
        }
        else{
            res += this.nombre  + " no puede lanzar su señal!!";
        }
        return res;
    }

    @Override
    public String toString() {
        
        String res = "";
        res += "Este brujo es " + this.nombre + " de " + this.lugarNacimiento + "." + "Tiene " + this.edad + " anios y " + this.magia + " puntos de magia.\n";
        res += "Utiliza la senial: \n" + this.senial;
        return res;
    }

    
   
    
    
    
    
}
