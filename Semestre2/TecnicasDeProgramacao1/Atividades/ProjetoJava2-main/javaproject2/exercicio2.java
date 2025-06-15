package javaproject2;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			String[][] LoginSenha = {
			{"U1" , "S123"},
			{"U2", "S345"},
			{"U3", "S789"},
			{"U4", "S101112"},
			{"U5", "S131415"},
			{"U6", "S161718"} };
			
			System.out.println("Digite o nome de usuario: ");
			String usuario = scan.nextLine();
			System.out.println("Digite a senha desse usuario: ");
			String senha = scan.nextLine();
			for (int i = 0; i < 6; i++) {
				 if (usuario.equals(LoginSenha[i][0]) && senha.equals(LoginSenha[i][1])) {
					 System.out.println("BEM-VINDO: " + usuario);
					 return;
				 }
				 
				 
				}
			System.out.println("Login ou senha incorretos!");
			
		}

	}


