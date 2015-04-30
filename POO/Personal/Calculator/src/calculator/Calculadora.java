/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Alumnos
 */
public class Calculadora {

    private int parametro1;
    private int parametro2;

    public int sumar(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }

    public int restar(int parametro1, int parametro2) {
        return parametro1 - parametro2;
    }

    public int resto(int parametro1, int parametro2) {
        return parametro1 % parametro2;
    }

}
