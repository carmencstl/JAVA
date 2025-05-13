
package POO.Herencia.Ejercicio94;


public class mainEjercicio94 {


    public static void main(String[] args) {
        
        Profesor jaime = new Profesor("Jaime", 6);
        jaime.empezarClase();
       System.out.print(jaime);
        Asignatura bbdd = new Asignatura(12, 4);
        ProfesorUniversidad luis = new ProfesorUniversidad("Luis", 2);
        System.out.print(luis);
        System.out.println();
        luis.cogerAsignatura(bbdd);
        System.out.println();
        luis.empezarClase();
        System.out.print(luis);
        
              
    }
    
}
