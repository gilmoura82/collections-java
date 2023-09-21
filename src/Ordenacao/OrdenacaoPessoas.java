package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoas> pessoaList;

	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoas(nome, idade, altura));
	}
	
	
	public List<Pessoas> ordenarPorIdade() {
		List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoas> ordenarPorAltura() {
		List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	


}
