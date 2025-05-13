package Entornos.Entornos.Entornos;

/**
 * Clase que representa una tarea
 *
 * @author Irene y Carmen
 */
public class Tarea {

    //Atributos de clase
    private String titulo;
    private String descripcion;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private Categoria categoria;
    private boolean completada;

    /**
     * Constructor sin parámetros.
     */
    public Tarea() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param titulo título de la tarea
     * @param descripcion descripción de la tarea
     * @param fecha fecha de creación de la tarea
     * @param horaInicio hora de inicio de la tarea la tarea
     * @param horaFin hora de fin de la tarea
     * @param categoria categoría de la tarea
     * @param completada indica si la tarea está completada o no
     */
    public Tarea(String titulo, String descripcion, String fecha, String horaInicio, String horaFin, Categoria categoria, boolean completada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.categoria = categoria;
        this.completada = completada;
    }

    /**
     * Indica si la tarea está completada.
     *
     * Método para crear una tarea
     */
    public void crearTarea() {

    }

    /**
     * Indica si la tarea está completada.
     *
     * Método para editar una tarea
     */
    public void editarTarea() {

    }

    /**
     * Indica si la tarea está completada.
     *
     * Método para eliminar una tarea
     */
    public void eliminarTarea() {

    }

    /**
     * Indica si la tarea está completada.
     *
     * @return true si está completada, false si no
     */
    public boolean completarTarea() {
        return this.completada;
    }

    /**
     * Obtiene el título de la tarea.
     *
     * @return título de la tarea
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Asigna el título de la tarea.
     *
     * @param titulo nuevo título de la tarea
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la descripción de la tarea.
     *
     * @return descripción de la tarea
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Asigna la descripción de la tarea.
     *
     * @param descripcion nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha de la tarea.
     *
     * @return fecha de la tarea
     */

    public String getFecha() {
        return this.fecha;
    }

    /**
     * Asigna la fecha de la tarea.
     *
     * @param fecha nueva fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora de inicio de la tarea.
     *
     * @return hora de inicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Asigna la hora de inicio de la tarea.
     *
     * @param horaInicio nueva hora de inicio
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Obtiene la hora de fin de la tarea.
     *
     * @return hora de fin
     */
    public String getHoraFin() {
        return this.horaFin;
    }

    /**
     * Asigna la hora de fin de la tarea.
     *
     * @param horaFin nueva hora de fin
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * Obtiene la categoría de la tarea.
     *
     * @return categoría asociada
     */
    public Categoria getCategoria() {
        return this.categoria;
    }

    /**
     * Asigna la categoría de la tarea.
     *
     * @param categoria nueva categoría
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene si está completada o no la tarea.
     *
     * @return categoría asociada
     */
    public boolean getCompletada() {
        return this.completada;
    }

    /**
     * Asigna el estado de completitud de la tarea.
     *
     * @param completada true si está completada, false si no
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    /**
     * Devuelve una representación en cadena del objeto Tarea.
     *
     * @return resumen con todos los atributos de la tarea
     */
    @Override
    public String toString() {
        return "Tarea: " + this.titulo
                + "\nDescripción: " + this.getDescripcion()
                + "\nFecha: " + this.getFecha()
                + "\nHora de Inicio: " + this.getHoraInicio()
                + "\nHora de Fin: " + this.getHoraFin()
                + "\nCategoría: " + this.getCategoria()
                + "\nCompletada: " + this.getCompletada();
    }
}
