package br.edu.fatecpg.abstracao.model;

public class Cinema {
	String marca;
	int salas;
	String cartaz;
	
	public Cinema(String marca, int salas, String cartaz) {
		this.cartaz = cartaz;
		this.marca = marca;
		this.salas = salas;
	}
	
	public void abrir() {
		System.out.println("Abrindo...");
		
	}
	
	public void fechar() {
		System.out.println("Fechando...");
	}
	public void projetar() {
		System.out.println("Projetando...");
	}

}
