package br.edu.fatecpg.abstracao.model;

public class Recessão {
	public Recessão(String duracao, int intensidade, String impacto) {
		this.duracao = duracao;
		this.intensidade = intensidade;
		this.impacto = impacto;
		
	}
	public String duracao;
	public int intensidade;
	public String impacto;
	
	public void prolongar () {
		System.out.println("Prolongando...");
	}
	public void reduzir_intensidade() {
		System.out.println("Reduzindo...");
	}
	public void aumentar_impacto() {
		System.out.println("Aumentando...");
	}

}
