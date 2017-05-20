package exercicio.numero1itemt;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
		int num2;
		System.out.println("Digite 2° número:");
		num2 = scanner.nextInt();

		for (int aux = num; aux <= num2; aux++) {
		
				System.out.println(aux);
		}

		scanner.close();
	}
}