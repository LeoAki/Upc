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
public class Placa {

    String placa;
    String tipo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Placa() {
        this.placa = "En trámite";
        this.tipo = "Particular";
    }

    public void imprimirPlaca() {
        System.out.println("Placa: " + this.getPlaca() + " de tipo: " + this.getTipo());
    }

}
