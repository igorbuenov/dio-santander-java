package Set.Pesquisa.AgendaContatos.application;

import Set.Pesquisa.AgendaContatos.entities.AgendaContatos;

public class Program {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 11111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));


    }
}
