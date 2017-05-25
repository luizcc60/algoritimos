package exercicioscannerr19;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int primeiroNumero;
		System.out.println("Digite um número:");
		primeiroNumero = scanner.nextInt();
		int segundoNumero = primeiroNumero;
		primeiroNumero = 10;
		System.out.println("Primeiro número " + primeiroNumero);
		System.out.println("Segundo número " + segundoNumero);

		scanner.close();

	}

}
