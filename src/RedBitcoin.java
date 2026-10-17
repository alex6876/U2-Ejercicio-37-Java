public class RedBitcoin implements RedBlockchain {

    @Override
    public void verificarSaldo(String direccionWallet) {
        if (direccionWallet.startsWith("1") ||
                direccionWallet.startsWith("3") ||
                direccionWallet.startsWith("bc1")) {

            System.out.println("Saldo de Bitcoin verificado.");
        } else {
            System.out.println("Direccion Bitcoin invalida.");
        }
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (monto <= 0) {
            System.out.println("Monto invalido.");
            return false;
        }

        System.out.println("Procesando transaccion en Bitcoin...");
        System.out.println("Calculando tarifa de red...");
        System.out.println("Esperando confirmaciones de Bitcoin...");
        System.out.println("Transaccion Bitcoin confirmada.");

        return true;
    }
}