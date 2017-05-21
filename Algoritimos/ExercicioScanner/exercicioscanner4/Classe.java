package exercicioscanner4;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);

			int num;
			System.out.println("Digite o primeiro número inteiro: ");
			num = scanner.nextInt();
			
			int num2;
			System.out.println("Digite o segundo número inteiro: ");
			num2 = scanner.nextInt();
			scanner.close();
			
			boolean comp = num >= num2;
			System.out.println(comp);

			
		}

	

}
