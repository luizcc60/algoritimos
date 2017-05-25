package exercicioscannerr20;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto;
		System.out.println("Dig. um num qualquer: ");
		texto = scanner.next();

		String outroTexto = texto;

		texto = "Olá";

		System.out.println("Prim. Núm: " + texto);

		System.out.println("Segun. Núm: " + outroTexto);

		scanner.close();

	}
}


