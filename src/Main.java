public class Main {

    public static void main(String[] args) {

        RedBlockchain red;

        red = new RedBitcoin();

        red.verificarSaldo("bc1qejemplo");
        red.ejecutarTransaccion("bc1origen", "bc1destino", 0.5);

        System.out.println("--------------------");

        red = new RedEthereum();

        red.verificarSaldo("0x123456789");
        red.ejecutarTransaccion("0xorigen", "0xdestino", 2);

        System.out.println("--------------------");

        red = new RedSolana();

        red.verificarSaldo("12345678901234567890123456789012");
        red.ejecutarTransaccion("origen", "destino", 10);
    }
}