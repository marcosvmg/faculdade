package br.edu.fatecpg.contaBancaria.model;

public class ContaBancaria {
	private int agencia;
	private int conta;
	private String nomeCliente;
	private double saldo=0;
	private double chequeEspecial = 500;
	
	
	public ContaBancaria(int ag, int conta, String nome) {
		this.agencia = ag;
		this.conta = conta;
		this.nomeCliente = nome;
		
		
	}
	
	public void setAgencia(int ag) {
		this.agencia = ag;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getConta() {
		return this.conta;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 2) {
		this.nomeCliente = nome;
		}else {
			System.out.println("Nome inválido!");
		}
	}
	
	public String getNome() {
		return this.nomeCliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double sacar(double valor) {
		if(valor <= saldo) {
		this.saldo -= valor;}else {
			System.out.println("Saldo Insuficiente!");
		}
		return this.saldo;
	}
	public double usarChequeEspecial(double valor) {
	    
	    if (saldo + chequeEspecial >= valor) {
	    	chequeEspecial -= valor;
	        System.out.println("Cheque especial usado, saldo atual do cheque: " + chequeEspecial);
	        
	    } else {
	       
	        System.out.println("Limite de cheque especial insuficiente");
	    }
	    return this.saldo;
	}
		
	}

	
