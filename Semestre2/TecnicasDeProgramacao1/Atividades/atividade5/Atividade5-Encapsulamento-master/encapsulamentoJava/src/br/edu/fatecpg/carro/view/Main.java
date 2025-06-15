package br.edu.fatecpg.carro.view;
import br.edu.fatecpg.carro.model.Carro;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		 
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a marca do carro: ");

	        String marca = scanner.nextLine();
	 
	        System.out.print("Digite o modelo do carro: ");

	        String modelo = scanner.nextLine();
	 
	        System.out.print("Digite a capacidade do tanque (em litros): ");

	        double capacidadeTanque = scanner.nextDouble();
	 
	       

	        Carro carro = new Carro(marca, modelo, capacidadeTanque);
	 
	        System.out.print("Digite o preço da gasolina (por litro): ");

	        double precoGasolina = scanner.nextDouble();
	 
	        

	        double custoTotal = carro.calcularCustoEncherTanque(precoGasolina);

	        System.out.printf("O custo total para encher o tanque do %s %s é R$%.2f.%n",

	                carro.getMarca(), carro.getModelo(), custoTotal);
	 
	        scanner.close();

	}

}
