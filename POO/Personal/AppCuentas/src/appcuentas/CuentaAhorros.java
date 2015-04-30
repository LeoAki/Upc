package appcuentas;

public class CuentaAhorros implements Cuenta {

    private double saldo;

    public CuentaAhorros(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getsaldo() {
        return saldo;
    }

    @Override
    public double transferir(Cuenta destino, double monto) {
        if (saldo > monto) {
            saldo -= monto;
            destino.depositar(monto);
        }
        return saldo;
    }

    @Override
    public double depositar(double monto) {
        saldo += monto;
        return monto;
    }

}
