package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("PeitaSCCP");
		Produto produto2 = new Produto("PeitaSCCP", 70);
		Produto produto3 = new Produto("PeitaSCCP", 70, 1910);
		
		
		System.out.println(produto1.chamar1());
		System.out.println(produto2.chamar2());
		System.out.println(produto3.chamar3());

	}
	
	// A sobrecarga permite criar objetos de varias formas, com muita ou pouca informação,
	//isso torna o código mais flexível, fica prático usar, evita repetição e facilita mudanças no futuro 

}
