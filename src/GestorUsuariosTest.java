import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para la clase GestorUsuarios.
 * Usa JUnit 5 para validar el correcto funcionamiento.
 */
public class GestorUsuariosTest {

    private GestorUsuarios gestor;

    /**
     * Se ejecuta antes de cada prueba.
     * Inicializa el gestor con dos usuarios.
     */
    @BeforeEach
    public void configurar() {
        gestor = new GestorUsuarios();
        gestor.agregarUsuario(new Usuario("Ana", "ana@mail.com"));
        gestor.agregarUsuario(new Usuario("Luis", "luis@mail.com"));
    }

    /**
     * Prueba que se pueda agregar un usuario nuevo correctamente.
     */
    @Test
    public void testAgregarUsuario() {
        gestor.agregarUsuario(new Usuario("Carlos", "carlos@mail.com"));
        assertEquals(3, gestor.totalUsuarios());
    }

    /**
     * Prueba la búsqueda de un usuario que sí existe.
     */
    @Test
    public void testBuscarUsuarioExistente() {
        Usuario resultado = gestor.buscarPorNombre("Luis");
        assertNotNull(resultado);
        assertEquals("luis@mail.com", resultado.getCorreo());
    }

    /**
     * Prueba la búsqueda de un usuario que no existe.
     */
    @Test
    public void testBuscarUsuarioInexistente() {
        Usuario resultado = gestor.buscarPorNombre("Pedro");
        assertNull(resultado);
    }

    /**
     * Prueba la eliminación de un usuario existente.
     */
    @Test
    public void testEliminarUsuarioExistente() {
        boolean eliminado = gestor.eliminarUsuario("Ana");
        assertTrue(eliminado);
        assertEquals(1, gestor.totalUsuarios());
    }

    /**
     * Prueba la eliminación de un usuario que no existe.
     */
    @Test
    public void testEliminarUsuarioInexistente() {
        boolean eliminado = gestor.eliminarUsuario("NoExiste");
        assertFalse(eliminado);
        assertEquals(2, gestor.totalUsuarios());
    }
}
