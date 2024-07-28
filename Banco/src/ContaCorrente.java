public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1000;

    //construtores
    public ContaCorrente(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
        super.tipo = "Conta Corrente";
    }

    public ContaCorrente(Cliente cliente,int agencia) {
        super.tipo = "Conta Corrente";
        this.agencia = agencia;
        this.cliente = cliente;
    }
}
