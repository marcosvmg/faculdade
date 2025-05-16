package br.edu.fatecpg.conversor.model;
import java.text.DecimalFormat;

public class ConversorQtoM {

	
	DecimalFormat df = new DecimalFormat("#.######");
	public void converter ( double c) {	
		
		System.out.println("Quilometros: " + c + " Milhas: " + df.format((c / 1.609)));
	}
	
}
