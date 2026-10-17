public class RedSolana implements RedBlockchain {

    @Override
    public void verificarSaldo(String direccionWallet) {
        if (direccionWallet.length() >= 32 &&
                direccionWallet.length() <= 44) {

            System.out.println("Saldo de Solana verificado.");
        } else {
            System.out.println("Direccion Solana invalida.");
        }
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (monto <= 0) {
            System.out.println("Monto invalido.");
            return false;
        }

        System.out.println("Procesando transaccion en Solana...");
        System.out.println("Calculando tarifa de red...");
        System.out.println("Esperando confirmacion de Solana...");
        System.out.println("Transaccion Solana confirmada.");

        return true;
    }
}