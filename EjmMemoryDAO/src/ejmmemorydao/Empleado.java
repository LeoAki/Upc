package ejmmemorydao;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    
    private int id;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private float sueldo;
    
    //emulamos la grabación a una BD con un array
    private static Empleado[] empleadoArray = new Empleado[10];
    
    public Empleado(int id, String nombres, String apellidos, String fechaNacimiento, float sueldo){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public static Empleado[] getEmpleadoArray() {
        return empleadoArray;
    }

    public static void setEmpleadoArray(Empleado[] empleadoArray) {
        Empleado.empleadoArray = empleadoArray;
    }
    
    @Override
    public String toString(){
            return "Empleado ID:   " + getId() + "\n"
                + "Nombre Empleado: " + getNombres() + " " + getApellidos()+ "\n"
                + "Fecha Nacimiento:    " + getFechaNacimiento() + "\n"
                + "Sueldo:        " + getSueldo();
    }
    
    //Métodos de persistencia
    
    //Guardar registro en BD
    public void save(){
        empleadoArray[id] = this;        
    }
    
    //Eliminar este registro de la BD
    public void delete(){
        empleadoArray[id] = null;
    }
    
    //Buscar un empleado en la BD usando este ID
    public static Empleado findById(int id){
        return empleadoArray[id];
    }
    
    //Retorna un array de todos los registro de Empleado
    //usamos un objeto Collection List para almacenar los empleados
    //esto hace más fácil agregarlos a la colección
    public static Empleado[] getAllEmpleados() {
        List<Empleado> emps = new ArrayList<>();
        //recorremos en array y hallamos los no nulos
        for(Empleado e: empleadoArray){
            if(e!=null){
                emps.add(e);
            }
        }
        return emps.toArray(new Empleado[0]);        
    }    
}
