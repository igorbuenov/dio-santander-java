package List.OperacoesBasicas.listaTarefas.application;


import List.OperacoesBasicas.listaTarefas.entities.ListaTarefas;

public class Program {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de elemento na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.addTarefa("Tarefa 1");
        listaTarefas.addTarefa("Tarefa 2");
        listaTarefas.addTarefa("Tarefa 3");
        listaTarefas.addTarefa("Tarefa 4");
        listaTarefas.addTarefa("Tarefa 5");

        System.out.println("O número total de elemento na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.removerTarefa("Tarefa 1");

        System.out.println("O número total de elemento na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
