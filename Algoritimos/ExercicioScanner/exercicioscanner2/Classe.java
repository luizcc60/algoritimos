package exercicioscanner2;

import java.util.Scanner;


public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String num;
		System.out.println("Digite um n�mero inteiro: ");
		num = scanner.next();

		System.out.print("Retorno do n�mero digitado: " +num);

		scanner.close();
	}
}
