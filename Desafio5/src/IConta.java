public interface IConta {
    double consultarSaldo();
    void depositar(double valor);
    void transferencia(double valor, ContaBancaria contaDestino);
}
