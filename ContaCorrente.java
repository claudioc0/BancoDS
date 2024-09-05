public class ContaCorrente extends ContaAbstrata {
    private double limiteChequeEspecial;

    public ContaCorrente(String numConta, double saldo, Cliente cliente, double limiteChequeEspecial) {
        super(numConta, saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double obterLimite() {
        return getSaldo() + limiteChequeEspecial; // Limite é o saldo mais o limite do cheque especial
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
