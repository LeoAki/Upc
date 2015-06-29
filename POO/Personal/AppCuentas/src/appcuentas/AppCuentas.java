/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcuentas;

/**
 *
 * @author Alumnos
 */
public class AppCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1;
        Cuenta cuenta2;
        Cuenta cuenta3;

        cuenta1 = new CuentaAhorros(200.0);
        cuenta2 = new CuentaAhorros(100.0);
        cuenta3 = new CuentaFija(150.0, 6);

        System.out.println("Saldo cuenta1 luego de transferir 20 a la cuenta3");
        System.out.println(cuenta1.transferir(cuenta3, 20.0));
        
        System.out.println("Saldo cuenta2 luego de depositarle 50");
        System.out.println(cuenta2.depositar(50));
        
        System.out.println("Saldo cuenta3 luego de recibir 20 de la cuenta1");
        System.out.println(cuenta1.transferir(cuenta3, 20));
        System.out.println(cuenta3.getsaldo());
        System.out.println(cuenta3.getClass());
    }

}
