package exercicioscannerr20;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto;
		System.out.println("Dig. um num qualquer: ");
		texto = scanner.next();

		String outroTexto = texto;

		texto = "Ol�";

		System.out.println("Prim. N�m: " + texto);

		System.out.println("Segun. N�m: " + outroTexto);

		scanner.close();

	}
}


