package exercicio.numero1itemh;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();

		for (int aux = 0; aux <= num; aux++) {

			if (aux % 2 == 0)
				System.out.println(aux);
		}

		scanner.close();
	}
}
