package main.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento>eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void addEventos(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate>dateSet = eventosMap.keySet();
        //Collection<Evento>values = eventosMap.values();
        //eventosMap.get()


        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.addEventos(LocalDate.of(2025, Month.JULY, 15), "Evente 1", "Atração 1");
        agendaEventos.addEventos(LocalDate.of(2025, 7, 20), "Evente 2", "Atração 2");
        agendaEventos.addEventos(LocalDate.of(2025, 8, 15), "Evente 3", "Atração 3 ");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
