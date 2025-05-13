package Entornos.Entornos.Entornos;

/**
 * Clase que representa una lista de tareas
 *
 * @author Irene y Carmen
 */
public class ListaTareas {

    //Atributo de clase
    private Tarea listaTareas[];

    /**
     * Constructor sin parámetros.
     */
    public ListaTareas() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param listaTareas conjunto de tareas
     */
    public ListaTareas(Tarea listaTareas[]) {
        this.listaTareas = listaTareas;
    }

    /**
     * Devuelve una cadena con todas las tareas de la lista.
     *
     * @return cadena con las tareas
     */
    public String verLista() {
        if (this.listaTareas != null && this.listaTareas.length > 0) {
            String res = "";
            for (int i = 0; i < this.listaTareas.length; i++) {
                res += "Tarea " + (i + 1) + ": " + this.getListaTareas()[i] + "\n";
            }
            return res;
        } else {
            return "La lista de tareas está vacía.";
        }
    }

    /**
     * Devuelve la lista de tareas.
     *
     * @return listaTareas
     */
    public Tarea[] getListaTareas() {
        return this.listaTareas;
    }

    /**
     * Asigna la lista de tareas.
     *
     * @param listaTareas lista de tareas
     */
    public void setListaTareas(Tarea[] listaTareas) {
        this.listaTareas = listaTareas;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto ListaTareas.
     * Llama al método verLista para mostrar las tareas.
     *
     * @return cadena con el número de tareas y sus detalles
     */
    @Override
    public String toString() {
        String res = "ListaTareas: ";
        if (this.listaTareas != null) {
            res += listaTareas.length + " tareas.\n";
        } else {
            res += "No hay tareas en la lista.";
        }
        res += verLista();
        return res;
    }
}
