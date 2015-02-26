/*
 * Arrays
 */
package javaejemplo4;

import java.util.Arrays;
//librería necesaria para Arrays

/** 
 * @author Julio Montalvan
 */
public class JavaEjemplo4 {

    public static void main(String[] args) {
        int[] arreglo1 = new int[4];  //se crea un Array de 4 enteros 
        arreglo1[0] = 1;  //el primer elemento tiene índice 0
        arreglo1[1] = 2;
        arreglo1[2] = 3;
        arreglo1[3] = 4;

	System.out.println("Arrays");
        System.out.println("\nElementos del Array arreglo1:");        
	System.out.println(Arrays.toString(arreglo1));	//el método toString imprime una representación de cadena del array
	
	//Otra fora de declarar e inicializar un Array, esta vez con Strings
	String[] arreglo2 = new String[] { "Julio", "José", "Manuel", "María", "Elena"};
	System.out.println("\nElementos del Array arreglo2:");        
        System.out.println(Arrays.toString(arreglo2));
	
	//Acceder a elementos de un array
        System.out.println("\nAcceder a elementos de un Array");
	System.out.println("arreglo1[0]: " + arreglo1[0]);	//imprime 1, conversión implícita a String
        System.out.println("arreglo2[2]: " + arreglo2[2]);	//imprime "Manuel"
	
	//Modificar un elemento
	System.out.println("\nModificar elementos en un Array");
        arreglo2[2] = "Felipe";
	System.out.println("arreglo2[2]" + arreglo2[2]);	//imprime "Felipe"
	
	//Recorrer un Array
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Setiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("\nRecorrer un Array con for:");
        for (int i = 0; i < meses.length; i++) {            
            System.out.println("meses[" + i + "]: " + meses[i]);
        }
        
        //Otra forma de recorrer un Array
        System.out.println("\nOtra forma de recorrer un Array con for:");
	for (String mes : meses) {
            System.out.println(mes);
	}
	
	//Arrays multdimesionales
	int[][] dosdim = new int[][] { {1, 2, 3}, {1, 2, 3} };

        int d1 = dosdim.length;		//determina la longitud del Array externo
        int d2 = dosdim[0].length;	//determina del primer Array interno

        //Para recorrer un Array multidemensional, en este caso dos dimensiones
        System.out.println("\nRecorrer un Array de dos dimensiones:");
	for (int i = 0; i < d1; i++) {            
            for (int j = 0; j < d2; j++) {                
                System.out.println("dosdim[" + i +"][" + j +"]: " + dosdim[i][j]);
            }
        }

	//Métodos para manejo de Arrays
	int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 2, 4, 5, 1};
	
        System.out.println("\nArray a:");
        System.out.println(Arrays.toString(a));
        System.out.println("Array b:");
        System.out.println(Arrays.toString(b));
        
	System.out.println("\nMétodo equals():");        
        if (Arrays.equals(a, b)) {
            System.out.println("Arrays a y b son iguales");
        } else {
            System.out.println("Arrays a y b no son iguales");
        }   
	
	//Método sort para ordenar un Array
	System.out.print("\nArray b, luego de aplicado el método sort():");    
	Arrays.sort(b);
	System.out.println(Arrays.toString(b));
	
	if (Arrays.equals(a, b)) {
	    System.out.println("Arrays a y b son iguales");
	} else {	
	    System.out.println("Arrays a y b no son iguales");
	}
	
	//Método fill() para rellenar un Array con un elemento
	Arrays.fill(a, 8);
	System.out.print("\nArray a, luego de aplicado el método fill(a, 8):");
        System.out.println(Arrays.toString(a));	
	
	//Método copyOf() copia desde un Array un número detemrinado de elementos a otro Array
	int[] c = Arrays.copyOf(a, 3);
	System.out.println("\nArray a");
        System.out.println(Arrays.toString(a));
        System.out.println("Array c, luego de aplicado el método copyOf(a, 3):");
	System.out.println(Arrays.toString(c));
    }    
}