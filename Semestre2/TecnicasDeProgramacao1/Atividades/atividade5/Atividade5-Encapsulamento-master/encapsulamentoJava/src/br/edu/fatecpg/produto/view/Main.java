package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto(null, 0, 0);
		
		
		produto.setPreco(-3);
		produto.setQuantidadeEstoque(-3);
		
		
		System.out.println(produto.getPreco());
		System.out.println(produto.getQuantidadeEstoque());
		

	}

}
