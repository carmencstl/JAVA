package Entornos.Entornos.Entornos;

/**
 * Clase que representa una categoría para clasificar las tareas
 *
 * @author Irene y Carmen
 */
public class Categoria {

    //Atributos de clase
    private String nombre;
    private String color;

    /**
     * Constructor sin parámetros.
     */
    public Categoria() {
        
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre de la categoría
     * @param color color asociado a la categoría
     */
    public Categoria(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Obtiene el nombre de la categoría.
     *
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Asigna el nombre de la categoría.
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el color de la categoría.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Asigna el color de la categoría.
     *
     * @param color color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve una representación en cadena del objeto Categoria.
     *
     * @return nombre y color
     */
    @Override
    public String toString() {
        return "Categoría: " + this.getNombre()
                + "\nColor: " + this.getColor();
    }
}
