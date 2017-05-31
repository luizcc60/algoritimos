package exercicio27;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nomeCompleto;
		System.out.println("Digite nome completo:");
		nomeCompleto = scanner.nextLine();

		if (nomeCompleto.contains("Pereira")) {
			System.out.println("Você é da família Pereira");
		} else if (nomeCompleto.contains("Silva")) {
			System.out.println("Você é da família Silva");
		} else if (nomeCompleto.contains("Souza")) {
			System.out.println("Você é da família Souza");
		} else {

			System.out.print("Você infelizmente não tem sobrenome famoso");

			scanner.close();
		}

	}

}
