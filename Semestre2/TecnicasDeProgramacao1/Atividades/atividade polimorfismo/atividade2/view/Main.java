package br.edu.fatecpg.calculadora.view;
import br.edu.fatecpg.calculadora.model.*;

public class Main {

	public static void main(String[] args) {
		 Calculadora calc = new Calculadora();

	     int resultado1 = calc.somar(2, 3);              
	     int resultado2 = calc.somar(1, 2, 3);             
	     double resultado3 = calc.somar(2.5, 3.7);         
	     System.out.println("Resultado 1: " + resultado1); 
	     System.out.println("Resultado 2: " + resultado2); 
	     System.out.println("Resultado 3: " + resultado3); 

	}

}
