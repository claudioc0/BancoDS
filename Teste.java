public class Teste {
    public static void main(String[] args) {
        IBancoGeral banco = new BancoItau();

        Cliente cliente = new Cliente("João Silva", "123.456.789-00");

        ContaAbstrata poupanca = banco.abrirConta(cliente, "001", 1000.0, "Poupanca");
        System.out.println("Conta Poupança criada:");
        System.out.println("Número da Conta: " + poupanca.getNumConta());
        System.out.println("Saldo Inicial: " + poupanca.getSaldo());
        System.out.println("Limite da Conta: " + poupanca.obterLimite());

        ContaAbstrata corrente = banco.abrirConta(cliente, "002", 2000.0, "Corrente");
        System.out.println("\nConta Corrente criada:");
        System.out.println("Número da Conta: " + corrente.getNumConta());
        System.out.println("Saldo Inicial: " + corrente.getSaldo());
        System.out.println("Limite da Conta: " + corrente.obterLimite());
        
        banco.depositar(poupanca, 500.0);
        banco.sacar(corrente, 2500.0);

        System.out.println("\nSaldo final das contas:");
        System.out.println("Saldo Poupança: " + poupanca.getSaldo());
        System.out.println("Saldo Corrente: " + corrente.getSaldo());
    }
}
