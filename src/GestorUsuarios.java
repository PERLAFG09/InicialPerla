
import java.util.ArrayList;
import java.util.List;


editeee este punto para hacer pruebas .

/*
 avisa cuando tengas que hacer un commmit porque la forma del codigo esta mal
 */



/**
 * Clase que gestiona una lista de usuarios.
 * Permite agregarlos, buscarlos por nombre y eliminarlos.
 */

public class GestorUsuarios {
    private List<Usuario> usuarios;

    /**
     * Constructor que inicializa la lista de usuarios vacía.
     */
    public GestorUsuarios() {
        usuarios = new ArrayList<>();
    }

    /**
     * Agrega un nuevo usuario a la lista.
     * @param usuario Usuario a agregar.
     */

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Busca un usuario por su nombre.
     * @param nombre Nombre del usuario a buscar.
     * @return Usuario encontrado o null si no existe.
     */
    public Usuario buscarPorNombre(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }

    /**
     * Elimina un usuario por su nombre.
     * @param nombre Nombre del usuario a eliminar.
     * @return true si el usuario fue eliminado, false si no se encontró.
     */

    public boolean eliminarUsuario(String nombre) {
        Usuario u = buscarPorNombre(nombre);
        if (u != null) {
            usuarios.remove(u);
            return true;
        }
        return false;
    }

    /**
     * Devuelve la cantidad total de usuarios.
     * @return Número de usuarios registrados.
     */
    public int totalUsuarios() {
        return usuarios.size();
    }
}
