package POO.Herencia.Ejercicio96;

public class Campeon extends Personaje {

    double puntosMagia;
    int nivel;
    String rol; // Tanque, Carry, Support, Mago y Jungla
    Habilidad poderes[];

    public Campeon(String rol, String nombre, Habilidad primera) {
        super(nombre, 0, 0, 0, 0, 0);
        this.nivel = 1;

        this.rol = rol;
        if (!this.rol.toLowerCase().equals("tanque") || !this.rol.toLowerCase().equals("carry")
                || !this.rol.toLowerCase().equals("support") || !this.rol.toLowerCase().equals("mago") || !this.rol.toLowerCase().equals("junga")) {
            this.rol = "Carry";
        }

        this.x = (int) (Math.random() * (1920 - 1000 + 1) + 1000);
        this.y = (int) (Math.random() * (1920 - 1000 + 1) + 1000);
        this.puntosAtaque = (int) ((Math.random() * 7 - 3 + 1) + 3);
        this.puntosVida = (int) ((Math.random() * 200 - 150 + 1) + 150);
        this.puntosEscudo = (int) ((Math.random() * 20 - 15 + 1) + 15);

        switch (this.rol.toLowerCase()) {

            case "tanque":
                this.puntosVida += 150;
                break;
            case "support":
                this.puntosVida += 50;
                this.puntosEscudo += 50;
                break;
            case "jungla":
                this.puntosVida += 100;
                break;
            case "carry":
                this.puntosEscudo += 100;
                break;
            case "mago":
                this.puntosEscudo += 150;

        }

    }

    public void subirNivel(Habilidad nueva) {
        
        int nuevaVida = (int)(Math.random()* 9 + 1);
        int nuevoEscudo = (int)(Math.random()* 9 + 1);
        int nuevoAtaque = (int)(Math.random()* 9 + 1);
        this.nivel++;
        this.puntosVida += nuevaVida;
        this.puntosEscudo += (nuevoEscudo/10);
        this.puntosAtaque += (nuevoAtaque/10);
        
        if(this.nivel == 4 || this.nivel == 6 || this.nivel == 8){
            
        }

    }

}
