package exercicioscanner7;

import java.util.Scanner;


public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Digite o primeiro número inteiro: ");
		num = scanner.nextInt();
		
		int num2;
		System.out.println("Digite o número para divisão: ");
		num2 = scanner.nextInt();
		scanner.close();
		
		double sub = num / num2;
		
			System.out.println(sub);
			if(sub % 2 == 0)
			System.out.println("True");
			else
			System.out.println("False");
		
			}
							
	

}

