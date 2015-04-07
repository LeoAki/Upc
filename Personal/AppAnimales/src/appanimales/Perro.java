package appanimales;

/**
 *
 * @author Alumnos
 */
public class Perro extends Animal {

    private String pelaje; //Puede ser corto o largo

    public Perro() {
//        super("No define", "NN", 0); en caso el constructor de animal tenga parametros
        this.pelaje = "corto";
    }

    public Perro(String color, String nombre, int edad, String pelaje_) {
        super(color, nombre, edad);
        pelaje_ = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String imprimir() {
        return "Perro: " + super.imprimir() + ", pelaje :" + pelaje;
    }

    @Override
    public String emitirSonido() {
        return "Utaq Guau Guau " + super.emitirSonido();
    }

}
