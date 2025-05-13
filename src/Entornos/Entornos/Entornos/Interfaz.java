package Entornos.Entornos.Entornos;

/**
 *
 * @author Irene y Carmen
 */
public class Interfaz {
    // Atributo de clase

    private String color;

    /**
     * Constructor sin parámetros.
     */
    public Interfaz() {
        
    }

    /**
     * Constructor con parámetros.
     *
     * @param color color de la interfaz
     */
    public Interfaz(String color) {
        this.color = color;
    }

    /**
     * Método para personalizar la interfaz.
     */
    public void personalizar() {

    }

    /**
     * Obtiene el color de la interfaz.
     *
     * @return color de la interfaz
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Asigna el color de la interfaz.
     *
     * @param color color deseado
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Representación en cadena del objeto Interfaz.
     *
     * @return información de la interfaz
     */
    @Override
    public String toString() {
        return "Color: " + this.getColor();
    }
}
