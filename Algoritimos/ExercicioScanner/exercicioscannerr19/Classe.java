package exercicioscannerr19;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int primeiroNumero;
		System.out.println("Digite um n�mero:");
		primeiroNumero = scanner.nextInt();
		int segundoNumero = primeiroNumero;
		primeiroNumero = 10;
		System.out.println("Primeiro n�mero " + primeiroNumero);
		System.out.println("Segundo n�mero " + segundoNumero);

		scanner.close();

	}

}
