package br.edu.fatecpg.abstracao.model;

public class Smartwatch {
	public String modelo;
	public String cor;
	public String bateria;
	
	public Smartwatch(String modelo, String cor, String bateria) {
		this.modelo = modelo;
		this.cor = cor;
		this.bateria = bateria;
	}
	public void ligar() {
		System.out.println("Estou ligando....");
	}
	public void monitorar() {
		System.out.println("Estou Monitorando...");
	}
	
	public void desligar() {
		System.out.println("Estou Desligando...");
	}
}
