
package Matrices;

import java.util.Scanner;


public class Aparcamiento {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Creo dos arrays, uno para los pequeños y otro para los grandes
        String plazasPequeñas [] = new String [14];
        String plazasGrandes [] = new String[10];
        
    
        //Relleno los array
        for(int i = 0; i < plazasPequeñas.length; i++){
            plazasPequeñas[i] = "O";
        }
        for(int i = 0; i < plazasGrandes.length; i++){
            plazasGrandes[i] = "L";
        } 
        
        //Variables que voy a necesitar
        int res = 0;
        int menorLibreGrandes = plazasGrandes.length;
        int menorLibrePequeñas = plazasPequeñas.length;
        int plaza;
        String seguir;
        String tamanio;

        
    //Do while mientras el usuario no meta 4 que es para salir
    do{
        //Muestro el menu
        System.out.println("1.Aparcar vehiculo");
        System.out.println("2.Sacar vehiculo");
        System.out.println("3.Mostrar aparcamiento");
        System.out.println("4.Salir");
        System.out.print("Opcion? ");
        res = entrada.nextInt();
        

        switch(res){
            case 1:
        //Con este primer do while le pregunto si quiere seguir aparcando coches
        do{         
            //Con este compruebo que el tamaño del vehiculo sea correcto
            do{
                System.out.println("Tamaño del vehiculo? (G/P): ");
                tamanio = entrada.next();
            }while(!tamanio.equals("G") && !tamanio.equals("P"));
        
            
            //Este booleano es para comprobar si quedan plazas pequeñas libres
            boolean libres = false;
            //Aparco en caso de que sea pequeño el coche
            if(tamanio.equals("P")){
                for(int i = 0; i < plazasPequeñas.length; i++){
                    if(menorLibrePequeñas > i && plazasPequeñas[i].equals("L")){
                        menorLibrePequeñas = i;
                        System.out.println("Aparcado en P" + menorLibrePequeñas);
                        plazasPequeñas[menorLibrePequeñas] = "O";
                        libres = true; // aqui le digo que libres es true porque siguen quedando plazas libres
                    }
                    else{
                        menorLibrePequeñas++;
                    }
                }
            }
            //Si libres es false, es decir, no ha llegado a entrar en la condicion de que queden aparcamientos libres pequeños le digo que ahora tamaño valga G y 
            //se vaya al if para los coches grandes
            
           
            if(libres == false){
                tamanio = "G";
            }
            
         //Igual pero para aparcamiento grande
            if(tamanio.equals("G")){   
                for(int i = 0; i < plazasGrandes.length; i++){
                    if(menorLibreGrandes > i && plazasGrandes[i].equals("L")){
                        menorLibreGrandes = i;
                        System.out.println("Aparcado en G" + menorLibreGrandes);
                        plazasGrandes[menorLibreGrandes] = "O";
                    }
                    else{
                        menorLibreGrandes++;
                    }
                }
           } 
           
            System.out.print("Aparcar otro coche? (S/N): ");
            seguir = entrada.next();
            
            }while(seguir.equals("S"));
           
            break;
                
            case 2:
            //El do while es para preguntar si sigue queriendo aparcar mas coches    
            do{   
                //verifico que el tamaño sea correcto
                do{
                    System.out.println("Tamaño del vehiculo? (G/P): ");
                    tamanio = entrada.next();
                }while(!tamanio.equals("G") && !tamanio.equals("P"));
  
                //PARA COCHES GRANDES
                if(tamanio.equals("G")){
                do{
                    //COMPRUEBO QUE EL NUMERO DE PLAZA SEA CORRECTO
                    System.out.print("Numero de plaza? ");
                    plaza = entrada.nextInt();
                }while (plaza < 0 || plaza > plazasGrandes.length - 1);
                
                    if(plazasGrandes[plaza].equals("L")){
                        System.out.println("IMPOSIBLE: En esa plaza no hay ningun vehiculo");
                    }
                    else if(plazasGrandes[plaza].equals("O")){
                        plazasGrandes[plaza] = "L";
                    }
                }
                //IGUAL PERO PARA COCHES PEQUEÑOS
                else if(tamanio.equals("P")){
                    
                     do{
                    System.out.print("Numero de plaza? ");
                    plaza = entrada.nextInt();
                }while (plaza < 0 || plaza > plazasPequeñas.length - 1);
                     
                    if(plazasPequeñas[plaza].equals("L")){
                        System.out.println("IMPOSIBLE: En esa plaza no hay ningun vehiculo");
                    }
                    else if(plazasPequeñas[plaza].equals("O")){
                        plazasPequeñas[plaza] = "L";
                    }
                }   
                
                System.out.print("Sacar otro coche? (S/N): ");
                seguir = entrada.next();
                
            }while(seguir.equals("S"));
            
            break;
            
            case 3:
                //MUESTRO LOS DOS ARRAY
            for(int i = 0; i < plazasGrandes.length; i++){
                System.out.print(plazasGrandes[i] + ", ");
            }
                System.out.println();
            for(int i = 0; i < plazasPequeñas.length; i++){
                System.out.print(plazasPequeñas[i] + ", ");
            }
            System.out.println();
            break;
        }
        
    } while(res != 4);

}
    
}