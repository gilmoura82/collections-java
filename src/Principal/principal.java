package Principal;

import OperacoesBasicas.AgendaContatosMap;
import OperacoesBasicas.ListaTarefa;
import Ordenacao.CadastroProdutos;
import Ordenacao.OrdenacaoPessoas;
import Pesquisa.AgendaContatos;
import Pesquisa.CatalogoLivros;
import Pesquisa.EstoqueProdutos;
import Set.ConjuntoConvidados;

public class principal {

	public static void main(String[] args) {
		
		// Testando Tarefas
		
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println("Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		
		// Testando Livros
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2019);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2020);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2021);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2022);
		catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2023);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
		System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Livro 3"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2019, 2022));
		
		
		OrdenacaoPessoas op = new OrdenacaoPessoas();
		
		op.adicionarPessoa("Nome 1", 20, 1.66);
		op.adicionarPessoa("Nome 2", 24, 1.44);
		op.adicionarPessoa("Nome 3", 30, 1.89);
		op.adicionarPessoa("Nome 4", 51, 1.56);
		
		System.out.println(op.ordenarPorIdade());
		System.out.println(op.ordenarPorAltura());
		
		
		// Testando Set
		
		ConjuntoConvidados cc = new ConjuntoConvidados();
		
		System.out.println("Existem " + cc.contarConvidados() + 
				" convidados dentro do Set de Convidados");
		
		cc.adicionaConvidado("Convidado 1", 1559);
		cc.adicionaConvidado("Convidado 2", 1559);
		cc.adicionaConvidado("Convidado 3", 5588);
		
		cc.removerConvidadoPorCodigoConvite(5588);
		cc.exibirConvidados();
		
		System.out.println("Existem " + cc.contarConvidados() + 
				" convidados dentro do Set de Convidados");
		
		
		// Testando contatos
		
		AgendaContatos ac = new AgendaContatos();
				
		ac.adicionaContato("Gil", 123456);
		ac.adicionaContato("Gil", 99563);
		ac.adicionaContato("Gil Moura", 111111);
		ac.adicionaContato("José_Silva", 123456);
		
		System.out.println(ac.pesquisarPorNome("Gil"));
		
		ac.exibirContatos();
		
		// Testando agenda de contatos Map 
		AgendaContatosMap acm = new AgendaContatosMap();
		
		acm.adicionaContatosMap("Gil", 44455);
		acm.adicionaContatosMap("Gil Moura", 11455);
		acm.adicionaContatosMap("Gil", 11111);
		acm.adicionaContatosMap("Moura Gil", 44455);
		
		acm.exibirContatos();
		
		// Testando ordenação
		
		CadastroProdutos cp = new CadastroProdutos();
		
		cp.adicionaProdutos("Produto 1", 1, 15d, 5);
		cp.adicionaProdutos("Produto 2", 2, 10d, 5);
		cp.adicionaProdutos("Produto 3", 3, 8d, 5);
		cp.adicionaProdutos("Produto 4", 4, 7d, 5);
		
		System.out.println(cp.produtoSet);
		
		System.out.println(cp.exibirProdutosPorNome());
		System.out.println(cp.exibirProdutosPorPreco());
		
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicionaProdutosMap(1L, "Produto 1", 10, 5.0);
		estoque.adicionaProdutosMap(2L, "Produto 2", 5, 30.0);
		estoque.adicionaProdutosMap(4L, "Produto 4", 5, 20.0);
		
		System.out.println("Valor total do estoque: R$ " + estoque.calculaValorTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.retornaProdutoMaisCaro());
	}

}
