
package POO.arcoYflechas;


public class pruebaArco {

    public static void main(String[] args) {
        
        Flecha_Magica flecha = new Flecha_Magica(25, 3);
        System.out.println(flecha);
        flecha.cambiarElemento(1);
        System.out.println(flecha);
        Arco_Magico arco = new Arco_Magico(2, 5);
        
        arco.disparar();
        arco.disparar();
        arco.disparar();
        arco.disparar();
        arco.disparar();
        arco.disparar();
        arco.recargar();
        arco.disparar();
        Senial señal = new Senial("MonkeFlip", 2);
        System.out.println(señal);
        
        Brujo chema = new Brujo("Chemake", "Aisira", señal);
        Brujo carmen = new Brujo("Naiki", "Magala", señal);
        System.out.println(carmen.conjurar(chema));
//        System.out.println();
        System.out.println(chema);
       

    }

}
