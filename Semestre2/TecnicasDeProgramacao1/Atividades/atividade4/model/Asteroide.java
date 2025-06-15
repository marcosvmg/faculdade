package br.edu.fatecpg.abstracao.model;

public class Asteroide {
	String nome;
	int tamanho;
	int velocidade;
	
	public void cair() {
		System.out.println("Caindo...");
	}
	public void destruir () {
		System.out.println("Destruindo...");
	}
	public void flutuar() {
		System.out.println("Flutuando...");
	}	

}
