public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 3063;
    protected int agencia;
    protected int numero;
    protected String tipo;
    protected double saldo =0;
    protected Cliente cliente;

    //construtor padrão
    public Conta() {
    }

    //get and sets
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //métodos
    @Override
    public void deposito(double valor) {
        //IConta.super.deposito(valor);
        saldo += valor;
        System.out.println("Depósito realizado na conta " + this.numero + "realizado com sucesso.");
    }

    @Override
    public void saque(double valor) {
        //IConta.super.saque(valor);
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente. Operação não concluida.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "realizado conta " + this.numero);
        }

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        //IConta.super.transferir(valor, contaDestino);
        contaDestino.saldo += valor;
    }


    //toString

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
