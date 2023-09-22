package Ordenacao;

import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
	
	private String nome;
	private int codigo;
	private double preco;
	private int quantidade;
	
	@Override
	public int compareTo(Produtos p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	public Produtos(String nome, int codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produtos))
			return false;
		Produtos other = (Produtos) obj;
		return codigo == other.codigo;
	}
	
	@Override
	public String toString() {
		return nome + ", " + codigo + ", " + preco + ", " + quantidade;
	}

	
	
	
	

}
