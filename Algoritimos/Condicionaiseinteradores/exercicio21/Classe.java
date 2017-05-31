package exercicio21;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nasc;
		System.out.println("Digite sua data de nascimento com /");
		nasc = scanner.nextLine();

		int posicao = nasc.lastIndexOf("/");
		System.out.println(posicao);
		
		scanner.close();
	}

}
