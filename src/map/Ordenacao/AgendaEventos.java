package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEventos(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void proximoEvento() {
       LocalDate dataAtual = LocalDate.now();
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
       for (Map.Entry<LocalDate, Evento> entry: eventoMap.entrySet()) {
           if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
               System.out.println("O próximo evento " + entry.getValue() + " acontecerá em " + entry.getKey());
               break;
           }
       }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.JULY, 5), "Show do Peão", "Igor Guilherme");
        agendaEventos.adicionarEventos(LocalDate.of(2025, Month.APRIL, 13), "Show do tIÃO", "iGUINHO");
        agendaEventos.adicionarEventos(LocalDate.of(2026, Month.DECEMBER, 25), "Show do Papa", "Jesus");

        agendaEventos.exibirAgenda();

        agendaEventos.proximoEvento();
    }
}
