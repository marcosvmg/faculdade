package br.edu.fatecpg.fila.view;
import br.edu.fatecpg.fila.model.Fila;

public class Main {

	public static void main(String[] args) {
		Fila teste = new Fila(5, 2,"Dr Cucabeludo");
		
		System.out.println("Medico: " + teste.getMedico());
		System.out.println("Pacientes no consultório: " + teste.getOcupConsultorio());
		System.out.println("Pacientes restantes na fila: " + teste.getNumeroPacientes());
		teste.chegar(3);
		teste.chamar(2);
		System.out.println("Pacientes restantes na fila: " + teste.getNumeroPacientes());
		System.out.println("Pacientes no consultório: " + teste.getOcupConsultorio());
		teste.atender();
		System.out.println("Pacientes no consultório: " + teste.getOcupConsultorio());
		teste.chamar(2);
		System.out.println("Pacientes no consultório: " + teste.getOcupConsultorio());
		teste.atender();
		teste.atender();
		teste.chamar(1);
		teste.chamar(2);
		System.out.println("Pacientes no consultório: " + teste.getOcupConsultorio());
		teste.atender();
		
	

	}

}
