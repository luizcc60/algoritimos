package exercicio04;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Dig. um n�mero qualquer: ");
		num = scanner.nextInt();
		
		int num2;
		System.out.println("Dig. outro n�mero qualquer: ");
		num2 = scanner.nextInt();
		
		if(num % 7==0 & num2 % 7==0){
			System.out.println("Os dois n�meros s�o m�ltiplos de 7");
		}else{
			System.out.println("Os dois n�meros n�o s�o m�ltiplos de 7");
		}
		scanner.close();

	}
}

