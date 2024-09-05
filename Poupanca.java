public class Poupanca extends ContaAbstrata{
    public Poupanca(String numConta, double saldo, Cliente cliente) {
        super(numConta, saldo, cliente);
    }

    @Override
    public double obterLimite(){
        return getSaldo();
    }
}
