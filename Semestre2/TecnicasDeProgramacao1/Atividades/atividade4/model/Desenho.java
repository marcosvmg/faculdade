package br.edu.fatecpg.abstracao.model;

public class Desenho {
	public String traço;
	public String cor;
	public String papel;
	
	public Desenho(String traço, String cor, String papel) {
		this.traço = traço;
		this.cor = cor;
		this.papel = papel;
	}
	
	public void desenhar() {
		System.out.println("Estou Desenhando...");
	}
	public void apagar() {
		System.out.println("Estou Apagando....");
	}
	public void contornar() {
		System.out.println("Estou Contornando");
	}
}
