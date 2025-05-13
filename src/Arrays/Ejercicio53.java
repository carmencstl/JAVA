package Arrays;



public class Ejercicio53 {

    public static void main(String[] args) {
        
        String arr[] = {"Hola","holaa"};
        String arr2[] = {"Hola","holaaaaa"};
        String cad = "";
        String cad2 = "";
        
        for(int i = 0; i < arr.length; i++){
            
            cad = cad + arr[i];
        }
        
        for(int j = 0; j < arr2.length; j++){
                cad2 = cad2 + arr2[j];
            } 
        
        if(cad.equals(cad2)){
                    System.out.println("Son iguales");
                }
                else{
                    System.out.println("No son iguales");
                }
    }

}
