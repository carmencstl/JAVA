
package Navidad;


public class ACU {
    
   private int tamanio;
   private int celulas[];
   //0- muertas 1- vivas
   
   public ACU(int tamanio){
       
       if(tamanio == 0){
           this.tamanio = 10;
       }
       else{
           this.tamanio = tamanio;
       }
       
       for(int i = 0; i < this.celulas.length; i++){
           this.celulas[i] = 0;
       }
       
   }
   
   public boolean aniadirVivas(int vivas[]){
       
       if(vivas.length > this.celulas.length){
           return false;
       }
       else{
           for(int i = 0; i < vivas.length; i++){
               celulas[vivas[i]] = 1;
           }
       }
       return true;   
   }
//   
//   public int [] evolucionar(){
//       
//       
//       
//   }
}
