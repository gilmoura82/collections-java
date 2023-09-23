package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatosMap() {
		this.agendaContatoMap = new HashMap<>();
	}

	public void adicionaContatosMap(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}

	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}

	public Integer pesquisaContatoPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}

}
