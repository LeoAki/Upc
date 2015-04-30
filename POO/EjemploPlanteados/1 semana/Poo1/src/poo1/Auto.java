

package poo1;

/**
 *
 * @author Alumnos
 */
public class Auto {
    private int velocidad;
    private int numero_puertas;
    private String color;
    
    Auto(){
        this.velocidad = 80;
        this.numero_puertas = 4;
        this.color = "Negro";
    }
    
    Auto(int velocidad, int numero_puertas, String color){
        this.velocidad = velocidad;
        this.numero_puertas = numero_puertas;        
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void acelerar(int incremento) {
        this.velocidad = this.velocidad + incremento;
    }
    
    public void imprimirAuto() {
        //Este método imprime todos los valores actuales del auto
        System.out.println("\nDatos del auto:");
        System.out.println("Color: " + this.color);
        System.out.println("Número de puertos: " + this.numero_puertas);
        System.out.println("Velocidad: " + this.velocidad);
    }
    
}
