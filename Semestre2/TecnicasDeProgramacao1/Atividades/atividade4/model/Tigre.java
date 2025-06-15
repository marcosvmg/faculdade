package br.edu.fatecpg.abstracao.model;

public class Tigre {
	public String nome;
	public String raça;
	public String sexo;
	
	public Tigre(String nome, String raça, String sexo) {
		this.nome = nome;
		this.raça = raça;
		this.sexo = sexo;
	}
	public void comer() {
		System.out.println("Comendo...");
	}
	public void andar() {
		System.out.println("Andando...");
	}
	public void acasalar() {
		System.out.println("Acasalando...");
	}
}
