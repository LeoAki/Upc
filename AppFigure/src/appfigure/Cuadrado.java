package appfigure;

public class Cuadrado extends Figure {

    protected int lado;

    public Cuadrado(String color, int x, int y, int lado) {
        super(color, x, y);
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    String imprimirDetalles() {
        return "Cuadrado de color " + color + " de lado " + lado;
    }

}
