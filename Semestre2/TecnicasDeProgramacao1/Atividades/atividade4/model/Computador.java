package br.edu.fatecpg.abstracao.model;

public class Computador {
	public String modelo;
	public String processo;
	public String rede;
	
	public Computador (String modelo, String processo, String rede) {
		this.modelo = modelo;
		this.processo = processo;
		this.rede = rede;
	}
	public void ligar() {
		System.out.println("Ligando...");
	}
	public void reiniciar() {
		System.out.println("Reiniciando...");
	}
	public void desligar() {
		System.out.println("Desligar...");
	
	}
	

}
