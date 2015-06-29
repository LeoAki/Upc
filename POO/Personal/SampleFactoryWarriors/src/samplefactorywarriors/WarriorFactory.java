/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplefactorywarriors;

/**
 *
 * @author Alumnos
 */
public class WarriorFactory {
    //Fabrica de objetos

    public static Warrior crearGuerrero(String tipo) {//STATIC: Es un atributo o metodo que no requiere que el objeto sea instanciado
        if (tipo.equalsIgnoreCase("Ninja")) {
            return new Ninja();
        }
        if (tipo.equalsIgnoreCase("Samurai")) {
            return new Ninja();
        }
        if (tipo.equalsIgnoreCase("TortuNinja")) {
            return new TorturaNinja();
        }
        return null;
    }

}
