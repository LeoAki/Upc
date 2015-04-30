/*
Ingreso e impresión de datos
String
 */
package javaejemplo2;

import java.util.Scanner;
//Biblioteca necesaria para leer desde el teclado

/**
* @author Julio Montalvan
*/
public class JavaEjemplo2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //se crea un objeto Scanner para leer desde teclado
        
        System.out.print("Ingresa tu nombre: ");  //print no inicia una nueva línea
        String nombre = sc.nextLine();  //declaración y asignación de variable
        //con sc.nextLine() el programa espera ingreso de datos desde el teclado hasta un Enter
        
        System.out.print("Ingresa tu edad: ");  //print no inicia una nueva línea
        int edad = sc.nextInt();
        //con sc.nextLine() el programa espera ingreso de un entero desde el teclado hasta un Enter
        edad += 5;  //incrementa la edad en 5
        
        System.out.println("Hola " + nombre);  //imprime una línea nueva
        System.out.println("En 5 años tu edad será " + edad);
        //en la última sentencia edad se convierte implícitamente a String       
    }
    
}
