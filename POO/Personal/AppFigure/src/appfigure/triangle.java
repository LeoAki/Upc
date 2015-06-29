package appfigure;

public class triangle extends Figure {

    private int altura;
    private int base;

    public triangle(String color, int x, int y, int altura, int base) {
        super(color, x, y);
        this.altura = altura;
        this.base = base;
    }

    @Override
    double calcularArea() {
        return ((base * altura) / 2);
    }

    @Override
    String imprimirDetalles() {
        return "Triangulo de base " + base + " y altura " + altura;
    }

    @Override
    public String imprimirfigura() {
        return "Triangle";
    }
}
