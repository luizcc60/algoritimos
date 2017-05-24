package exercicioscannerr13;

import java.util.Scanner;

public class ClasseD {

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
		int num4;
		System.out.println("Digite 4º número");
		num4 = scanner.nextInt();

		int soma = num + num2 + num3 + num4;
		if(soma>10){
			System.out.println("False");
		}else{
			System.out.println("True");
		}
		scanner.close();
	}
}
