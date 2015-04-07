package appanimales;

/**
 *
 * @author Leoaki
 */
public class Animal {

    //protected => Un atributo protected significa que las clases hijas pueden leer y modificar sus atributos
    protected String color;
    protected String nombre;
    private int edad;

    //La sobrecarga es el concepto en donde defino varias funciones pero con diferentes parámetros
    public Animal() {
        this.color = "No definido";
        this.nombre = "Mechita";
        this.edad = 0;
    }

    public Animal(String color, String nombre, int edad) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String imprimir() {
        return "Nombre: " + nombre + " de color " + color + " de edad:" + edad;
    }

    public String emitirSonido() {
        return "Sin sonido definido";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
