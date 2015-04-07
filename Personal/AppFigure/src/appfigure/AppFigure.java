/*
 * poliformismo siempre y cuando exista herencia y abstracto
 * clases abstractas!
 */
package appfigure;

/**
 *
 * @author Alumnos
 */
public class AppFigure {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        Figure[] listaDeFigure; //Como buena practica hereda de la clase superior
        listaDeFigure = new Figure[3];
        listaDeFigure[0] = new triangle("Pink", 0, 1, 3, 2);
        System.out.println(listaDeFigure[0].imprimirfigura());
        System.out.println(listaDeFigure[0].imprimirDetalles());

        listaDeFigure[1] = new Cuadrado("Red", 1, 2, 5);
        listaDeFigure[2] = new triangle("amarillo", 3, 3, 2, 1);
        System.out.println("\nRecorrido del Array");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " . " + listaDeFigure[0].imprimirfigura());
            System.out.println(i + " . " + listaDeFigure[0].imprimirDetalles());
        }
    }

}
