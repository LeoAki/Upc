/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasiogims;

import java.util.ArrayList;

/**
 *
 * @author LAquino
 */
public class Cliente {

    private Integer codigo;
    private String nombre;
    private ArrayList<Pago> pago;

    public Cliente(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pago = new ArrayList<Pago>();
    }

    //Registra el pago de una boleta
    public void registrarPago(String mes, String tipo, double monto) {
        Pago pagos = new Pago(mes, tipo, monto);
        pagos.aplicar();//Aplicar descuento si pagas con tarjeta
        this.pago.add(pagos);
    }

    //Cuenta la cantidad de pagos de un cliente
    public void countPagoClienteTarjeta() {
        Integer pagotarjeta = 0;
        Integer pagos = 0;
        for (Pago p : pago) {
            pagos += 1;
            if (p.getTipo().equals("tarjeta")) {
                pagotarjeta += 1;
            }
        }
        System.out.println("Cliente: " + nombre + "\nCantidad de pagos: " + pagos + " pago(s)\nPagos realizados con tarjetas: " + pagotarjeta + " pago(s)");

    }

    public void mostrarDetalleBoletas() {
        System.out.println("Boletas generadas:");
        Integer count = 1;
        for (Pago p : pago) {
            System.out.println(count + ". El mes de " + p.getMes() + " pagaste con " + p.getTipo() + ", el monto fue de " + p.getMonto() + " nuevos soles");
            count += 1;
        }
    }

}
