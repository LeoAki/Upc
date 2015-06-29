/*
 * Operadores y expresiones 
 */
package javaejemplo5;

/** 
 * @author Julio Montalvan
 */
public class JavaEjemplo5 {    
    public static void main(String[] args) {

        System.out.println("Operadores y expresiones");
        //+ para sumar números o concatenar cadenas, - para restar y signo negativo
	int b = 2;
	int a = 5 + b;
	System.out.println("\nVariable b: " + b);
        System.out.println("Resultado de suma (5 + b) en variable a: " + a);
        System.out.print("Concatenación de Strings con +: ");
	System.out.println("Historia " + "del " + "Perú");
	int c = a - b;
	System.out.println("Resultado de resta (a - b) en variable c: " + c);
	System.out.println("Negativo de variable c: " + (-c));	
	
	//++ incremento, -- decremento
        int d = 6;
        System.out.println("d: " + d);
        d++;
        System.out.println("Resultado de d++: " + d);        
        d--;
        System.out.println("Resultado de d--: " + d);        
	
	//* producto, / division, % resto de division entera
	int producto = a * b;
        int division = a / 2;
	double div_reales = a / 2.0;
        int resto = a % 2;

        System.out.println("\n* producto, / division (entera y real), % resto de division entera:");
        System.out.println("Resultado de a * b: " + producto);
        System.out.println("Resultado de a / 2: " + division);
	System.out.println("Resultado de a / 2.0: " + div_reales);
        System.out.println("Resultado de a % 2: " + resto);
	
	//Operadores booleanos
	// && = Y lógico, || = O lógico, ! = negación
	
	//Operadores relacionales
	// < menor que, <= menor o igual que 
	// > mayor que, >= mayor o igual que 
	// == igual a, != diferente a  
	
	int x = 3;
        int y = 8;
	int z = 12;
        
        System.out.println("\nOperadores booleanos y relacionales:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("Resultado de x == y: " + (x == y)); //es false
        System.out.println("Resultado de y > x: " + (y > x)); // es true

        System.out.print("(y > x && z > y): ");
        if (y > x && z > y) {
		System.out.println("true, se imprimirá si ambas condiciones son verdaderas"); //se imprime
	}
	else {
		System.out.println("false, no se imprime si alguna o ambas son falsas"); //no se imprime
	}

	System.out.print("(y > x || x > z): ");
        if (y > x || x > z) {
		System.out.println("true, se imprimirá si cualquier condición es verdadera o ambas"); //se imprime
	}
	else {
		System.out.println("false, no se imprimirá si ambas condiciones son falsas"); //se imprime
	}
	
	//Otros ejemplos
        System.out.println("\nOtros ejemplos: ");
	System.out.println("Resultado de 2 != 10: " + (2 != 10));	//true
        System.out.println("Resultado de 2 == 10: " + (2 == 10));	//false
	System.out.println("Resultado de 1 < 4: " + (1 < 4));	//true
        System.out.println("Resultado de 1 >= 4: " + (1 >= 4));	//false
	System.out.println("Resultado de !(1 >= 4): " + (!(1 >= 4)));	//True

	//Operador ternario
	int edad_miguel = 20;
	int edad_jose = 15;

        boolean status_miguel = edad_miguel >= 18 ? true : false;
	boolean status_jose = edad_jose >= 18 ? true : false;

        System.out.println("\nEjemplos con operador ternario: ");
        System.out.println("¿Miguel es adulto?: " + status_miguel);    
        System.out.println("¿José es adulto?: " + status_jose);    
    }
    
}
