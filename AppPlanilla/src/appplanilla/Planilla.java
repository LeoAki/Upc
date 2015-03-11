/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appplanilla;

import java.util.ArrayList;

/**
 *
 * @author Alumnos
 */
public class Planilla {

    private String mes;
    private int anho;
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public Planilla(String mes, int anho) {
        this.mes = mes;
        this.anho = anho;
        this.empleados = new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public double calcularGastoTotal() {
        double suma = 0;
        for (Empleado en : empleados) {
            if (en.isTipo()) {
                suma += 1000;
            } else {
                suma += 750;
            }
        }
        return suma;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    
}
