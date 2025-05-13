
package POO.ejercicioGuerrero;


public class testGuerrero {

    public static void main(String[] args) {
        
        
        Arma html = new Arma("Visual Studio", 5, 1);
        Arma css = new Arma("Bloc de Notas", 1, 100);
        Guerrero alejandro = new Guerrero("Alejandro", 100, 5, 3, html);
        Guerrero medinilla = new Guerrero("Medinilla", 5, 100, 1, css);
        
        alejandro.atacar(medinilla);
        System.out.println(medinilla.toString());
        System.out.println(html.toString());
        alejandro.atacar(medinilla);
        System.out.println(medinilla.toString());
        System.out.println(html.toString());
        
    }

}
