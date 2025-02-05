public class ContaCorrente extends ContaBancaria{
    private TipoConta tipoConta;
    ContaCorrente(double saldo) {
        super(saldo);
    }

    ContaCorrente(double saldo, TipoConta tipoConta){
        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
