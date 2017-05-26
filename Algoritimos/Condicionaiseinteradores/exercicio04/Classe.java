package exercicio04;

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
		
		if(num % 7==0 & num2 % 7==0){
			System.out.println("Os dois números são múltiplos de 7");
		}else{
			System.out.println("Os dois números não são múltiplos de 7");
		}
		scanner.close();

	}
}

