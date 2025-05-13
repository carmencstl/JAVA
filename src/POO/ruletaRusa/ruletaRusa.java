package POO.ruletaRusa;

public class ruletaRusa {

    public static void main(String[] args) {

        rusaRevolver revolver = new rusaRevolver(6);
        System.out.println(revolver);
        revolver.disparar();
        System.out.println(revolver);
        
        Juego juego = new Juego(revolver, 3);
        System.out.println(juego.ronda());
        

    }

}
