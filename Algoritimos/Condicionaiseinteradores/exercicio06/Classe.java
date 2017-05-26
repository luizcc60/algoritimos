package exercicio06;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String cidadeMora;
		System.out.println("Digite a cidade aonde mora: ");
		cidadeMora = scanner.nextLine();

		String bairroMora;
		System.out.println("Digite o bairro aonde mora: ");
		bairroMora = scanner.nextLine();

		if (cidadeMora.equals("Blumenau") && bairroMora.equals("Velha")) {
			System.out.println("Você se atrasará para o trabalho!");
		}
		if (cidadeMora.equals("Blumenau") && bairroMora.equals("Fortaleza")) {
			System.out.println("Você se atrasará muito mais para o trabalho!");
		}
		
		if (cidadeMora.equals("Gaspar") && bairroMora.equals("Belchior")) {
			System.out.println("OK, você gosta de pegar trânsito!");
		}
		if (cidadeMora.equals("Blumenau") && bairroMora.equals("Bela vista")) {
			System.out.println("Pegue carona com quem vêem de Gaspar, economiza gasolina!");
		}
		String concorda;
		System.out.println("Você concorda com o que eu disse?");
		concorda = scanner.next();
		
		if(concorda.equals("Sim")){
			System.out.println("Show de Bola");
		
		}
		if(concorda.equals("Não"))
			System.out.println("Ok, o problema é nosso!");
		

		scanner.close();

	}
}
