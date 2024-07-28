import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Digite o seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Agora digite o número da AGÊNCIA: ");
        String agencia = sc.nextLine();
        System.out.println("Defina o número da CONTA: ");
        int conta = sc.nextInt();
        System.out.println("Digite um valor para depósito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
