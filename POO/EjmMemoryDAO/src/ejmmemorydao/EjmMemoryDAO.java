package ejmmemorydao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjmMemoryDAO {

    public static void main(String[] args) throws IOException {
                
        boolean salir = false;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do {
            salir = executeMenu(entrada);
        } while (!salir);
    }
    
    public static boolean executeMenu(BufferedReader entrada) throws IOException{
    
        Empleado emp;
        String accion;
        int id;

        System.out.println("\n\n[C]reate | [R]ead | [U]pdate | [D]elete | [L]ist | [Q]uit: ");
        accion = entrada.readLine();
        if ((accion.length() == 0) || accion.toUpperCase().charAt(0) == 'Q') {
            return true;
        }

        switch (accion.toUpperCase().charAt(0)) {
            // Crear un nuevo registro de empleado
            case 'C':
                emp = ingresaDatosEmpleado(entrada, null, true);
                emp.save();
                System.out.println("Empleado : " + emp.getId() + " registrado satisfactoriamente");
                System.out.println("\n\nCreado " + emp);
                break;

            // Display an employee record
            case 'R':
                System.out.println("Ingrese un valor entero para el id de empleado: ");
                id = new Integer(entrada.readLine().trim());

                // Find this Employee record
                emp = Empleado.findById(id);
                if (emp != null) {
                    System.out.println(emp + "\n");
                } else {
                    System.out.println("\n\nEmpleado " + id + " no encontrado");
                    break;
                }
                break;

            // Update an existing employee record    
            case 'U':
                System.out.println("Ingrese un valor entero para id de empleado: ");
                id = new Integer(entrada.readLine().trim());
                // Find this Employee record
                emp = null;
                emp = Empleado.findById(id);
                if (emp == null) {
                    System.out.println("\n\nEmpleado " + id + " no encontrado");
                    break;
                }
                // Go through the record to allow changes

                emp = ingresaDatosEmpleado(entrada, emp, false);
                emp.save();
                System.out.println("Empleado: " + emp.getId() + " modificado satisfactoriamente");
                break;

            // Delete an employee record
            case 'D':
                System.out.println("Ingrese un valor entero para employee id: ");
                id = new Integer(entrada.readLine().trim());

                // Find this Employee record                 
                emp = null;
                emp = Empleado.findById(id);
                if (emp == null) {
                    System.out.println("\n\nEmpleado " + id + " no encontrado");
                    break;
                }
                emp.delete();
                System.out.println("Empleado eliminado " + id);
                break;

            // Display a list (Read the records) of Employees
            case 'L':
                Empleado[] allEmps = Empleado.getAllEmpleados();
                for (Empleado employee : allEmps) {
                    System.out.println(employee + "\n");
                }
                break;
        }
        return false;
    
    }
    
    public static Empleado ingresaDatosEmpleado(BufferedReader in, Empleado empDefaults, boolean nuevoEmpleado) throws IOException{
        int id = -1;
        String nombres;
        String apellidos;
        String fechaNacimiento = null;
        Empleado emp;
        float salario;
        
        if (nuevoEmpleado){
            System.out.println("Ingrese valor entero para id de empleado: ");
            id = new Integer(in.readLine().trim());
        } else {
            id = empDefaults.getId();
            System.out.println("Modifique los campos del registro Empleado: " + id
                    + ". Presione return para aceptar el valor actual.");
        }
        
        String prompt = "Ingrese el valor para el nombre" + ((empDefaults == null) ? "" : " [" + empDefaults.getNombres()+ "]");
        System.out.println(prompt + " : ");
        nombres = in.readLine().trim();
        if (nombres.equals("") && empDefaults != null) {
            nombres = empDefaults.getNombres();
        }

        prompt = "Ingrese valor para apellidos" + ((empDefaults == null) ? "" : " [" + empDefaults.getApellidos()+ "]");
        System.out.println(prompt + " : ");
        apellidos = in.readLine().trim();
        if (apellidos.equals("") && empDefaults != null) {
            apellidos = empDefaults.getApellidos();
        }
        
        prompt = "Ingrese un valor válido para fecha de nacimiento" + ((empDefaults == null) ? "" : " [" + empDefaults.getFechaNacimiento()+ "]");
        System.out.println(prompt + " : ");
        fechaNacimiento = in.readLine().trim();
        if (fechaNacimiento.equals("") && empDefaults != null) {
            fechaNacimiento = empDefaults.getFechaNacimiento();
        }
        
        prompt = "Ingrese sueldo del empleado" + ((empDefaults == null) ? "" : " [" + empDefaults.getSueldo()+ "]");       
        System.out.println(prompt + " : ");
        salario = 0;
        String monto = in.readLine().trim();        
        if (monto.equals("") && empDefaults != null) {
            salario = empDefaults.getSueldo();                    
        } else {
            salario = Float.parseFloat(monto);        
        }
               
        // Create an Employee object        
        emp = new Empleado(id, nombres, apellidos, fechaNacimiento, salario);
        return emp;      
    }
}

