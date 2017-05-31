package exercicio24;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nasc;
		System.out.println("Digite sua data de nascimento com dd/mm/yyyy");
		nasc = scanner.nextLine();

		
		int posicao = nasc.indexOf("/");
		posicao++;
		int posicao2 = nasc.lastIndexOf("/");
		
		String nasc2 = nasc.substring(posicao, posicao2);
		System.out.println(nasc2);
		
		scanner.close();
	}

}
