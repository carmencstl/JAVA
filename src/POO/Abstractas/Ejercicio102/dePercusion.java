/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Abstractas.Ejercicio102;

/**
 *
 * @author ccast
 */
public abstract class dePercusion extends Instrumento {

    boolean baquetas; // true si false no

    public dePercusion(boolean baquetas, String marca, String fecha, Partitura partitura) {
        super(marca, fecha, partitura);
        this.baquetas = baquetas;
    }
    
    public abstract void afinar();

}
