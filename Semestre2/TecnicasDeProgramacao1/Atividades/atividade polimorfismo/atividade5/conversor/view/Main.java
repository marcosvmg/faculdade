package br.edu.fatecpg.conversor.view;
import br.edu.fatecpg.conversor.model.*;

public class Main {

	public static void main(String[] args) {
		ConversorCtoF cf = new ConversorCtoF();
		ConversorQtoM qm = new ConversorQtoM();
		ConversorString s = new ConversorString();
		cf.converter(35);
		qm.converter(3);
		s.converter("sla tlgd");
		

	}

}
