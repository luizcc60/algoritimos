package exercicio02;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Dig. um n�mero qualquer: ");
		num = scanner.nextInt();

		if(num%3==1){
			System.out.println("O valor digitado � impar");
		}else{
			System.out.println("O valor digitado � par");
		}
		scanner.close();

	}
}

