package br.edu.fatecpg.abstracao.model;

public class TaxadeJuros {
	public String taxa;
	public String juros;
	public String preço;
	
	public TaxadeJuros( String taxa, String juros, String preço) {
		this.taxa = taxa;
		this.juros = juros;
		this.preço = preço;
		
	}
	public void taxar() {
		System.out.println("Estou taxando....");
	}
	public void pagar() {
		System.out.println("Estou Pagando....");
	}
	public void cobrar() {
		System.out.println("Estou cobrando...");
	}
}
