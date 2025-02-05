public class ContaPoupanca extends ContaBancaria{
    private TipoConta tipoConta;
    private double taxaDeposito;

    ContaPoupanca(double saldo){
        super(saldo);
        this.taxaDeposito = 0.01; //1% de taxa
    }

    ContaPoupanca(double saldo, TipoConta tipoConta){
        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor * (1 - taxaDeposito);
    }

}
