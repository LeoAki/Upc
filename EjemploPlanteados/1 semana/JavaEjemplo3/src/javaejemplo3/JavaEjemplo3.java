/*
 *Strings
 * Comparación y métdos
*/
package javaejemplo3;

/**
 * @author Julio Montalvan
 */
public class JavaEjemplo3 {
    
    public static void main(String[] args) {
        
        char[] c_ciudad = {'L', 'i', 'm', 'a'};

        String nombre = "Jorge";
        String apellido = new String("La Torre");
        String ciudad = new String(c_ciudad);   //Genera un objeto String a partir de un arrayde caracteres
        String profesion = "";

        System.out.println("Manejo de Strings");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ciudad: " + ciudad);
        	
        System.out.println("Longitud de nombre: " + nombre.length());
	if (profesion.isEmpty()) {
		System.out.println("profesion es una cadena vacía");	
	} else {
		System.out.println("profesion no es una cadena vacía");
	}

	String apellido2 = apellido.replace('T', 't');  //método replace
        System.out.println("Apellido despúes de usar replace (T por t): " + apellido2);	
	
	System.out.println("\nConcatenación:");	
	String nombrecompleto = nombre + " " + apellido; //usando el operador + 
	String nombrecompleto2 = nombre.concat(" ").concat(apellido2);
	System.out.println("nombrecompleto = " + nombrecompleto + "(se usó operador +).");
	System.out.println("nombrecompleto2 = " + nombrecompleto2 + "(se usó concat).");

	//Comparación de cadenas
	System.out.println("\nComparación de cadenas:");	
        String cadena1 = "Ejemplo";
	String cadena2 = "Ejemplo";
	System.out.println("cadena1: " +cadena1);
	System.out.println("cadena2: " +cadena2);
	System.out.println("\nComparación de cadena1 y cadena2 con == :");
	if (cadena1 == cadena2) {
		System.out.println("Resultado true, al usar == para comparar las dos cadenas");
	} else {
		System.out.println("Resultado false, al usar == para comparar las dos cadenas");
	}
	//el resultado es true porque cadena1 y cadena2 están apuntando al mismo espacio de memoria

	String cadena3 = new String("Ejemplo");
	System.out.println("\ncadena3: " + cadena3);
	System.out.println("Comparación de cadena1 y cadena3 con == :");
	if (cadena1 == cadena3) {
		System.out.println("Resultado true, al usar == para comparar las dos cadenas");
	} else {
		System.out.println("Resultado false, al usar == para comparar las dos cadenas");
	}
	//el resultado es false porque cadena3 no está apuntando al mismo espacio de memoria que cadena1 y cadena2
	//se creó un nuevo objeto
        System.out.println("NO se debe usar el operador == para comparar cadenas (String)");

	//NO se debe usar el operador == para comparar cadenas (String)
	//se debe usar el método equals
	System.out.println("\nComparación de cadena1 y cadena3 con equals ");
	if (cadena1.equals(cadena3)) {
		System.out.println("Resultado true, al usar equals para comparar las dos cadenas");
	} else {
		System.out.println("Resultado false, al usar equals para comparar las dos cadenas");
	}	
	
	String cadena4 = "ejemplo";
	System.out.println("\ncadena4: " + cadena4);
	System.out.println("Comparación de cadena1 y cadena4 con equals: ");
	System.out.println(cadena1.equals(cadena4));	//false
	//La comparación de cadena es Case Sensitive (mayúsculas son diferentes de minúsculas)

	System.out.println("\nComparación de cadena1 y cadena4 con equalsIgnoreCase: ");
	System.out.println(cadena1.equalsIgnoreCase(cadena4));	//true: el método equalsIgnoreCase compara cadenas 
								//ignorando diferencias entre mayusculas y minusculas  
		
	System.out.println("\nElementos de un String cadena4: ejemplo");
	char c1 = cadena4.charAt(0);
        char c2 = cadena4.charAt(cadena4.length()-1);
        
	System.out.println("Primer caracter (0) y último caracter (length()-1) de cadena4: ejemplo");
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("\nIndice de caracteres :");
	int i1 = cadena4.indexOf('e');
        int i2 = cadena4.lastIndexOf('e');
        
        System.out.println("El primer índice del caracter e es " + i1);
        System.out.println("El último índice del caracter e es " + i2);
        
        System.out.println("\nUso de método contains :");
        System.out.println("¿Contiene j?");
        System.out.println(cadena4.contains("j")); //true
        System.out.println("¿Contiene a?");
        System.out.println(cadena4.contains("a")); //false
        
        char[] caracteres = cadena4.toCharArray(); //toCharArray: Convierte un String en un Array de caracteres
        System.out.println("\nArray de los caracteres que componen la cadena con método toCharArray:");
        for (char c : caracteres) {            
            System.out.println(c);
        }  	
    }
    
}
