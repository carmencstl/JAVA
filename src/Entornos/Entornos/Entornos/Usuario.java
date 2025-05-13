package Entornos.Entornos.Entornos;

/**
 *
 * @author Irene y Carmen
 */
public class Usuario {

    //Atributos de clase
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private String correo;

    /**
     * Constructor sin parámetros.
     */
    public Usuario() {

    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre nombre del usuario
     * @param apellido apellido del usuario
     * @param usuario nombre de usuario
     * @param contrasena contraseña del usuario
     * @param correo correo electrónico
     */
    public Usuario(String nombre, String apellido, String usuario, String contrasena, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    /**
     * Método para registrar al usuario.
     */
    public void registrar() {

    }

    /**
     * Método para iniciar sesión del usuario.
     */
    public void iniciarSesion() {

    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Asigna el nombre del usuario.
     *
     * @param nombre nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return apellido del usuario
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Asigna el apellido del usuario.
     *
     * @param apellido apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return nombre de usuario
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * Asigna el nombre de usuario.
     *
     * @param usuario nombre de usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return contraseña
     */
    public String getContrasena() {
        return this.contrasena;
    }

    /**
     * Asigna la contraseña del usuario.
     *
     * @param contrasena contraseña
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return correo electrónico
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * Asigna el correo electrónico del usuario.
     *
     * @param correo correo electrónico
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Devuelve una representación en cadena del objeto Usuario.
     *
     * @return nombre, apellido, usuario, contraseña y correo
     */
    @Override
    public String toString() {
        return "Usuario: " + this.getNombre()
                + " " + this.getApellido() +
                "\nUsuario: "+ this.getUsuario()
                + "\nCorreo: " + this.getCorreo();
    }
}
