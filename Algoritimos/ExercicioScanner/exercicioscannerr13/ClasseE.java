package exercicioscannerr13;

import java.util.Scanner;

public class ClasseE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um n�mero:");
		num = scanner.nextInt();
		int num2;
		System.out.println("Digite 2� n�mero:");
		num2 = scanner.nextInt();
		int num3;
		System.out.println("Digite 3� n�mero");
		num3 = scanner.nextInt();
		int num4;
		System.out.println("Digite 4� n�mero");
		num4 = scanner.nextInt();
		int soma = num2 + num4;

		if(num>10 | num3>0 | soma ==0){
			System.out.println("False");
		}else{
			System.out.println("True");
		}
		scanner.close();
	}
}