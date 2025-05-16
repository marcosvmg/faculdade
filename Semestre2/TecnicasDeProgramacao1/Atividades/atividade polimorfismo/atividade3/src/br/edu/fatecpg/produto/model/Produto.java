package br.edu.fatecpg.produto.model;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		public Produto(String nm) {
		this.setNome(nm);
	}
		
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public Produto(String nm, double p) {
		this.setNome(nm);
		this.setPreco(p);
		
	}
	
	public Produto(String nm, double p, int qtd) {
		this.setNome(nm);
		this.setPreco(p);
		this.setQuantidade(qtd);
	}
	  	
		public String chamar1() {
	        return "Produto: " + nome ;
	        
	    }
	  public String chamar2() {
	        return "Produto: " + nome + ", Preço: " + preco;
	    }
	  public String chamar3() {
	        return "Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade;
	    }

	
	
}