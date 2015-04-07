
import appplanilla.Empleado;
import appplanilla.Planilla;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumnos
 */
public class TestPlanilla {

    public TestPlanilla() {
    }

    @Test
    public void testCalcularGAstoTotal() {
        Empleado empleado1, empleado2, empleado3;
        empleado1 = new Empleado("70756256", "Leonardo Aquino", true, 1965);
        empleado2 = new Empleado("70756257", "Yasmina Segura", false, 1975);
        empleado3 = new Empleado("80756256", "Yanira Murrieta", true, 1985);

        Planilla planilla1 = new Planilla("Ene", 2015);
        planilla1.agregarEmpleado(empleado1);
        planilla1.agregarEmpleado(empleado2);
        planilla1.agregarEmpleado(empleado3);

        double resultadoEsperado = 2750.0;
        double resultadoActual = planilla1.calcularGastoTotal();
        assertEquals(resultadoEsperado, resultadoActual, 0.00);

    }

}
