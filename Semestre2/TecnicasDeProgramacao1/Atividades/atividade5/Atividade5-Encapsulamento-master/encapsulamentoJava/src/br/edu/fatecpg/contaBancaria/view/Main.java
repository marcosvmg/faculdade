package br.edu.fatecpg.contaBancaria.view;
import br.edu.fatecpg.contaBancaria.model.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria contaFla = new ContaBancaria(1000,777, "Flavio");
		ContaBancaria contaRoger = new ContaBancaria(1000,111, "Roger");
		
		contaFla.depositar(100);
		contaFla.depositar(58);
		System.out.println("Nome do Cliente: " +contaFla.getNome());
		System.out.println("Saldo Atual: " +contaFla.getSaldo());
		
	
		contaFla.setNome("Flavio");
		
		
		System.out.println("Nome do Cliente: " +contaRoger.getNome());
		
		contaRoger.sacar(500);
		System.out.println("Saldo Atual: " +contaRoger.getSaldo());
		contaRoger.setNome("Roger");

		
		
		

	}

}