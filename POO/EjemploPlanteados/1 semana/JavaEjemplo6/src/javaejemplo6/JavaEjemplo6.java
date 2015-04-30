/*
 * Condicionales y bucles 
 */
package javaejemplo6;

import java.util.Random;
import java.util.Scanner;
//librerías necesarias para obtener aleatorios e ingreso por teclado

/** 
 * @author Julio Montalvan
 */
public class JavaEjemplo6 {

    public static void main(String[] args) {
        System.out.println("Condicioanles y bucles");
        System.out.println("\nEjemplo: if - else");	
	Random r = new Random();        
        int numero = r.nextInt();
        if (numero > 0) {            
            System.out.println("Número positivo: " + numero);            
        } else {           //en caso sólo se quiera ejecutar si es true, omitir el bloque else
            System.out.println("Número negativo: " + numero);
        }
	
	System.out.println("\nOtro ejemplo: if else if");
	System.out.print("Ingrese un entero (negativo, positivo o cero):");
        Scanner sc = new Scanner(System.in);
        int numero2 = sc.nextInt();
        if (numero2 < 0) {            
            System.out.println("Entero negativo");
        } else if (numero2 == 0) {            
            System.out.println("Entero igual a cero");            
        } else {            
            System.out.println("Entero positivo");
        }	
	
	System.out.println("\nEjemplo switch");
	System.out.println("Ingrese su estado civil (s = soltero, c = casado, d = divorciado, v = viudo: ");
        Scanner sc2 = new Scanner(System.in);
        String estado = sc2.nextLine();
        estado = estado.trim().toLowerCase();	//trim() elimina espacios en blanco, toLowerCase() pasa a minuscula.

        switch (estado) {
            case "s":
                System.out.println("Soltero, ¿cuándo te casas?");
                break;

            case "c":
                System.out.println("Casado, ¿y ahora?");
                break;

            case "d":
                System.out.println("Divorciado, ¿cómo te escapaste?");
                break;

            case "v":
                System.out.println("Viudo, mi más sentido pésame");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
	
	//while	
	System.out.println("\nEjemplo while: impresión de números pares hasta 10");	
	int cuenta = 1;
        while (cuenta <= 10) {            
		if (cuenta % 2 == 0) {
			System.out.println(cuenta);			
		}
                cuenta++;
        }
	
	//do while: se ejecuta al menos una vez
	cuenta = 10;
	System.out.println("\nEjemplo do while: contador en reversa de 10 a 1");	
	do {
            System.out.println(cuenta);
            cuenta--;
        } while (cuenta != 0);

	//for
	System.out.println("\nEjemplo for: contador de 0 a 10"); 
	for (int i = 0; i <= 10; i++) {            
            System.out.println(i);
        }
	
        //for usado para recorrer un Array
	System.out.println("\nEjemplo for: recorrido de Array de días útiles"); 
	String[] diasutiles = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for (int i = 0; i < diasutiles.length; i++) {            
            System.out.println(diasutiles[i]);
        }
	
	System.out.println("\nEjemplo for: otra forma de recorrido del Array"); 
	for (String dia : diasutiles) {            
            System.out.println(dia);
        }
		
	//break permite salir de un bucle
	//continue aborta la iteración y pasa a la  siguiente
	System.out.println("\nUso de break y continue: bucle se ejecuta 10 veces, a menos que se ingrese 0");
	System.out.println("Si ingresa un múltiplo de 3 no se considera como iteración y no se imprime");
	cuenta = 0;
        do {
		System.out.print("Ingresa un entero:");
	        Scanner sc3 = new Scanner(System.in);
		int numero3 = sc3.nextInt();            
		if (numero3 == 0) {
			System.out.println("Saliste del bucle.");
                        break;  //sale del bucle antes de completar las 10 iteraciones
		} else if (numero3 % 3 == 0) {
			continue;  //no imprime si se ingresa un múltiplo de 3, aborta esta iteración
		} else {
			System.out.print(numero3);  //en cualquier otro caso imprime
		}                
                System.out.println(": Iteración " + (++cuenta));
        } while (cuenta < 10);
    }
    
}
