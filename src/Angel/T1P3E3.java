
package Angel;


public class T1P3E3 {

    public static void main(String[] args) {//Realizamos las pruebas necesarias
        Laptop portatil=new Laptop("HP", "Jaime", 16, 3, 100);
        
        portatil.apagarse();
        
        portatil.encenderse();
        
        portatil.encenderse();
        
        portatil.aumentarRam(-12);
        
        System.out.println("Marca: "+portatil.marca);
        System.out.println("Modelo: "+portatil.modelo);
        System.out.println("Cantidad Ram: "+portatil.cantidadDeRam);
    }

}
