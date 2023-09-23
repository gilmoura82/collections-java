package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, ProdutoMap> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	public void adicionaProdutosMap(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new ProdutoMap(nome, preco, quantidade));
	}

	public void exibirTodosProdutos() {
		System.out.println(estoqueProdutosMap);
	}

	public double calculaValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (ProdutoMap p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public ProdutoMap retornaProdutoMaisCaro() {
		ProdutoMap produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (ProdutoMap p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;

	}

}
