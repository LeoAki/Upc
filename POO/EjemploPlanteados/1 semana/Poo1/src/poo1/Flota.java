/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alumnos
 */
public class Flota {

    private ArrayList<Auto> flota;

    public Flota() {
        this.flota = new ArrayList<Auto>();
    }

    public void agregar_autos(Auto auto) {
        this.flota.add(auto);
    }

    public void imprimir_flota() {
        Iterator<Auto> it = this.flota.iterator();//Iterador recorre un array
        while (it.hasNext()) { //Pregunta si hay datos
            Auto a = it.next();
            a.imprimirAuto();
        }
    }
}
