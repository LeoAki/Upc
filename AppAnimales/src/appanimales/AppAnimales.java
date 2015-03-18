/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appanimales;

/**
 *
 * @author Alumnos
 */
public class AppAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal;
        animal = new Animal("White", "Boby", 1);
        System.out.println(animal.imprimir());
        System.out.println(animal.emitirSonido());
        System.out.println(animal.getNombre());

        Perro perro;
        perro = new Perro("White", "Pirulay", 2, "corto");
        System.out.println(perro.imprimir());
        System.out.println(perro.emitirSonido());
        System.out.println(perro.getNombre());

        Pez pez;
        pez = new Pez("Dora", "gris", "De rio", 1);
        System.out.println("\n" + pez.imprimir());
    }

}
