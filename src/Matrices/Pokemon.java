
package Matrices;

import java.util.Scanner;


public class Pokemon {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tipo;
        
        int tablaTipos [][] = { 
            {5,5,1,1,5,1,5,2,2,1,1,1,1,2,1,1,1,1},
            {1,5,1,5,1,1,2,1,1,1,1,5,1,2,1,2,1,1},
            {5,1,1,1,1,5,5,5,1,5,1,2,2,1,2,1,5,5},
            {5,1,1,2,1,1,1,0,1,1,1,1,1,1,1,1,1,1},
            {1,2,1,5,5,1,1,1,1,1,1,5,1,1,1,0,1,2},
            {1,1,1,1,1,2,1,1,1,1,0,1,2,1,5,1,1,1},
            {2,5,2,5,1,1,5,1,2,1,1,2,1,5,1,1,1,1},
            {5,1,1,2,1,1,5,1,1,2,1,1,1,1,2,1,5,1},
            {5,5,1,2,1,1,5,1,5,1,1,2,1,1,1,2,1,2},
            {2,1,5,1,1,0,1,5,2,1,2,1,5,2,2,1,5,5},
            {5,1,1,1,1,0,1,1,1,1,1,1,1,5,1,1,1,1},
            {5,2,5,5,1,1,5,1,1,1,1,5,1,2,1,2,5,5},
            {5,1,1,1,1,1,1,1,1,2,1,1,5,1,0,1,2,1},
            {5,1,2,1,1,1,2,1,2,5,1,1,1,1,1,5,1,2},
            {1,1,1,1,1,2,1,5,1,5,1,1,2,1,5,1,1,5},
            {2,1,5,1,2,1,2,1,1,1,1,5,1,2,1,1,2,0},
            {0,1,1,1,1,5,1,2,1,1,1,2,1,5,1,5,5,1},
            {5,1,2,1,5,1,1,1,1,2,1,2,1,5,1,1,1,1},
        };
        
        String tipos[] = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", 
            "Tierra", "Veneno", "Volador"};
        
        String daño[] = {"No afecta", "Neutro", "Muy eficaz", null, null, "No muy eficaz"};
        int num;
        int atacante;
        int oponente;

        System.out.println("Que quieres hacer?");
        System.out.println("1.Mostrar debilidades");
        System.out.println("2.Mostrar fortalezas");
        System.out.println("3.Mostrar daño");
        System.out.println("4.Mostrar eficacia de un tipo a otro");
        int res = entrada.nextInt();
        
        switch(res){
            case 1:
                System.out.println("De que tipo quieres ver las debilidades: ");
                mostrarTipos();
                
                do{
                    System.out.print("Introduce un numero del 0 al 17: ");
                    tipo = entrada.nextInt();
                }while(tipo < 0 || tipo > 17);
                
                for(int i = 0; i < tablaTipos.length; i++){
                    if(tablaTipos[i][tipo] == 2){
                        System.out.println(tipos[i]);
                    }
                }
                break;
                
            case 2:
                System.out.println("De que tipo quieres ver las fortalezas: ");
                mostrarTipos();
                
                do{
                    System.out.print("Introduce un numero del 0 al 17: ");
                    tipo = entrada.nextInt();
                }while(tipo < 0 || tipo > 17);
                
                for(int i = 0; i < tablaTipos.length; i++){
                    if(tablaTipos[tipo][i] == 2){
                    System.out.println(tipos[i]);
                    }
                }
                break;
                
            case 3:
                System.out.println("De que tipo quieres ver los daños: ");
                mostrarTipos();
                
                do{
                    System.out.print("Introduce un numero del 0 al 17: ");
                    tipo = entrada.nextInt();
                }while(tipo < 0 || tipo > 17);     
                
                for(int i = 0; i < tablaTipos.length; i++){
                 num = tablaTipos[i][tipo];
                 System.out.println(tipos[i] + ": " + daño[num]);
                }
                break;
            
            case 4:
                mostrarTipos();
                System.out.print("Cual va a ser el tipo atacante: ");
                atacante = entrada.nextInt();
                System.out.print("Cual va a ser el tipo del oponente: ");
                oponente = entrada.nextInt();
                
                num = tablaTipos[atacante][oponente];
                System.out.println(daño[num]);
            
        }
}
 
    public static void mostrarTipos(){
        System.out.println("0.Acero");
        System.out.println("1.Agua");
        System.out.println("2.Bicho");
        System.out.println("3.Dragon");
        System.out.println("4.Electrico");
        System.out.println("5.Fantasma");
        System.out.println("6.Fuego");
        System.out.println("7.Hada");
        System.out.println("8.Hielo");
        System.out.println("9.Lucha");
        System.out.println("10.Normal");
        System.out.println("11.Planta");
        System.out.println("12.Psiquico");
        System.out.println("13.Roca");
        System.out.println("14.Siniestro");
        System.out.println("15.Tierra");
        System.out.println("16.Veneno");
        System.out.println("17.Volador");       
    }
}