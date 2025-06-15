package br.edu.fatecpg.abstracao.model;

public class Professor {
	public String nome;
	public String diploma;
	public int idade;
	public Professor(String nome, String diploma, int idade) {
		this.nome = nome;
	    this.diploma = diploma;
	    this.idade = idade;
		
	}
	
	public void ensinar () {
		System.out.println("Ensinando...");
	}
	
	public void escrever () {
		System.out.println("Escrevendo...");
	}
	public void ler () {
		System.out.println("Lendo...");
	}
	
}


