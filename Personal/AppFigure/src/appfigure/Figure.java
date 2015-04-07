/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfigure;

/**
 *
 * @author Alumnos
 */
public abstract class Figure {

    protected String color;
    protected int x;
    protected int y;

    public Figure(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    //Si a esta funcion le agrego final, no se podrà modificar la funcion de las clases hijos
    public String imprimirfigura() {
        return "Figura de color: " + color + " que inicia en (" + x + "," + y + ")";
    }

    abstract double calcularArea();

    abstract String imprimirDetalles();

}
