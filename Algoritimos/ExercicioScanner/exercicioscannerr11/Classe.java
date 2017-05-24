package exercicioscannerr11;

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
		int resto = num % num2;
		int resultado = resto*10;
		System.out.println(resultado);
		
		scanner.close();
		
		}

		
	}

