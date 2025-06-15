package br.edu.fatecpg.fila.model;

public class Fila {
	private int numeroPacientes;
	private int ocupConsultorio;
	private String medico;
	
	public Fila(int numeroPacientes, int ocupConsultorio, String medico) {
		this.numeroPacientes = numeroPacientes;
		this.ocupConsultorio = ocupConsultorio;
		this.medico = medico;
	}

	public int getNumeroPacientes() {
		return numeroPacientes;
	}

	public void setNumeroPacientes(int numeroPacientes) {
		this.numeroPacientes = numeroPacientes;
	}

	public int getOcupConsultorio() {
		return ocupConsultorio;
	}

	public void setOcupConsultorio(int ocupConsultorio) {
		this.ocupConsultorio = ocupConsultorio;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	public void chegar(int qtd) {
		numeroPacientes += qtd;
		System.out.println("Chegou " + qtd + " paciente(s), tamanho da fila: " + numeroPacientes);
	}
	
	
	public void chamar(int qtd) {
	    if (ocupConsultorio + qtd <= 2 && numeroPacientes >= qtd) {
	        numeroPacientes -= qtd;  
	        ocupConsultorio += qtd;  
	        System.out.println("Chamando " + qtd + " paciente(s)");
	    } else if (ocupConsultorio == 2) {
	        System.out.println("O consultório está cheio, aguarde por favor");
	    } else if (numeroPacientes < qtd) {
	        System.out.println("Não há pacientes suficientes na fila para chamar");
	    } else {
	    	System.out.println("O limite de pessoas por consultorio é 2");
	    }
	}

	
	
	public void atender() {
		if(ocupConsultorio == 1) {
		System.out.println("Paciente atendido");
		ocupConsultorio -= 1; 
		} else if(ocupConsultorio == 2) {
			System.out.println("Paciente atendido");
			ocupConsultorio -= 2;
		} else {
			System.out.println(getMedico() + " está disponivel.");
		}
		
	}

}

