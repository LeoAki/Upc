/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumnos
 */
public class TestCalculator {

    public TestCalculator() {
    }

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 7;
        int resultadoActual = calculadora.sumar(5, 2);
        assertEquals(resultadoesperado, resultadoActual);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 4;
        int resultadoActual = calculadora.restar(10, 6);
        assertEquals(resultadoesperado, resultadoActual);
    }

    @Test
    public void testResto() {
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 2;
        int resultadoActual = calculadora.resto(14, 4);
        assertEquals(resultadoesperado, resultadoActual);
    }

}
