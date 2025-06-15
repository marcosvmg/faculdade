package br.edu.fatecpg.abstracao.model;

public class Arte_digital {
	String cor;
	String software;
	String traços;
	
	public Arte_digital(String cor, String software, String traços){
		this.cor = cor;
		this.software = software;
		this.traços =traços;
	}
	public void publicar() {
		System.out.println("Publicando...");
	}
	public void apagar() {
		System.out.println("Apagando...");
	}
	public void desenhar() {
		System.out.println("desenhando...");
	}

}
