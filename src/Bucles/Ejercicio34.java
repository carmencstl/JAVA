//34. Crea un programa que muestre todos los múltiplos de 6 entre 6 y 200, ambos
// inclusive.

package Bucles;

public class Ejercicio34 {

    public static void main(String[] args) {
        int num = 6;
//        int i = 1;
        int multiplos;
        String cad = "";
//        
//        while(i > 0){
//            multiplos = num * i;
//            if(multiplos <= 200){
//            System.out.print(multiplos + ", ");
//            i++;
//            }     

        for(int i = 1; i * num <= 200; i++){
            multiplos = i * num;
            if(multiplos == 198){
                cad = cad + multiplos + " ";
            }
            else{
                cad = cad + multiplos + ", ";
            }     
    }
        System.out.print(cad);
   } 
}
