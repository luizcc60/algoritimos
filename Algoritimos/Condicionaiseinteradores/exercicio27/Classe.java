package exercicio27;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nomeCompleto;
		System.out.println("Digite nome completo:");
		nomeCompleto = scanner.nextLine();

		if (nomeCompleto.contains("Pereira")) {
			System.out.println("Voc� � da fam�lia Pereira");
		} else if (nomeCompleto.contains("Silva")) {
			System.out.println("Voc� � da fam�lia Silva");
		} else if (nomeCompleto.contains("Souza")) {
			System.out.println("Voc� � da fam�lia Souza");
		} else {

			System.out.print("Voc� infelizmente n�o tem sobrenome famoso");

			scanner.close();
		}

	}

}
