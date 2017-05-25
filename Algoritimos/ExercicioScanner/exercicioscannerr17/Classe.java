package exercicioscannerr17;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um número:");
		num = scanner.nextInt();
	
		int soma = num + 5;
		System.out.println("O que você digitou somado com 5 é: "+soma);
		int soma2 = soma+5;
		System.out.println("O resultado anterior mais 5 novamente é: "+soma2);
		scanner.close();
		
	}

}
