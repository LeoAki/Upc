package appcuentas;

/**
 *
 * @author LeoAki
 */
public interface Cuenta {

    final double SALDOMIN = 0.0;

    double getsaldo();

    double transferir(Cuenta destino, double monto);

    double depositar(double monto);
}
