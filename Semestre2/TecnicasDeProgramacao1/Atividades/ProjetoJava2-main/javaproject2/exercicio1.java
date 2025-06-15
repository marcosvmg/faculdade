package javaproject2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizSoma[][] = new int[3][3];

  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor para a primeira matriz: ");
                matrizA[i][j] = scan.nextInt();
            }
        }

    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor para a segunda matriz: ");
                matrizB[i][j] = scan.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        
        System.out.println("Soma das matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}