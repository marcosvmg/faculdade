package br.edu.fatecpg.abstracao.model;

public class Roteador {
	public String modelo;
	public String velocidade;
	public String frequencia;
	
	
	public Roteador(String modelo, String velocidade, String frequencia) {
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.frequencia = frequencia;
	}
	public void ligar() {
		System.out.println("Estou Ligando...");
	}
	public void rotear() {
		System.out.println("Estou roteando...");
	}
	public void desligar() {
		System.out.println("Estou desligando....");
	}
}
