/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author Alumnos
 */
public class Poo2 {
//Composición
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto(2, 100, "rojo");
        Auto a2 = new Auto(2, 100, "azul");
        Placa p1 = new Placa();
        Placa p2 = new Placa();

        a1.imprimirAuto();
        p1 = a1.getPlaca();
        p1.setPlaca("AAA-111");
        p1.setTipo("Militar");
        a1.imprimirAuto();

        a2 = null;//Destruir el objeto
        p2 = a2.getPlaca();

    }

}
