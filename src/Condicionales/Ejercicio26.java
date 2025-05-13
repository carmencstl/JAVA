/* El sistema de verificación en dos pasos funciona de la siguiente manera:
 • Se le pide al usuario que introduzca su nick, su email y la contraseña.
 • Si el email y la contraseña son correctos (los datos se dicen en clase), el 
programa va a generar un número aleatorio de 4 cifras y lo va a mostrar por 
pantalla.
 • A continuación se vuelve a pedir el email, la contraseña y, esta vez, el número 
aleatorio.
 • Si todo ha ido correctamente, se mostrará el mensaje: “Verificación aceptada. 
Bienvenid@: xxxxxx (siendo xxxxxx el nick del usuario).
 • Si hay algún fallo, se mostrará un mensaje de error */


import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pido los datos al usuario
        System.out.print("Introduce tu nick: ");
        String nick = entrada.next();
        
        System.out.print("Introduce tu email: ");
        String email = entrada.next();
        
        System.out.print("Introduce tu contraseña: ");
        String contrasenia = entrada.next();
        
        // guardo los valores que deben coincidir
        String correo = "jusdrein1@medac.es";
        String contra = "!pabloClavo1";
        
        // compruebo si el correo y la contraseña coinciden
        if (correo.equals(email) && contrasenia.equals(contra)){
            
            // Si coinciden genero un numero aleatorio
            int clave = (int) (Math.random() * (9999 - 1000 + 1) + 1000);  
            
            System.out.println("Su clave es: " + clave);
            
            // Le vuelvo a pedir al usuario el correo, la contraseña y la clave aleatoria
            System.out.print("Introduce tu correo de nuevo: ");
            email = entrada.next();
            
            System.out.print("Introduce tu contraseña de nuevo: ");
            contrasenia = entrada.next();
            
            System.out.print("Introduce la clave: ");
            int clave2 = entrada.nextInt();
                
                // Vuelvo a comprobar que los datos coinciden
                if (correo.equals(email) && contrasenia.equals(contra) && clave == clave2){
                System.out.println("Bienvenid@: " + nick);
                }
                else{
                    System.out.println("Los datos introducidos no son correctos");
                }
        }       // Mensajes de error
        else {
            System.out.println("Los datos introducidos no son correctos");
        } 
    }
}
