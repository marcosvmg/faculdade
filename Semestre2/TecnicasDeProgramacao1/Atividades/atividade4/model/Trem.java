package br.edu.fatecpg.abstracao.model;

public class Trem {
	public String modelo;
	public boolean ligado;
	public int velocidade;
	
	public Trem(String modelo, boolean ligado, int velocidade) {
		this.modelo = modelo;
		this.ligado = ligado;
		this.velocidade = velocidade;
		
	}
	
	public void ligar() {
		System.out.println("Estou ligando....");
	}
	public void acelerar() {
		System.out.println("Estou Acelerando");
	}
	public void desligar() {
		System.out.println("Estou Desligando...");
	}
}
