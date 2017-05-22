package exercicioscannerr12;

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
		int num3;
		System.out.println("Digite 3° número");
		num3 = scanner.nextInt();
		
		int mult = num*num3;
		int soma = mult + (num2*num2*num2);
		System.out.print(soma);
	
		
		
		scanner.close();
	}
}
