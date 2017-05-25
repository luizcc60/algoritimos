package exercicioscannerr18;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
	
		int soma = num - 5;
		System.out.println("O que você digitou subtraido por 5 é: "+soma);
		int soma2 = num - 3;
		System.out.println("O que você digitou subtraido por 3 é: "+soma2);
		
		scanner.close();
		
	}

}
