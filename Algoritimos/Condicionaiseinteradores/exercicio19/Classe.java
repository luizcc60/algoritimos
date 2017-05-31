package exercicio19;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		System.out.println("Escreva uma palavra");
		nome = scanner.nextLine();

		nome = nome.replaceAll("a", "w");
		nome = nome.replaceAll("e", "w");
		nome = nome.replaceAll("i", "w");
		nome = nome.replaceAll("o", "w");
		nome = nome.replaceAll("u", "w");

		System.out.println(nome);
		
		scanner.close();
	}
}
