package exercicioscanner1;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um n�mero inteiro: ");
		num = scanner.nextInt();

		System.out.print("Retorno do n�mero digitado: " +num);

		scanner.close();
	}
}
