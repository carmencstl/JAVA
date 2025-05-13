package Entornos.Entornos.Entornos;

/**
 *
 * @author Irene y Carmen
 */
public class BotonEnviar {
    // Atributo de clase
    private String nombre;

    /**
     * Constructor sin parámetros.
     */
    public BotonEnviar() {
    
    }

    /**
     * Constructor con parámetros.
     * @param nombre nombre del botón
     */
    public BotonEnviar(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que envía datos.
     */
    public void enviarDatos(){
        
    }

    /**
     * Obtiene el nombre del botón.
     * @return nombre del botón
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Asigna el nombre del botón.
     * @param nombre nombre del botón
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Representación en cadena del objeto BotonEnviar.
     * @return información del botón
     */
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre();
    }
}

