package exercicioscannerr14;

import java.util.Scanner;

public class ClasseA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		System.out.println("Digite seu nome:");
		nome = scanner.next();
		int nascim;
		System.out.println("Digite seu ano de nascimento ");
		nascim = scanner.nextInt();
		String numero;
		System.out.println("Digite seu número de telefone com -");
		numero = scanner.next();
		String cidade;
		System.out.println("Digite sua cidade de nascimento");
		cidade = scanner.next();
		int idade = 2017 - nascim;

		System.out.println("Meu nome é " +nome+ " nasci no ano " +nascim+" Eu tenho " +idade+" anos. Se você quiser entrar em contato comigo, pode ligar para o telefone " +numero+" .Há esqueci de te dizer aonde eu nasci, foi na cidade de " +cidade);

			
			scanner.close();

		
	}
}
