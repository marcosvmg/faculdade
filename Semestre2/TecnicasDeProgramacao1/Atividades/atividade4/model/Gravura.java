package br.edu.fatecpg.abstracao.model;

public class Gravura {
	public String moldes;
	public String artes;
	public String traços;

	public Gravura (String moldes ,String artes, String traços ) {
		this.moldes = moldes;
		this.artes = artes;
		this.traços = traços;
	}
	 public void decorar() {
		 System.out.println("Estou decorando....");
	 }
	 public void reproduzir() {
		 System.out.println("Estou reproduzindo...");
	 }
	 public void produzir() {
		 System.out.println("Estou Produzindo....");
	 }
}
