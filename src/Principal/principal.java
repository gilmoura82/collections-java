package Principal;

import Ordenacao.OrdenacaoPessoas;

public class principal {

	public static void main(String[] args) {
		/*
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
		*/
		
		OrdenacaoPessoas op = new OrdenacaoPessoas();
		
		op.adicionarPessoa("Nome 1", 20, 1.66);
		op.adicionarPessoa("Nome 2", 24, 1.44);
		op.adicionarPessoa("Nome 3", 30, 1.89);
		op.adicionarPessoa("Nome 4", 51, 1.56);
		
		System.out.println(op.ordenarPorIdade());
		System.out.println(op.ordenarPorAltura());
		
	}

}
