public interface IConta {
    default void deposito(double valor){}
    default void saque(double valor) {}
    default void transferir(double valor, Conta contaDestino) {}
}
