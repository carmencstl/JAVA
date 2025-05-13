import java.util.Scanner;


public class PizarraArrays {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arr[] = {5,6,8,90,2,4,3,67};
        int num;
        
        do{
            System.out.print("Introduce un numero: ");
            num = entrada.nextInt();
        }while(num < 1 || num > arr.length);
        
        int arr2[] = new int[num];
        int j = 0;
        
        for(int i = (arr.length - num); i < arr.length; i++){
            arr2[j] = arr[i];
            System.out.print(arr2[j] + " ");
            j++;
        }
 

    }

}
