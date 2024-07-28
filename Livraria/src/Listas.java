import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listas {
    private List<Cliente> listaClientes;

    //constructor
    public Listas() {
        this.listaClientes = new ArrayList<>();
    }

    //methods
    public void incluirCliente(String nome, int idade, double altura) {
        listaClientes.add(new Cliente(nome,idade,altura));
    }

    public void excluirCliente(String nome) {
        List<Cliente> clientesParaExcluir = new ArrayList<>();

        for (Cliente c : listaClientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                clientesParaExcluir.add(c);
            }
        }
        listaClientes.removeAll(clientesParaExcluir);
    }

    public int contarClientes() {
        return listaClientes.size();
    }

    public List<Cliente> pesquisarPorIdade (int idade) {
        List<Cliente> clientesPorIdade = new ArrayList<>();
        if (!listaClientes.isEmpty()) {
            for (Cliente c : listaClientes) {
                if (c.getIdade() == idade) {
                    clientesPorIdade.add(c);
                }
            }
        }
        return clientesPorIdade;
    }

    public List<Cliente> pesquisarPorNome (String nome) {
        List<Cliente> porcurarPorNome = new ArrayList<>();
        if (!listaClientes.isEmpty()){
            for (Cliente c : listaClientes) {
                if (c.getNome() == nome) {
                    porcurarPorNome.add(c);
                    break;
                }
            }
        }
        return porcurarPorNome;
    }

    public List<Cliente> ordenaClientesPorIdade () {
        List<Cliente> clientePorIdade = new ArrayList<>(listaClientes);
        Collections.sort(clientePorIdade);
        return clientePorIdade;
    }
    public List<Cliente> ordenarPorAltura () {
        List <Cliente> clientePorAltura = new ArrayList<>(listaClientes);
        Collections.sort(clientePorAltura);
        return clientePorAltura;
    }

    @Override
    public String toString() {
        return "Lista de Alunos:\n" +
                 listaClientes ;
    }
}

