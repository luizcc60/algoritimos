package exercicioscannerr18;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite um n�mero:");
		num = scanner.nextInt();
	
		int soma = num - 5;
		System.out.println("O que voc� digitou subtraido por 5 �: "+soma);
		int soma2 = num - 3;
		System.out.println("O que voc� digitou subtraido por 3 �: "+soma2);
		
		scanner.close();
		
	}

}
