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
public class GimnasioGims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente c1 = new Cliente(1, "Juan Caro Ruiz");
        c1.registrarPago("enero", "tarjeta", 200);
        c1.registrarPago("febrero", "tarjeta", 200);
        c1.registrarPago("marzo", "efectivo", 200);

        System.out.println("REPORTE DEL SISTEMA");
        c1.countPagoClienteTarjeta();
        c1.mostrarDetalleBoletas();
    }

}
