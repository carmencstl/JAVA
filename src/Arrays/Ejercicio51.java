
package Arrays;


public class Ejercicio51 {

    public static void main(String[] args) {
        int arr[] = new int[100];
        int mayor = arr[0];
        int posicion = 0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100+1);
            System.out.println((i+1) + ". " + arr[i]);
//            if(arr[i] % 5 == 0){
//                System.out.print(arr[i] + ", ");
//            }
//              if(arr[i] % 2 == 0){
//                  System.out.print(arr[i] + " ");
//             }
               if(arr[i] > mayor ){
                   mayor = arr[i]; 
                   posicion = i;
               }         
        }  
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("Su posicion es: " + (posicion + 1));
    }

}
