package br.edu.fatecpg.abstracao.model;

public class Telescopio {
	public String modelo;
	public float tamanho;
	public String lente;
	
	public Telescopio (String modelo, float tamanho, String lente) {
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.lente = lente;
	}
	public void olhar() {
		System.out.println("Olhando...");
	}
	public void aproximar() {
		System.out.println("Aproximando...");
	}
	public void tampar() {
		System.out.println("Tampando...");
	}
}
