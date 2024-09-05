public class BancoItau implements IBancoGeral {

    @Override
    public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
        ContaAbstrata conta = null;
        if (tipo.equalsIgnoreCase("Poupanca")) {
            conta = new Poupanca(numeroConta, saldoInicial, c);
        } else if (tipo.equalsIgnoreCase("Corrente")) {
            double limiteChequeEspecial = 500;
            conta = new ContaCorrente(numeroConta, saldoInicial, c, limiteChequeEspecial);
        } else {
            throw new IllegalArgumentException("Tipo de conta inválido.");
        }
        return conta;
    }

    @Override
    public boolean depositar(ContaAbstrata c, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser positivo.");
            return false;
        }
        c.depositar(valor);
        return true;
    }

    @Override
    public boolean sacar(ContaAbstrata c, double valor) {
        if (c.getSaldo() > valor){
            c.sacar(valor);
            return true;
        }
        return false;
    }
}
