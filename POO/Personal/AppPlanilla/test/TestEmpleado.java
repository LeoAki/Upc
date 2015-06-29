
import appplanilla.Empleado;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumnos
 */
public class TestEmpleado {

    public TestEmpleado() {
    }

    @Test
    public void testCalcularAnhos() {
        Empleado empleado = new Empleado("70756256", "Leonardo Aquino", true, 1991);
        int resultado = 24;
        int resultadoTest = empleado.calcularAnhos();
        assertEquals(resultado, resultadoTest);
    }

}
