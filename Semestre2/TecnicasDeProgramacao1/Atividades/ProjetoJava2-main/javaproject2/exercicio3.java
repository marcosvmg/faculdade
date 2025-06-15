package javaproject2;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matrizA[][] = new int [3][2];
		int matrizT[][] = new int [2][3];
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Digite os valores da matriz: ");
				matrizA[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				matrizT[i][j] = matrizA[j][i];
			}
		}
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Valores da transposição da matriz: " + matrizT[i][j] + "\t");
			}
		}
	
	
	

	}

}

