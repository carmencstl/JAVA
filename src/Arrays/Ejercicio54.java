package Arrays;

public class Ejercicio54 {

    public static void main(String[] args) {
        int valores[] = {2, 4, 6, 8, 1, 3, 5, 7};
        int valores2[] = new int[(valores.length + 2)];

        for (int i = 0; i < 3; i++) {

            valores2[i] = valores[i];
        }
        
        valores2[3] = 200;
        
        for(int i = 3; i < 5; i++){
            valores2[i+1] = valores[i]; 
        }
        
        valores2[6] = 300;
        
        for(int i = 5; i < valores.length; i++){
            valores2[i+2] = valores[i];

        }
        
        for(int i = 0; i < valores2.length; i++){
            System.out.print(valores2[i] + " ");
        }
        
    }
       
}
