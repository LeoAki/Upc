package appanimales;

public class Pez extends Animal {

    private String tipo;//De rìo , de mar

    public Pez(String tipo) {
        this.tipo = tipo;
    }

    public Pez(String tipo, String color, String nombre, int edad) {
        super(color, nombre, edad);
        this.tipo = tipo;
    }

    @Override
    public String imprimir() {
        return "Pez: " + super.imprimir() + ", tipo" + tipo;
    }

}
