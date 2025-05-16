package br.edu.fatecpg.veiculo.view;
import br.edu.fatecpg.veiculo.model.*;

public class Main {

	public static void main(String[] args) {
		
		Bicicleta bike = new Bicicleta();
		Carro car = new Carro();
		
		bike.mover();
		car.mover();

	}

}
