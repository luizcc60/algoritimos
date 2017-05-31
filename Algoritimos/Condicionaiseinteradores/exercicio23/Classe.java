package exercicio23;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeCompleto;
		System.out.println("Escreva seu nome completo");
		nomeCompleto = scanner.nextLine();
		
		int primeiraPosicao = nomeCompleto.indexOf(" ");
		System.out.println(primeiraPosicao);
		int segundaPosicao = nomeCompleto.lastIndexOf(" ");
		System.out.println(segundaPosicao);
		nomeCompleto = nomeCompleto.substring(primeiraPosicao, segundaPosicao);
		
		scanner.close();
		
	}

}
