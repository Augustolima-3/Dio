public class Main {
    public static void main(String[] args) {
        Cliente augusto = new Cliente();
        augusto.setNome("Augusto");

        Conta cc = new ContaCorrente(augusto);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(augusto);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
