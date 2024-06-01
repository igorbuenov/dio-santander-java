package Map.Ordenacao.AgendaEventos.application;

import Map.Ordenacao.AgendaEventos.entities.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;

public class Program {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 29), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 28), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();



    }
}
