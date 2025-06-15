package br.edu.fatecpg.abstracao.model;

public class Genetica {
	public String corOlhos;
	public String corCabelo;
	public String tipoSanguineo;
	
	public Genetica (String corOlhos, String corCabelo, String tipoSanguineo) {
		this.corCabelo = corCabelo;
		this.corOlhos = corOlhos;
		this.tipoSanguineo = tipoSanguineo;
	}
	
	public void herdar() {
		System.out.println("Herdando genética...");
	}
	public void exibir_genetica() {
		System.out.println(corOlhos);
		System.out.println(corCabelo);
		System.out.println(tipoSanguineo);
		
	}
	public void fortalecer_genetica() {
		System.out.println("Fortalecendo genética...");
	}

}
