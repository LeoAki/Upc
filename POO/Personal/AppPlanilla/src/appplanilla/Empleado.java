package appplanilla;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alumnos
 */
public class Empleado {

    private String DNI;
    private String nombre;
    private boolean tipo;
    private int anio_nac;

    public Empleado(String DNI, String nombre, boolean tipo, int anio_nac) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.tipo = tipo;
        this.anio_nac = anio_nac;
    }

    public int calcularAnhos() {
        Calendar cal = new GregorianCalendar();
        return cal.get(Calendar.YEAR) - this.anio_nac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getAnio_nac() {
        return anio_nac;
    }

    public void setAnio_nac(int anio_nac) {
        this.anio_nac = anio_nac;
    }
    
    

}
