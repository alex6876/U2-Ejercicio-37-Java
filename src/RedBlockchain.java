public interface RedBlockchain {

    void verificarSaldo(String direccionWallet);

    boolean ejecutarTransaccion(String origen, String destino, double monto);
}