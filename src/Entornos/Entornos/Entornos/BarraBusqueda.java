package Entornos.Entornos.Entornos;

/**
 *
 * @author Irene y Carmen
 */
public class BarraBusqueda {

    // Atributo de clase
    private String busqueda;

    /**
     * Constructor sin parámetros.
     */
    public BarraBusqueda() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param busqueda cadena de búsqueda
     */
    public BarraBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    /**
     * Ejecuta una búsqueda.
     */
    public void buscar() {

    }

    /**
     * Obtiene la cadena de búsqueda.
     *
     * @return texto de búsqueda
     */
    public String getBusqueda() {
        return this.busqueda;
    }

    /**
     * Asigna la cadena de búsqueda.
     *
     * @param busqueda cadena de búsqueda
     */
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    /**
     * Representación en cadena del objeto BarraBusqueda.
     *
     * @return información de búsqueda
     */
    @Override
    public String toString() {
        return "Busqueda: " + this.getBusqueda();
    }
}
