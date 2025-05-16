package br.edu.fatecpg.conversor.model;

public class ConversorCtoF extends Conversor{

	public void converter ( double c) {		
		System.out.println("Celcius: " + c + " Fahrenheit: " +((c * 9/5) + 32));
	}
	
}
