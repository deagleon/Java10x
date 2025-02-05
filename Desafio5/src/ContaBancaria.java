public abstract class ContaBancaria implements IConta {
    public double saldo;

    ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    public double consultarSaldo(){
        return this.saldo;
    }
    @Override
    public abstract void depositar(double valor);

    @Override
    public void transferencia(double valor, ContaBancaria contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }
}
