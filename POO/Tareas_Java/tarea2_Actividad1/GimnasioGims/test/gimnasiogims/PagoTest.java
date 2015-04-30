/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasiogims;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LAquino
 */
public class PagoTest {

//    public PagoTest() {
//    }
//
//    @Test
//    public void testGetMes() {
//    }
//
//    @Test
//    public void testSetMes() {
//    }
//
//    @Test
//    public void testGetTipo() {
//    }
//
//    @Test
//    public void testSetTipo() {
//    }
//
//    @Test
//    public void testGetMonto() {
//    }
//
//    @Test
//    public void testSetMonto() {
//    }
    @Test
    public void testAplicar() {
        Pago p1 = new Pago("enero", "tarjeta", 200);
        Pago p2 = new Pago("febrero", "efectivo", 200);
        p1.aplicar();
        p2.aplicar();
        assertEquals(210, p1.getMonto(), 0.00);
        assertEquals(200, p2.getMonto(), 0.00);
    }

}
