package exercicio14;


import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a;
		System.out.println("Salário (R$)");
		a = scanner.nextDouble();

		double b = 0;
		double c = 0.5 * a;
		double d = 0.35 * a;
		

		if (a < 20){
			b = a+c;
		} else if (a>20){
			b = a-d;
		}
		

			System.out.println("O salário liq. é: " + b);

			scanner.close();
		}
	}

		