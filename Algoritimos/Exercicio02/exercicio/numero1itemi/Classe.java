package exercicio.numero1itemi;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um n�mero:");
		num = scanner.nextInt();

		for (int aux = 0; aux <= num; aux++) {

			if (aux % 3 == 0)
				System.out.println(aux);
		}

		scanner.close();
	}
}
