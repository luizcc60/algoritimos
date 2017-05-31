package exercicio20;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		System.out.println("Escreva nome e sobrenome");
		nome = scanner.nextLine();
	

		nome = nome.toUpperCase(); 
		System.out.println(nome);
		nome = nome.toLowerCase();
		System.out.println(nome);
		
		scanner.close();
	}
}
