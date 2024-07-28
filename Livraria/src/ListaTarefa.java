import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String tarefa) {
        List<Tarefa> tarefasToRemove = new ArrayList<>();
        for (Tarefa tarefaAux : this.tarefaList) {
            if (tarefaAux.getDescricao().equals(tarefa)) {
                tarefasToRemove.add(tarefaAux);
            }
        }
        this.tarefaList.removeAll(tarefasToRemove);
    }

    public int obeterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
