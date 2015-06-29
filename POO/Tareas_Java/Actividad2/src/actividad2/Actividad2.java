/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author LAquino
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = 20;

        Flor f1 = new Flor("Violeta", "azul", 30);

        Flor f2 = new Flor("Rosa", "roja", 40);

        System.out.println("Hay una " + f2.getTipo() + " de  color:"
                + f2.getColor());

        System.out.println("y cada una cuesta: " + f1.getPrecio() + " y "
                + f2.getPrecio());

        f1.juntar(f2);

        System.out.println("Combinados en un ramo cuestan: " + f1.getPrecio());
    }

}
