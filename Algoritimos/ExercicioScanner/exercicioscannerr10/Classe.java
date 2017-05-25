package exercicioscannerr10;

import java.util.Scanner;

	public class Classe {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

			int num;
			System.out.println("Digite o primeiro número : ");
			num = scanner.nextInt();
			System.out.println("Resultado ao quadrado: " +num*num);
			
			int num2;
			System.out.println("Digite o segundo número : ");
			num2 = scanner.nextInt();
			System.out.println("Resultado ao Quadrado: " +num2*num2);
			
			scanner.close();
			
			
		}
			
		
			
			
	}

	

