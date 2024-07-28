public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 1300;

    //construtores
    public ContaPoupanca(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.tipo = "Conta Poupança";
    }

    public ContaPoupanca(Cliente cliente, int agencia) {
        super.tipo = "Conta Poupança";
        this.agencia = agencia;
        this.cliente = cliente;
    }
}
