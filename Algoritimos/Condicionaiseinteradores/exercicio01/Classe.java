package exercicio01;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Dig. um n�mero qualquer: ");
		num = scanner.nextInt();

		if(num>10){
			System.out.println("O valor digitado � maior que 10");
		}else{
			System.out.println("O valor digitado � menor que 10");
		}
		scanner.close();

	}
}


