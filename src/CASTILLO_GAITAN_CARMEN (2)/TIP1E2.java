import java.util.Scanner;
public class TIP1E2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 10 y 30: ");
        int num = teclado.nextInt();
        int ale1;
        int ale2;
        
        //Condiciono al usuario a que el valor introducido sea entre 10 y 30
        if ((num >= 10) && (num <= 30)){
            //Genero dos numeros aleatorios, uno para la maquina y otro para el usuario
            ale1 = (int)(Math.random()* (43 - 5 + 1) + 5);
            ale2 =  (int)(Math.random()* (43 - 5 + 1) + 5);
            System.out.println("La maquina ha sacado: " + ale2);
            
            //Compruebo si has ganado
            if(ale1 > ale2){
                System.out.println("Tu ganas!!!");
            }
            //Compruebo si ha ganado la maquina
            else if(ale1 < ale2){
                System.out.println("La maquina gana!!!");
            }
            //Si los numeros son iguales
            else{
                System.out.println("Los numeros son iguales");
            }
        }
        //Error si el usuario no introduce un numero entre 10 y 30
        else{
            System.out.println("ERROR. El numero introducido no esta en el rango indicado");
        }
        
    }

}
