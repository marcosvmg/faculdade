package br.edu.fatecpg.abstracao.model;

public class Pintura {
	String cor;
	String quadro;
	String traços;
	
	public Pintura(String cor, String quadro, String traços) {
		
		this.cor = cor;
		this.quadro = quadro;
		this.traços = traços;
	}
	
	public void apreciar() {
		System.out.println("Apreciando...");
	}
	public void desenhar() {
		System.out.println("Desenhando...");
	}
	public void pintar() {
		System.out.println("Pintando...");
	}

}
