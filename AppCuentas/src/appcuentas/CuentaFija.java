package appcuentas;

public class CuentaFija implements Cuenta {

    private double saldo;
    private int plazo;

    public CuentaFija(double saldo, int plazo) {
        this.saldo = saldo;
        this.plazo = plazo;
    }

    @Override
    public double getsaldo() {
        return saldo;
    }

    public int getPlazo() {
        return plazo;
    }

    @Override
    public double transferir(Cuenta destino, double monto) {
        if (saldo > monto) {
            saldo -= monto;
            plazo++;
            destino.depositar(monto);
        }
        return saldo;
    }

    @Override
    public double depositar(double monto) {
        saldo += monto;
        plazo--;
        return saldo;
    }

}
