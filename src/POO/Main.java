package POO;


public class Main {

    public static void main(String[] args) {

//        Videoconsolas playStation = new Videoconsolas("Sony", "PlayStation 5", 599.99, 1000, "Blanco", true);
//        Videoconsolas nintendo = new Videoconsolas("Nintendo", "Nintento 3DS", 299.99, 32, "Rosa", false);
//        Videoconsolas steamDeck = new Videoconsolas("Steam", "SteamDeck", 499.99, 500, "Negro", false);
//        playStation.mostrarInformacion();
//        nintendo.mostrarInformacion();
//        steamDeck.mostrarInformacion();
//        nintendo.encenderConsola();
//        nintendo.cargarJuego();
//        
//        steamDeck.aumentarAlmacenamiento();
//        
           ListaCadenas lista  = new ListaCadenas(4);
           
           System.out.println(lista.buscar(""));
           lista.aniadir("uwu");
           lista.aniadir("lol");
           lista.aniadir("xd");
           lista.aniadir("lady");
//           lista.aniadir("ameba");
           lista.borrar(5);
           lista.borrar("xo");
           System.out.println(lista.buscar("uwu"));

        }
   
    }


