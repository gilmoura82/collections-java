package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	public Set<Produtos> produtoSet;
	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionaProdutos(String nome, int codigo, double preco, int quantidade) {
		produtoSet.add(new Produtos(nome, codigo, preco, quantidade));
	}
	
	public Set<Produtos> exibirProdutosPorNome() {
		Set<Produtos> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produtos> exibirProdutosPorPreco() {
		Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}

}
