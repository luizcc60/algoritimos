package exercicio03;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Dig. um número qualquer: ");
		num = scanner.nextInt();
		
		int num2;
		System.out.println("Dig. outro número qualquer: ");
		num2 = scanner.nextInt();
		
		int mult = num*num2;

		if(mult % 5==0){
			System.out.println("É multiplo de 5");
		}else{
			System.out.println("O resultado não foi o esperado");
		}
		scanner.close();

	}
}

