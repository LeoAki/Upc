package poo1;

import java.util.Set;

public class Poo1 {
    //Agregación

    public static void main(String[] args) {
        Auto a1;
        Auto a2;

        a1 = new Auto();
        a2 = new Auto(100, 5, "Rojo");

        //Podemos acceder a los datos de velocidad de cada auto a través
        //de los métodos get
        System.out.println("Velocidad Auto 1 = " + a1.getVelocidad());
        System.out.println("Velocidad Auto 2 = " + a2.getVelocidad());

        //Imprimimos todos los datos del auto 1
        a1.imprimirAuto();

        //usamos el método acelerar para incrementar en 30 Km/h su velocidad
        a1.acelerar(30);

        //cambiamos el color del auto 1 con el método setColor
        a1.setColor("Gris");

        //Volvemos a imprimir los datos del auto 1
        System.out.println("\nAuto 1 luego de acelerar en 30 Km/h y cambiar el color");
        a1.imprimirAuto();

        System.out.println("\nUso de FLOTA");
        Flota flota1;
        flota1 = new Flota();

        flota1.agregar_autos(a1);
        flota1.agregar_autos(a2);
        flota1.imprimir_flota();

    }

}
