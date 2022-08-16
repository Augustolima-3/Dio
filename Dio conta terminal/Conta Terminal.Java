public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        int agencia;
        String nomeDoCliente;
        double saldo = 879.5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da sua conta.");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência.");
        agencia = scanner.nextInt();
        System.out.println("Digite seu nome.");
        nomeDoCliente = scanner.next();


        System.out.println("Olá, " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + ", conta: " + numero + ", e seu saldo: " + saldo + " já está disponível para saque.");

    }
}
