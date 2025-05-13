package Entornos.Entornos.Entornos;

/**
 * Clase que representa una notificación relacionada con una tarea.
 *
 * @author Irene y Carmen
 */
public class Notificacion {

    //Atributos de clase
    private String titulo;
    private String descripcion;
    private Tarea tarea;

    /**
     * Constructor sin parámetros.
     */
    public Notificacion() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param titulo título de la notificación
     * @param descripcion descripción
     * @param tarea tarea asociada
     */
    public Notificacion(String titulo, String descripcion, Tarea tarea) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tarea = tarea;
    }

    /**
     * Método para enviar una notificación de la tarea al usuario.
     */
    public void enviarNotificacion() {

    }

    /**
     * Obtiene el título de la notificación.
     *
     * @return título
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Asigna el título de la notificación.
     *
     * @param titulo título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la descripción de la notificación.
     *
     * @return descripción
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Asigna la descripción de la notificación.
     *
     * @param descripcion descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la tarea asociada a la notificación.
     *
     * @return tarea
     */
    public Tarea getTarea() {
        return this.tarea;
    }

    /**
     * Asigna la tarea asociada a la notificación.
     *
     * @param tarea tarea
     */
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    /**
     * Devuelve una representación en cadena del objeto Notificación.
     *
     * @return título, descripción y tarea
     */
    @Override
    public String toString() {
        return "Notificación: " + this.getTitulo()
                + "\nDescripción: " + this.getDescripcion()
                + "\nTarea:" + this.getTarea();
    }
}
