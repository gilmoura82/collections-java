package Principal;

import OperacoesBasicas.ListaTarefa;

public class principal {

	public static void main(String[] args) {

		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println("Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}

}
