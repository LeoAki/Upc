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
public class TorturaNinja extends Ninja {

    private String grito;
    private int potenciaAtaque;

    public TorturaNinja() {
        grito = super.getGritoDeGuerra() + ", Tortuninja RAP";
        potenciaAtaque = super.getPotenciaAtaque() + 20;
    }

    @Override
    public String imprimirGuerrero() {
        return super.imprimirGuerrero() + grito;
    }

}
