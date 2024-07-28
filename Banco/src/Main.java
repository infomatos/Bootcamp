//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Elias Matos", 33,"Arrojado");
        Cliente cliente2 = new Cliente("Ingrid Izaú",30,"Moderado");
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        Conta contaPoupanca1 = new ContaPoupanca(cliente1,3366);
        Conta contaCorrente1 = new ContaCorrente(cliente2);

        System.out.println("Lista de contas:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println(contaPoupanca1);
        System.out.println(contaCorrente1);
        System.out.println("");

        contaCorrente.deposito(200);
        System.out.println(contaCorrente);

        contaCorrente.saque(950);
        System.out.println(contaCorrente);

        contaCorrente.transferir(328,contaPoupanca);
        System.out.println(contaPoupanca);

        System.out.println(contaCorrente.cliente);
    }
}