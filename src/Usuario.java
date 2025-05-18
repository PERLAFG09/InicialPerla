public class Usuario {
    /**
     * Clase que representa un usuario con nombre y correo electrónico.
     */
    private String nombre;
    private String correo;

    /**
     * Constructor para crear un usuario con nombre y correo.
     * @param nombre Nombre del usuario.
     * @param correo Correo electrónico del usuario.
     */

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    /**
     * Devuelve el nombre del usuario.
     * @return Nombre del usuario.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el correo del usuario.
     * @return Correo del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Devuelve el correo del usuario.
     * @return Correo del usuario.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
