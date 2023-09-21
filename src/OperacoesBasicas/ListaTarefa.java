package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	// Atributo
	private List<Tarefa> tarefaList;

	// Lista As Tarefas
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	// Adicionar Tarefa
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	// Remover Tarefa
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);

	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println("Lista de Tarefas: " + tarefaList);
	}
	

}
