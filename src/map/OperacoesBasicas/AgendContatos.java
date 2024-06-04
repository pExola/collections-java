package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendContatos agendaContatos = new AgendContatos();

        agendaContatos.adicionarContato("Kauan", 12345);
        agendaContatos.adicionarContato("Kauan", 12346);
        agendaContatos.adicionarContato("Kauan Px", 12347);
        agendaContatos.adicionarContato("Kauan PX1", 12345);
        agendaContatos.adicionarContato("Kauan Pxo1", 12348);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Kauan Px");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Kauan PX1"));
    }

}
