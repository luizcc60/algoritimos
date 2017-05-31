package exercicio22;

import java.util.Scanner;
import java.lang.String;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeCompleto;
		System.out.println("Escreva seu nome completo: ");
		nomeCompleto = scanner.nextLine();
		
		int novo = nomeCompleto.lastIndexOf(" ");
				
		novo++;
		System.out.println(novo);
		
		scanner.close();

	}

}
