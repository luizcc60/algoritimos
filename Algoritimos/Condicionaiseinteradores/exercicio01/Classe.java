package exercicio01;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		System.out.println("Dig. um número qualquer: ");
		num = scanner.nextInt();

		if(num>10){
			System.out.println("O valor digitado é maior que 10");
		}else{
			System.out.println("O valor digitado é menor que 10");
		}
		scanner.close();

	}
}


