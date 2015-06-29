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
public class Auto {

    private int numero_puertas;
    private int velocidad;
    private String color;
    private Placa placa;

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    public Auto(int numero_puertas, int velocidad, String color) {
        this.numero_puertas = numero_puertas;
        this.velocidad = velocidad;
        this.color = color;
        this.placa = new Placa();
    }

    public void imprimirAuto() {
        System.out.println("\nDatos de auto: ");
        System.out.println("Placa " + this.placa.getPlaca() + ", de tipo: " + this.placa.getTipo());
        System.out.println("Color " + this.getColor());
    }

}
