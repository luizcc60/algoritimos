package exercicio07;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num;
		System.out.println("Digite um n�mero: ");
		num = scanner.nextDouble();

		String operador;
		System.out.println("Digite o operador matem�tico: ");
		operador = scanner.next();

		double num2;
		System.out.println("Digite o segundo n�mero: ");
		num2 = scanner.nextDouble();

		double soma = num + num2;
		double sub = num - num2;
		double div = num / num2;
		double mult = num * num2;

		if (operador.equals("+")) {
			System.out.println("Valor da soma: " + soma);
		
		}
		
		if (operador.equals("-")) {
			System.out.println("Valor da subtra��o: " + sub);
		}
		
		if (operador.equals("/")) {
			System.out.println("Valor da divis�o: " + div);
		}
		
		if (operador.equals("*")) {
			System.out.println("Valor da multiplica��o: " + mult);
		}
		scanner.close();

	}
}
