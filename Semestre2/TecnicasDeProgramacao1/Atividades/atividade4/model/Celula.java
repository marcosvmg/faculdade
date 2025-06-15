package br.edu.fatecpg.abstracao.model;

public class Celula {
	
	String tipo;
	Boolean cancerigena;
	Boolean viva;
	
	public Celula(String tipo, Boolean cancerigena, Boolean viva) {
		this.cancerigena = cancerigena;
		this.viva = viva;
		this.tipo = tipo;
	}
	
	public void duplicar() {
		System.out.println("Duplicando...");
		
	}
	public void respirar() {
		System.out.println("Respirando...");
	}
	public void exibirCaracteristicas() {
		System.out.println("Exibindo...");
	}

}
