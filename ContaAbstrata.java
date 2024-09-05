public abstract class ContaAbstrata {
    private String numConta;
    private double saldo;
    private Cliente cliente;

    public ContaAbstrata(String numConta, double saldo, Cliente cliente) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public abstract double obterLimite();

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Saldo após depósito: %.2f%n", saldo);
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.printf("Saldo após saque: %.2f%n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
