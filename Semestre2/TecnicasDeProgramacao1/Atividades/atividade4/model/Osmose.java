package br.edu.fatecpg.abstracao.model;

public class Osmose {
	public String celula;
	public Double concentracaoAguaIn;
	public Double concentracaoAguaEx;
	
	public Osmose(String celula, Double concentracaoAguaIn, Double concentracaoAguaEx ) {
		this.celula = celula;
		this.concentracaoAguaEx = concentracaoAguaEx;
		this.concentracaoAguaIn = concentracaoAguaIn;
	}
	public void multiplicar() {
		System.out.println("Multiplicando...");
	}
	public void absorverNutrientes() {
		System.out.println("Absorvendo...");
	}
	public void filtrarAgua() {
		System.out.println("Filtrando...");
	}

}
