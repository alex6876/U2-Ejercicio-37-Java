public class RedEthereum implements RedBlockchain {

    @Override
    public void verificarSaldo(String direccionWallet) {
        if (direccionWallet.startsWith("0x")) {
            System.out.println("Saldo de Ethereum verificado.");
        } else {
            System.out.println("Direccion Ethereum invalida.");
        }
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (monto <= 0) {
            System.out.println("Monto invalido.");
            return false;
        }

        System.out.println("Procesando transaccion en Ethereum...");
        System.out.println("Calculando gas...");
        System.out.println("Esperando confirmaciones de Ethereum...");
        System.out.println("Transaccion Ethereum confirmada.");

        return true;
    }
}