/*
   En este ejemplo revisaremos los tipos de datos primitivos y ...
   Y la sintaxis básica de Java.

   Todo este bloque comentado, no es tomado en cuenta
   por el compilador
 */
package javaejemplo1;  //permite organizar los elementos de un proyecto (comentario de sentencia)
// @author Julio Montalvan (Esta es una línea comentada)

public class JavaEjemplo1 {
//El nombre de las clases empiezan con mayúsculas
    
    public static void main(String[] args) {
    //main es el método donde la ejecución del programa inicia    
    //static es porque puede ser invocado a pesar que no se ha creado una instacia de la clase
    //void porque el metodo no retorna valor
        
      //Declaración de variables, se pueden declarar en cualquier parte antes de usarse
      //Tipos primitivos
      int edad = 35;  //4 bytes
      //variantes de enteros: byte (1 byte), short (2 bytes), long (8 bytes)
      double peso = 68.5;  // real de 8 bytes
      float estatura = 1.67f;  //real de 4 bytes
      char c = 'M';
      boolean soltero = false;
      
      //Tipo de dato String (ojo: S mayúscula)
      String nombre = "Julio";
      String profesion = null;
      
      //Declaracion de constante
      final String NACIO_EN = "Trujillo";

      System.out.println("** Datos personales **");  //imprime un String en una línea
      //println: método de la clase System
      
      System.out.print("Mi nombre es "); //imprime sin salto de línea
      System.out.println(nombre); //imprime con salto de línea
      System.out.println("Tengo " + edad + " años"); //+ se usa para concatenar

      if (soltero) {                        //condicional if else
        System.out.println("Soy soltero");  
      } else {
          System.out.println("Soy casado");
      }

      System.out.println("Mi profesión es " + profesion);
      System.out.println("Nacido en " + NACIO_EN);
      System.out.println("Mi peso es " + peso + "Kg.");
      System.out.println("Mi estatura es " + estatura);
      System.out.println("Mi apellido inicia con " + c);
    }
    
}
