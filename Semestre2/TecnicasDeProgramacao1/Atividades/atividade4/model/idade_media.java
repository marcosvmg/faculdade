package br.edu.fatecpg.abstracao.model;

public class idade_media {
	public int periodo;
	String construcoes;
	String imperio;
	
	public idade_media(int periodo, String contrucoes, String imperio, String construcoes) {
		this.construcoes = construcoes;
		this.imperio = imperio;
		this.periodo = periodo;
	
	}
	
	public void queimarBruxa() {
		System.out.println("Queimando...");
	}
	public void guerrear() {
		System.out.println("Guerreando...");
	}
	public void barganhar () {
		System.out.println("Barganhando...");
	}

}
