package exercicio13;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a;
		System.out.println("Salário (R$)");
		a = scanner.nextDouble();

		double b;
		double c = 0.2 * a;
		double d = 0.25 * a;
		double e = 0.3 * a;

		if (a <= 600){
			b = a;
		} else if (a > 600 & a <= 1200){
			b = a - c;
		} else if (a > 1200 & a <= 2000){
			b = a - d;
		} else {
			b = a - e;
		}

			System.out.println("O salário liq. é: " + b);

			scanner.close();
		}
	}

		
		
				
		
		
	
		