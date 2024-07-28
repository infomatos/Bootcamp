import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Listas listas = new Listas();
        listas.incluirCliente("Thiago Potter",13,1.65);
        listas.incluirCliente("Hermione Granger",12,1.60);
        listas.incluirCliente("Rony Weasley",13,1.68);
        System.out.println(listas.toString());
        System.out.println("Aluno deletado: ");
        listas.excluirCliente("Thiago Potter");
        listas.incluirCliente("Tom Marvolo Riddle", 65,1.88);
        listas.incluirCliente("Alvo Dumbledore", 78,1.92);
        listas.incluirCliente("Harry Potter",13,1.63);

        System.out.println(listas.toString());
        System.out.println("\nQuantidade de alunos em Hogwarts: " + listas.contarClientes());

        System.out.println("\nLista de alunos com 13 anos\n" + listas.pesquisarPorIdade(13));

        System.out.println("\nAlunos por ordem de idade: " + listas.ordenaClientesPorIdade());
        System.out.println("\nAlunos por altura: " + listas.ordenarPorAltura());
    }
}