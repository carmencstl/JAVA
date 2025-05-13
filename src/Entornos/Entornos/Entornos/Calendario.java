package Entornos.Entornos.Entornos;

/**
 *
 * @author Irene y Carmen
 */
public class Calendario {

    // Atributos de clase
    private String vista;
    private String mes;
    private String dia;
    private String anio;

    /**
     * Constructor sin parámetros.
     */
    public Calendario() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param vista vista del calendario
     * @param mes mes del calendario
     * @param dia día del calendario
     * @param anio año del calendario
     */
    public Calendario(String vista, String mes, String dia, String anio) {
        this.vista = vista;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    /**
     * Cambia la vista del calendario.
     *
     * @param nuevaVista nueva vista a establecer
     */
    public void cambiarVista(String nuevaVista) {
        this.vista = nuevaVista;
    }

    /**
     * Filtra el calendario por categoria
     *
     */
    public void filtrarCategoria() {

    }

    /**
     * Obtiene la vista del calendario.
     *
     * @return vista
     */
    public String getVista() {
        return this.vista;
    }

    /**
     * Asigna la vista del calendario.
     *
     * @param vista vista del calendario
     */
    public void setVista(String vista) {
        this.vista = vista;
    }

    /**
     * Obtiene el mes del calendario.
     *
     * @return mes
     */
    public String getMes() {
        return this.mes;
    }

    /**
     * Asigna el mes del calendario.
     *
     * @param mes mes del calendario
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * Obtiene el día del calendario.
     *
     * @return dia
     */
    public String getDia() {
        return this.dia;
    }

    /**
     * Asigna el día del calendario.
     *
     * @param dia día del calendario
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Obtiene el año del calendario.
     *
     * @return anio
     */
    public String getAnio() {
        return this.anio;
    }

    /**
     * Asigna el año del calendario.
     *
     * @param anio año del calendario
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * Devuelve una representación textual del objeto Calendario.
     *
     * @return cadena con la información del calendario
     */
    @Override
    public String toString() {
        return "Vista: " + this.getVista()
                + "\nMes: " + this.getMes()
                + "\nDia: " + this.getDia()
                + "\nAnio: " + this.getAnio();
    }
}
