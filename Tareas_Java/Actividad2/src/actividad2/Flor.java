package actividad2;

/**
 *
 * @author LAquino
 */
public class Flor {

    private String tipo;
    private String color;
    private Integer precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Flor(String tipo, String color, int precio) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

    void juntar(Flor add) {
        Double precio = add.getPrecio();
        this.precio = precio.intValue() + this.precio;
    }

}
