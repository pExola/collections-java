package list.OperacoesBasicas;

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
    public void removeTarefa(String descricao) {
        List<Tarefa> tarefaRemovivel = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equals(descricao)) {
                tarefaRemovivel.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemovivel);
    }
    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        System.out.println("bla " + listatarefa.obterNumeroTotalTarefa());
        listatarefa.adicionarTarefa( "Tarefa 1");
        listatarefa.adicionarTarefa( "Tarefa 1");
        listatarefa.adicionarTarefa( "Tarefa 2");
        listatarefa.removeTarefa( "Tarefa 2");

        listatarefa.obterDescricaoTarefa();
        System.out.println(listatarefa.obterNumeroTotalTarefa());
    }
}
