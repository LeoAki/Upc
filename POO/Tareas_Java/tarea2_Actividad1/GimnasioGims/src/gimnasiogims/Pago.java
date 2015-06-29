/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasiogims;

/**
 *
 * @author LAquino
 */
public class Pago {

    private String mes;
    private String tipo;
    private Double monto;

    public Pago(String mes, String tipo, double monto) {
        this.mes = mes;
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void aplicar() {
        if (this.getTipo().equals("tarjeta")) {
            this.monto = this.monto + (this.monto * 0.05);
        }
    }

}
