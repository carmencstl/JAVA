
package POO.Agenda;


public class testAgenda {

    public static void main(String[] args) {
        
        Agenda journal = new Agenda(5);
        journal.aniadirContacto("Pepe", 622081667, "pepe12@");
        Contacto juana = new Contacto("Juana", 1234, "Juanita");
        journal.aniadirContacto(juana);
        System.out.println(journal);
        journal.borrarContacto("Juanita");
        System.out.println(journal);
    }

}
